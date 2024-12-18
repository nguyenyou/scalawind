// THIS FILE IS FOR INTERNAL USAGE, PLEASE IGNORE THIS FILE

import { extractTw } from './transform';

function convertCamelCaseToSnakeCase(methodName) {
  const units = ["px", "pc", "vh", "tx"];

  const step1 = methodName.replace(/[A-Z]/g, match => `_${match.toLowerCase()}`);

  const step2 = step1.replace(/^([:a-z]+)([0-9]+)$/g, (match, p1, p2) => {
    if (units.includes(p1)) {
      return match;
    } else {
      return `${p1}_${p2}`;
    }
  });

  const step3 = step2.replace(/_([a-z]+)([0-9]+)/g, (match, p1, p2) => {
    if (units.includes(p1)) {
      return match;
    } else {
      return `_${p1}_${p2}`;
    }
  });

  return step3.toLowerCase();
}

function toSnakeCase(methodName) {
  if (/^px[0-9]+$/.test(methodName)) {
    return `px_${methodName.substring(2)}`;
  } else {
    return convertCamelCaseToSnakeCase(methodName);
  }
}

export function transformSource(source) {
  try {
    return extractTw(source, toSnakeCase);
  } catch (error) {
    console.error("Error transforming source:", error);
    throw error;
  }
}

export const scalaSourceTransform = {
  scala: (content) => transformSource(content),
};
