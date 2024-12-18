// Utility function for pipe pattern
const pipe =
  (...fns) =>
  (input) =>
    fns.reduce((result, fn) => fn(result), input);

// Patterns and replacements
const PATTERNS = {
  TW: /tw(?:\s*\.(?:`[a-zA-Z0-9_/.]+`|[a-zA-Z0-9_¥#/€\[\]§⌇"]+)|\s*\((?:[^)(]+|\((?:[^)(]+|\((?:[^)(]+|\((?:[^)(]+|\((?:[^)(]+|\((?:[^)(]+|\([^)(]*\))*\))*\))*\))*\))*\))*\))+/g,
  TW_REPLACE: /tw\.|\.|`|§|"/g,
  MULTILINE: /\n\s+(?=(?:[^"]*"[^"]*")*[^"]*$)/g,
  BACKTICK: /`([^`]*)`/g,
  ARBITRARY: /_\(("[^"]+")?\)/g,
  OPACITY: /\$\("([^"]+)"?\)/g,
  VARIANT_TRANSFORM: /variant\("([^"]+)",\s*(tw\.[^)]+)\)/g,
};

const REPLACEMENTS = {
  "tw.": "",
  ".": " ",
  "`": "",
  "§": ".",
  '"': "",
};

const flattenClasses = (twString) => {
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
        classes.push(
          stack.length ? `${stack.join(":")}:${currentClass}` : currentClass
        );
        currentClass = "";
      }
    } else {
      currentClass += char;
    }
  }

  if (currentClass) {
    classes.push(
      stack.length ? `${stack.join(":")}:${currentClass}` : currentClass
    );
  }

  return classes;
};

// Main function to extract and process TW
export const extractTw = (source, customClassTransformer = input => input) => {
  try {
    return pipe(
      (source) => source.replace(/_2xl/g, "2xl"),
      (source) =>
        source.replace(PATTERNS.ARBITRARY, (match, content) => {
          if (content) {
            return "_¥" + content.replace(/_/g, "⌇") + "¥";
          }
          return match;
        }),
      (source) =>
        source.replace(PATTERNS.OPACITY, (match, content) => {
          if (content) {
            content = content.replace(/\./g, "§");
            return "/€" + content + "€";
          }
          return match;
        }),
      (source) => source.match(PATTERNS.TW) || [],
      (matches) =>
        matches.flatMap((match) =>
          pipe(
            (source) =>
              source.replace(
                PATTERNS.VARIANT_TRANSFORM,
                (_, selector, content) => {
                  const safeSelector = selector.replace(
                    /[().]/g,
                    (char) =>
                      ({
                        "(": "《",
                        ")": "》",
                        ".": "§",
                      }[char])
                  );
                  return `[${safeSelector}](${content})`;
                }
              ),
            (source) => source.replace(PATTERNS.MULTILINE, ""),
            (source) =>
              source.replace(
                PATTERNS.BACKTICK,
                (_, content) => "`" + content.replace(/\./g, "§") + "`"
              ),
            (source) =>
              source.replace(PATTERNS.TW_REPLACE, (match) => REPLACEMENTS[match]),
            flattenClasses
          )(match)
        ),
      (classes) => [...new Set(classes)],
      (classes) => classes.map(cls => customClassTransformer(cls)),
      (classes) => classes.map(cls => cls.replace(/_/g, "-")),
      (classes) => classes.join(" "),
      (step) => step.replace(/¥([^¥]+)¥/g, "[$1]"),
      (step) => step.replace(/€([^€]+)€/g, "$1"),
      (step) =>
        step.replace(
          /important:|《|》|raw:|⌇/g,
          (match) =>
            ({
              "important:": "!",
              "《": "(",
              "》": ")",
              "raw:": "",
              "⌇": "_",
            }[match])
        )
    )(source);
  } catch (error) {
    console.error("Error extracting tw:", error);
    throw error;
  }
};

export function transformSource(source) {
  try {
    return extractTw(source);
  } catch (error) {
    console.error("Error transforming source:", error);
    throw error;
  }
}

export const scalaSourceTransform = {
  scala: (content) => {
    const transformed = transformSource(content)
    return `${content}
    
    ${transformed}
    `
  },
};
