import path from 'path';
import resolveConfig from 'tailwindcss/resolveConfig.js';
// @ts-ignore
import pkg from 'tailwindcss/lib/lib/setupContextUtils.js';
const { createContext } = pkg
import fs from 'fs';

export function loadConfig(): {
  configPath: string;
  showPixelEquivalents: boolean;
  rootFontSize: number;
} {
  return {
    configPath: './tailwind.config.js',
    showPixelEquivalents: false,
    rootFontSize: 16,
  };
}

function getConfigPath() {
  const config = loadConfig();

  for (const configFile of [
    config.configPath,
    './tailwind.config.js',
    './tailwind.config.cjs',
  ]) {
    try {
      const configPath = path.join(process.cwd(), configFile);
      fs.accessSync(configPath);
      return configPath;
    } catch (err) {}
  }

  throw new Error(
    'No tailwind config file found!\nIf your tailwind config file is not on the same folder. You need to specify your path though --input option.'
  );
}

export async function getTypewindContext() {
  const configFile = getConfigPath();
  const config = await import(configFile)
  const fullConfig = resolveConfig(config);
  return createContext(fullConfig)
}
