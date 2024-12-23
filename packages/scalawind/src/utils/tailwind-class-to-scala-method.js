import { toCamelCase } from "./to-camel-case";

const methodNamePattern = /^[a-zA-Z_][a-zA-Z0-9_]*$/;

function isValidMethodName(name) {
  return methodNamePattern.test(name);
}

export const tailwindClassToScalaMethod = (s, camelCase = false) => {
  let methodName = s.replace(/-/g, '_').replace(/^\@/, '$').replace(/%/, '')

  if(camelCase) {
    methodName = toCamelCase(methodName)
  }

  if(isValidMethodName(methodName)) {
    return methodName
  }

  return "\`"+ methodName + "\`"
};