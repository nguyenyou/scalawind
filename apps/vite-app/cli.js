#!/usr/bin/env node
"use strict";
var __create = Object.create;
var __defProp = Object.defineProperty;
var __getOwnPropDesc = Object.getOwnPropertyDescriptor;
var __getOwnPropNames = Object.getOwnPropertyNames;
var __getProtoOf = Object.getPrototypeOf;
var __hasOwnProp = Object.prototype.hasOwnProperty;
var __export = (target, all) => {
  for (var name in all)
    __defProp(target, name, { get: all[name], enumerable: true });
};
var __copyProps = (to, from, except, desc) => {
  if (from && typeof from === "object" || typeof from === "function") {
    for (let key of __getOwnPropNames(from))
      if (!__hasOwnProp.call(to, key) && key !== except)
        __defProp(to, key, { get: () => from[key], enumerable: !(desc = __getOwnPropDesc(from, key)) || desc.enumerable });
  }
  return to;
};
var __toESM = (mod, isNodeMode, target) => (target = mod != null ? __create(__getProtoOf(mod)) : {}, __copyProps(
  isNodeMode || !mod || !mod.__esModule ? __defProp(target, "default", { value: mod, enumerable: true }) : target,
  mod
));
var __toCommonJS = (mod) => __copyProps(__defProp({}, "__esModule", { value: true }), mod);
console.log("ahhaha")
// src/cli.ts
var cli_exports = {};
__export(cli_exports, {
  generateTypes: () => generateTypes
});
module.exports = __toCommonJS(cli_exports);
var import_fs2 = __toESM(require("fs"));
var import_path2 = __toESM(require("path"));
var import_lightningcss = require("lightningcss");

// src/utils.ts
var import_path = __toESM(require("path"));
var import_resolveConfig = __toESM(require("tailwindcss/resolveConfig.js"));
var import_setupContextUtils = require("tailwindcss/lib/lib/setupContextUtils.js");
var import_fs = __toESM(require("fs"));
function loadConfig() {
  const pkg = require(import_path.default.join(process.cwd(), "package.json"));
  return {
    configPath: "./tailwind.config.js",
    showPixelEquivalents: false,
    rootFontSize: 16,
    ...pkg?.typewind
  };
}
function getConfigPath() {
  const config = loadConfig();
  for (const configFile of [
    config.configPath,
    "./tailwind.config.js",
    "./tailwind.config.cjs"
  ]) {
    try {
      const configPath = import_path.default.join(process.cwd(), configFile);
      import_fs.default.accessSync(configPath);
      return configPath;
    } catch (err) {
    }
  }
  throw new Error(
    "No tailwind config file found!\nIf your tailwind config file is not on the same folder, check: https://typewind.dev/docs/installation/custom-config-file-path"
  );
}
function createTypewindContext() {
  const configFile = getConfigPath();
  // console.log('configFile', configFile)
  const userConfig = (0, import_resolveConfig.default)(require(configFile));
  console.log('write')
  console.log("userConfig", userConfig)
  return (0, import_setupContextUtils.createContext)(userConfig);
}

// src/cli.ts
function createDoc(doc) {
  try {
    let cssDoc = `
    * \`\`\`css
    * ${(0, import_lightningcss.transform)({
      filename: "doc.css",
      code: Buffer.from(doc)
    }).code.toString().replace(/\n/g, "\n    * ")}
    * \`\`\`
  `;
    const config = loadConfig();
    if (config.showPixelEquivalents) {
      const remMatch = doc.match(/-?[0-9.]+rem/g);
      const pxValue = config.rootFontSize;
      if (remMatch) {
        cssDoc = cssDoc.replace(
          /(-?[0-9.]+)rem/g,
          (match, p1) => `${match} /* ${parseFloat(p1) * pxValue}px *\u200B/`
        );
      }
    }
    return cssDoc;
  } catch (error) {
    return doc;
  }
}
var fmtToTypewind = (s) => s.replace(/-/g, "_").replace(/^\@/, "$");
var objectTemplate = (props) => {
  return `{${props.map(
    ({ prop, type, doc }) => `/** ${doc ? createDoc(doc) : ""} */ ${JSON.stringify(prop)}: ${type};`
  ).join("\n")}}`;
};
var typeTemplate = (name, props) => `
type ${name} = ${objectTemplate(props)}
`;
var rootTypeTemplate = ({
  others,
  types,
  modifiers,
  colors
}) => `type Property = Typewind & string;

${others.join("\n")}

type OpacityMap = {
  [K in Opacity]: Property;
} & Record<string, Property>;
type Colors = {
  ${colors.map((color) => `${color}: OpacityMap`).join(";\n")}
}

type Typewind = ${types.join(" & ")} & {
  ${modifiers.map((variant) => `${variant}(style: Property): Property`).join(";\n")}
} & {
  // [arbitraryVariant: string]: (style: Property) => Property;
} & {
  variant<T extends \`&\${string}\` | \`@\${string}\`>(variant: T, style: Property | string): Property;
  raw(style: string): Property;
}

declare const tw: Typewind;

export { tw };
`;
function getCandidateItem(map, name, rest = void 0) {
  let rule = map.get(name);
  if (!rule && name.includes("-")) {
    const arr = name.split("-");
    const key = arr.slice(0, arr.length - 1).join("-");
    return getCandidateItem(
      map,
      key,
      [arr[arr.length - 1], rest].filter(Boolean).join("-")
    );
  }
  return { rule, rest };
}
async function generateTypes() {
  const ctx = createTypewindContext();
  const classList = ctx.getClassList();
  import_fs2.default.writeFileSync(
    import_path2.default.join(require.resolve("typewind"), "../class.json"),
    JSON.stringify(classList),
    "utf8"
  );
  const opacityMap = ctx.tailwindConfig.theme.opacity;
  const flatColorsList = [];
  for (const [k, v] of Object.entries(ctx.tailwindConfig.theme.colors)) {
    if (typeof v === "object") {
      for (const col in v) {
        flatColorsList.push(k + "-" + col);
      }
    } else {
      flatColorsList.push(k);
    }
  }
  const classesWithStandardSyntax = classList.filter((s) => !/\.|\//.test(s));
  const classesWithCandidateItem = classesWithStandardSyntax.map((s) => {
    return [s, getCandidateItem(ctx.candidateRuleMap, s)];
  });
  const colorSet = /* @__PURE__ */ new Set();
  const standard = typeTemplate(
    "Standard",
    classesWithCandidateItem.map(([s, { rule: rules, rest }]) => {
      let css = "";
      if (rules) {
        for (const rule of rules) {
          const [info, ruleOrFn] = rule;
          if (typeof ruleOrFn === "function") {
            const types = info.options.types;
            const isColor = types.some(
              (t) => t.type == "color"
            );
            if (isColor && rest && flatColorsList.includes(rest)) {
              const key = fmtToTypewind(s) + "$";
              colorSet.add(key);
            }
            const [ruleSet] = ruleOrFn(rest ?? "DEFAULT", {});
            if (ruleSet) {
              css += fmtRuleToCss(ruleSet);
            }
          }
          if (typeof ruleOrFn == "object") {
            css += fmtNode(ruleOrFn) + "\n";
          }
        }
      }
      return { prop: fmtToTypewind(s), type: "Property", doc: css };
    })
  );
  const candidates = [...ctx.candidateRuleMap.entries()];
  const arbitraryStyles = [];
  for (const [name, rules] of candidates) {
    const ident = fmtToTypewind(name) + "_";
    const styles = [];
    for (const [rule, fn] of rules) {
      if (!rule.options || !rule.options.values || Object.keys(rule.options.values).length == 0)
        continue;
      styles.push(
        objectTemplate(
          Object.keys(rule.options.values).map((val) => {
            const [ruleSet] = fn(val, {});
            return {
              prop: val,
              type: "Property",
              doc: fmtRuleToCss(ruleSet)
            };
          })
        )
      );
    }
    arbitraryStyles.push({
      prop: ident,
      type: styles.join(" & ") + " & Record<string, Property>",
      doc: void 0
    });
  }
  const arbitrary = typeTemplate("Arbitrary", arbitraryStyles);
  const modifiers = [...ctx.variantMap.keys(), "important"].filter((s) => s !== "*").map((s) => {
    s = /^\d/.test(s) ? `_${s}` : s;
    return fmtToTypewind(s);
  });
  const root = rootTypeTemplate({
    others: [
      standard,
      arbitrary,
      `type Opacity = ${Object.keys(opacityMap).map((k) => JSON.stringify(k)).join(" | ")}`
    ],
    types: ["Standard", "Arbitrary", "Colors"],
    modifiers,
    colors: [...colorSet].map((k) => JSON.stringify(k))
  });
  import_fs2.default.writeFileSync(
    import_path2.default.join(require.resolve("typewind"), "../index.d.ts"),
    root,
    "utf8"
  );
}
function fmtRuleset(rule) {
  return "{" + Object.entries(rule).map(([prop, value]) => {
    if (!value)
      return "";
    if (typeof value === "object")
      return `${prop} ${fmtRuleset(value)}`;
    return `${prop}: ${value}`;
  }).join(";") + "}";
}
function fmtNode(node) {
  if (node.type === "atrule") {
    return `\\@${node.name} ${node.params} {${node.nodes.map(fmtNode).join("")}}`;
  }
  if (node.type === "decl") {
    return `${node.prop}: ${node.value};`;
  }
  if (node.type === "rule") {
    return `${node.selector} {${node.nodes.map(fmtNode).join("")}}`;
  }
}
function fmtRuleToCss(ruleSet) {
  const selector = Object.keys(ruleSet)[0];
  return `${selector} ${fmtRuleset(ruleSet[selector])}`;
}
generateTypes().catch((err) => {
  console.log("huhu")
  console.error(err);
  process.exit(1);
});
// Annotate the CommonJS export names for ESM import in node:
0 && (module.exports = {
  generateTypes
});
