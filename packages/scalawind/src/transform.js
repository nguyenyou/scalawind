
const PATTERNS = {
  TW: /tw(?:\s*\.(?:`[a-zA-Z0-9_/.]+`|[a-zA-Z0-9_¥#/€\[\]§⌇"]+)|\s*\((?:[^)(]+|\((?:[^)(]+|\((?:[^)(]+|\((?:[^)(]+|\((?:[^)(]+|\((?:[^)(]+|\([^)(]*\))*\))*\))*\))*\))*\))*\))+/g,
  TW_REPLACE: /tw\.|\.|_|`|§|"/g,
  MULTILINE: /\n\s+(?=(?:[^"]*"[^"]*")*[^"]*$)/g,
  BACKTICK: /`([^`]*)`/g,
  ARBITRARY: /_\(("[^"]+")?\)/g,
  OPACITY: /\$\("([^"]+)"?\)/g,
  VARIANT_TRANSFORM: /variant\("([^"]+)",\s*(tw\.[^)]+)\)/g,
};

const REPLACEMENTS = {
  'tw.': '',
  '.': ' ',
  '_': '-',
  '`': '',
  '§': '.',
  '"': '',
};

function replaceSpecialCases(source) {
  return source.replace(/_2xl/g, '2xl');
}

function handleArbitraryValues(source) {
  return source.replace(PATTERNS.ARBITRARY, (match, content) => {
    if (content) {
      return '_¥' + content.replace(/_/g, '⌇') + '¥';
    }
    return match;
  });
}

function handleOpacityValues(source) {
  return source.replace(PATTERNS.OPACITY, (match, content) => {
    if (content) {
      content = content.replace(/\./g, '§');
      return '/€' + content + '€';
    }
    return match;
  });
}

function handleVariantTransform(source) {
  return source.replace(PATTERNS.VARIANT_TRANSFORM, (match, selector, content) => {
    const safeSelector = selector.replace(/[().]/g, char => ({
      '(': '《',
      ')': '》',
      '.': '§'
    })[char]);
    return `[${safeSelector}](${content})`;
  });
}

function flattenClasses(twString) {
  const classes = [];
  const stack = [];
  let currentClass = "";

  for (const char of twString) {
    if (char === "(") {
      if (currentClass) {
        stack.push(currentClass);
        currentClass = "";
      }
    } else if (char === ")") {
      if (currentClass) {
        classes.push(`${stack.join(":")}:${currentClass}`);
        currentClass = "";
      }
      stack.pop();
    } else if (char === " ") {
      if (currentClass) {
        classes.push(stack.length ? `${stack.join(":")}:${currentClass}` : currentClass);
        currentClass = "";
      }
    } else {
      currentClass += char;
    }
  }

  if (currentClass) {
    classes.push(stack.length ? `${stack.join(":")}:${currentClass}` : currentClass);
  }

  return classes.join(" ")
    .replace(/¥([^¥]+)¥/g, '[$1]')
    .replace(/€([^€]+)€/g, '$1')
    .replace(/important:|《|》|raw:|⌇/g, match => ({
      'important:': '!',
      '《': '(',
      '》': ')',
      'raw:': '',
      '⌇': '_'
    })[match])
}

function preprocessSource(source) {
  try {
    let processed = replaceSpecialCases(source);
    processed = handleArbitraryValues(processed);
    processed = handleOpacityValues(processed);
    return processed;
  } catch (error) {
    console.error('Error preprocessing source:', error);
    throw error;
  }
}

function extractTw(source) {
  try {
    const preprocessed = preprocessSource(source);
    const matches = preprocessed.match(PATTERNS.TW);

    if (!matches) {
      return [];
    }

    return matches.map(match => {
      return flattenClasses(handleVariantTransform(match).replace(PATTERNS.MULTILINE, '').replace(PATTERNS.BACKTICK, (_, content) => {
        return '`' + content.replace(/\./g, '§') + '`';
      }).replace(PATTERNS.TW_REPLACE, match => REPLACEMENTS[match]));
    });
  } catch (error) {
    console.error('Error extracting tw:', error);
    throw error;
  }
}

export function transformSource(source) {
  try {
    return extractTw(source).join(" ");
  } catch (error) {
    console.error('Error transforming source:', error);
    throw error;
  }
}

export const scalaSourceTransform = {
  scala: (content) => {
    return transformSource(content)
  }
}
