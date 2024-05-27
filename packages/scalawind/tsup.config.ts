import { defineConfig } from 'tsup';
import fs from "fs-extra";
import chalk from "chalk";
import { createRequire } from 'module';

export default defineConfig({
  entry: [
    'src/index.ts',
    'src/cli.ts',
  ],
  splitting: false,
  clean: true,
  platform: 'node',
  external: ['tailwindcss'],
  format: ['cjs', 'esm'],
  target: 'esnext',
  dts: true,
  onSuccess: async () => {
    // start time
    const start = Date.now();
    await fs.copy("src/templates", "dist/templates");
    console.log(
      chalk.hex("#7c5cad")("TEMPLATES"),
      "copied in",
      chalk.green(`${Date.now() - start}ms`)
    );
  }
});