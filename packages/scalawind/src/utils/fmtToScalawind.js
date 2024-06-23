const methodNamePattern = /^[a-zA-Z_][a-zA-Z0-9_]*$/;

function isValidMethodName(name) {
  return methodNamePattern.test(name);
}

export const fmtToScalawind = (s) => {
  const methodName = s.replace(/-/g, '_').replace(/^\@/, '$').replace(/%/, '')
  
  if(isValidMethodName(methodName)) {
    return methodName
  }

  return "\`"+ methodName + "\`"
};