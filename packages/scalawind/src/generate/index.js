import resolveConfig from 'tailwindcss/resolveConfig';
import { createContext } from 'tailwindcss/lib/lib/setupContextUtils';
import fs from 'fs'
import path from 'path'
import { createDoc } from './createDoc'

import Handlebars from "handlebars";

const scalawindTemplate = fs.readFileSync(path.join(__dirname, "./templates/scalawind.hbs"), "utf-8")

const template = Handlebars.compile(scalawindTemplate);

export function generateContent(userConfig, packageName = "scalawind", previewCompliedResult = false) {
  const resolvedConfig = resolveConfig(userConfig);
  const ctx = createContext(resolvedConfig);

  const classList = ctx.getClassList()
  const tailwindConfig = ctx.tailwindConfig
  const candidateRuleMap = ctx.candidateRuleMap
  const variantMap = ctx.variantMap

  const flatColorsList = [];

  for (const [k, v] of Object.entries(tailwindConfig.theme.colors)) {
    if (typeof v === 'object') {
      for (const col in v) {
        flatColorsList.push(k + '-' + col);
      }
    } else {
      flatColorsList.push(k);
    }
  }

  const classesWithCandidateItem = [...new Set(classList)].map((s) => {
    return [s, getCandidateItem(candidateRuleMap, s)];
  });

  const colorSet = new Set();

  const standard = [...new Set(classesWithCandidateItem)].map(([s, { rule: rules, rest }]) => {
    let css = '';

    if (rules) {
      for (const rule of rules) {
        const [info, ruleOrFn] = rule;

        if (typeof ruleOrFn === 'function') {
          const types = info.options.types;
          const isColor = types.some(
            (t) => t.type == 'color'
          );

          if (isColor && rest && flatColorsList.includes(rest)) {
            const key = fmtToScalawind(s) + '$';

            colorSet.add(key);
          }

          const [ruleSet] = ruleOrFn(rest ?? 'DEFAULT', {});
          if (ruleSet) {
            css += fmtRuleToCss(ruleSet);
          }
        }
        if (typeof ruleOrFn == 'object') {
          css += fmtNode(ruleOrFn) + '\n';
        }
      }
    }

    return { prop: fmtToScalawind(s), raw: s, doc: createDoc(css) };
  })

  const modifiers = [...variantMap.keys()]
  // Remove * from the list of modifiers to avoid syntax error
  .filter((s) => s !== '*')
  .map((s) => {
    s = /^\d/.test(s) ? `_${s}` : s;

    const mod = fmtToScalawind(s);
    return ({ name: mod, value: mod})
  })

  const generatedScalawind = template({ package: packageName, modifiers, standard, previewCompliedResult })

  return generatedScalawind
}

const fmtToScalawind = (s) => s.replace(/-/g, '_').replace(/^\@/, '$').replace(/%/, '').replace(/\//, '$').replace(/\./, 'dot');

function getCandidateItem(
  map,
  name,
  rest = undefined
) {
  let rule = map.get(name);

  if (!rule && name.includes('-')) {
    const arr = name.split('-');
    const key = arr.slice(0, arr.length - 1).join('-');
    return getCandidateItem(
      map,
      key,
      [arr[arr.length - 1], rest].filter(Boolean).join('-')
    );
  }

  return { rule, rest };
}


function fmtRuleset(rule) {
  return (
    '{' +
    Object.entries(rule)
      .map(([prop, value]) => {
        if (!value) return '';
        if (typeof value === 'object') return `${prop} ${fmtRuleset(value)}`;

        return `${prop}: ${value}`;
      })
      .join(';') +
    '}'
  );
}

function fmtNode(node) {
  if (node.type === 'atrule') {
    return `\\@${node.name} ${node.params} {${node.nodes
      .map(fmtNode)
      .join('')}}`;
  }
  if (node.type === 'decl') {
    return `${node.prop}: ${node.value};`;
  }
  if (node.type === 'rule') {
    return `${node.selector} {${node.nodes.map(fmtNode).join('')}}`;
  }
}

function fmtRuleToCss(ruleSet) {
  const selector = Object.keys(ruleSet)[0];
  return `${selector} ${fmtRuleset(ruleSet[selector])}`;
}

export function writeToDisk(path, content) {
  fs.writeFileSync(path, content, 'utf8');
}

export default function generate(userConfig, options) {
  const { packageName, output, previewCompliedResult } = options
  const content = generateContent(userConfig, packageName, previewCompliedResult)
  writeToDisk(output, content)
}