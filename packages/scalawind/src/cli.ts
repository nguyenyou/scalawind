#!/usr/bin/env node

// Credit: https://github.com/Mokshit06/typewind/blob/main/packages/typewind/src/cli.ts

import fs from 'fs';
import path from 'path';
import { createScalawindContext, loadConfig } from './utils';

import Handlebars from "handlebars";

const scalawindTemplate = fs.readFileSync(path.join(__dirname, "./templates/scalawind.hbs"), "utf-8")

const template = Handlebars.compile(scalawindTemplate);

const fmtToScalawind = (s: string) => s.replace(/-/g, '_').replace(/^\@/, '$').replace(/%/, '');

function getCandidateItem(
  map: Map<string, any>,
  name: string,
  rest: string | undefined = undefined
): { rule: any; rest: string | undefined } {
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

export async function generateTypes() {
  const ctx = createScalawindContext();

  const classList = ctx.getClassList() as string[];

  const flatColorsList: string[] = [];

  for (const [k, v] of Object.entries(ctx.tailwindConfig.theme.colors)) {
    if (typeof v === 'object') {
      for (const col in v) {
        flatColorsList.push(k + '-' + col);
      }
    } else {
      flatColorsList.push(k);
    }
  }

  const classesWithStandardSyntax = classList.filter((s) => !/\.|\//.test(s));
  const classesWithCandidateItem = [...new Set(classesWithStandardSyntax)].map((s) => {
    return [s, getCandidateItem(ctx.candidateRuleMap, s)] as const;
  });

  const colorSet = new Set<string>();
  const standard = [...new Set(classesWithCandidateItem)].map(([s, { rule: rules, rest }]) => {
    let css = '';

    if (rules) {
      for (const rule of rules) {
        const [info, ruleOrFn] = rule;

        if (typeof ruleOrFn === 'function') {
          const types = info.options.types;
          const isColor = types.some(
            (t: Record<string, string>) => t.type == 'color'
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

    return { prop: fmtToScalawind(s), raw: s, type: 'Property', doc: css };
  })
  
  const modifiers = [...ctx.variantMap.keys()]
  // Remove * from the list of modifiers to avoid syntax error
  .filter((s) => s !== '*')
  .map((s) => {
    s = /^\d/.test(s) ? `_${s}` : s;

    return fmtToScalawind(s);
  })
  .map(mod => {
    return ({ name: mod, value: mod.replace(/_/g, '-')})
  })

  const config = loadConfig();


  const generatedScalawind = template({ package: config.packageName, modifiers, standard})
  const outputPath = path.join(process.cwd(), config.outputPath);

  fs.writeFileSync(
    outputPath,
    generatedScalawind,
    'utf8'
  );
}

function fmtRuleset(rule: any) {
  return (
    '{' +
    Object.entries(rule)
      .map(([prop, value]): any => {
        if (!value) return '';
        if (typeof value === 'object') return `${prop} ${fmtRuleset(value)}`;

        return `${prop}: ${value}`;
      })
      .join(';') +
    '}'
  );
}

function fmtNode(node: any) {
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

function fmtRuleToCss(ruleSet: any) {
  const selector = Object.keys(ruleSet)[0];
  return `${selector} ${fmtRuleset(ruleSet[selector])}`;
}

generateTypes().catch((err) => {
  console.error(err);
  process.exit(1);
});
