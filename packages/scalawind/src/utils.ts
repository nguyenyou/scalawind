// Credit: https://github.com/Mokshit06/typewind/blob/main/packages/typewind/src/utils.ts

import path from 'path';
import resolveConfig from 'tailwindcss/resolveConfig.js';
import { createContext } from 'tailwindcss/lib/lib/setupContextUtils.js';
import fs from 'fs';

export function loadConfig(): {
  configPath: string;
  packageName: string;
  outputPath: string;
} {
  const pkg = require(path.join(process.cwd(), 'package.json'));

  return {
    configPath: './tailwind.config.js',
    packageName: 'scalawind',
    outputPath: './scalawind.scala',
    ...pkg?.scalawind,
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
    'No tailwind config file found!\nIf your tailwind config file is not on the same folder'
  );
}

export function createScalawindContext() {
  const configFile = getConfigPath();
  const userConfig = resolveConfig(require(configFile!));
  return createContext(userConfig);
}
