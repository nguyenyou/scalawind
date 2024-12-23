export function toCamelCase(methodName) {
    // if method name is in shape w_1/2
    const percentRegex = /[a-z]_([0-9]+\/[0-9]+)/g
    const dotRegex = /[a-z]_([0-9]+\.[0-9]+)/g
    if (percentRegex.test(methodName) || dotRegex.test(methodName)) {
        return methodName
    }
    let hasLeadingUnderscore = methodName.startsWith('_')
    // if method name is leading with underscore, preserve it and transform the rest
    if (hasLeadingUnderscore) {
        methodName = methodName.slice(1)
    }

    methodName = methodName.replace(/_([a-z])/g, (match, letter) => {
        return letter.toUpperCase()
    })

    methodName = methodName.replace(/_([0-9])/g, "$1")

    if (hasLeadingUnderscore) {
        methodName = "_" + methodName
    }

    return methodName
}