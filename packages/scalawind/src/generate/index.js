import resolveConfig from 'tailwindcss/resolveConfig';
import { createContext } from 'tailwindcss/lib/lib/setupContextUtils';
import fs from 'fs'
import path from 'path'
import { createDoc } from './createDoc'
import { tailwindClassToScalaMethod } from '../utils/tailwind-class-to-scala-method'

import Handlebars from "handlebars";

function readTemplate(filename) {
  return fs.readFileSync(path.join(__dirname, `./templates/${filename}.hbs`), "utf-8")
}

Handlebars.registerPartial({
  swMacro: Handlebars.compile(readTemplate('swMacro')),
  tailwind: Handlebars.compile(readTemplate('tailwind'), {noEscape: true}),
  laminar: Handlebars.compile(readTemplate('laminar')),
  scalajsReact: Handlebars.compile(readTemplate('scalajsReact')),
  classesValidation: Handlebars.compile(readTemplate('classesValidation')),
});

const template = Handlebars.compile(readTemplate('scalawind'));

function getImplicitConversionHelpers(framework) {
  switch (framework) {
    case "laminar":
      return { laminar: true, scalajsReact: false }
    case "scalajs-react":
      return { laminar: false, scalajsReact: true } 
    case "both":
      return { laminar: true, scalajsReact: true }  
    default:
      return { laminar: false, scalajsReact: false }
  }
}

export function generateContent(options) {
  const { userConfig, camelCase } = options
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

  const standard = [...new Set(classesWithCandidateItem)].filter(([methodName]) => {
    if(options.supportNegativeValue === "true") return true
    return !methodName.startsWith("-")
  }).map(([s, { rule: rules, rest }]) => {
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
            const key = tailwindClassToScalaMethod(s, camelCase) + '$';

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

    return { prop: tailwindClassToScalaMethod(s, camelCase), raw: s, doc: createDoc(css) };
  })

  const opacityColors = options.supportOpacityColor === "true" ? [...colorSet] : []

  const candidates = [...candidateRuleMap.entries()];
  const arbitrary = [];

  if(options.supportArbitrary === "true") {
    for (const [name] of candidates) {
      const ident = tailwindClassToScalaMethod(name, camelCase) + '_';
      // edge case, we don't want the *_ method
      if(ident === "*_" || ident === "`*`_") {
        continue
      }
  
      arbitrary.push({ methodName: ident, value: `${name}-`})
    }
  }

  const modifiers = [...variantMap.keys()]
  // Remove * from the list of modifiers to avoid syntax error
  .filter((s) => s !== '*')
  .map((s) => {
    s = /^\d/.test(s) ? `_${s}` : s;

    const mod = tailwindClassToScalaMethod(s, camelCase);
    return ({ name: mod, value: mod})
  })

  const hasValidation = options.checkDuplication || options.checkOptimization
  const generatedScalawind = template({ 
    modifiers, 
    standard, 
    arbitrary,
    opacityColors,
    hasValidation,
    ...(getImplicitConversionHelpers(options.framework)),
    camelCase,
    ...options,
    genDoc: options.genDoc === "true"
  })

  return generatedScalawind
}

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
  const content = generateContent({ userConfig, ...options })
  writeToDisk(options.output, content)
}