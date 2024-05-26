import { defineConfig } from 'tsup';

export default defineConfig({
  entry: [
    'src/index.ts',
    'src/cli.ts',
  ],
  splitting: false,
  clean: true,
  platform: 'node',
  external: ['scalawind', 'tailwindcss'],
  format: ['cjs', 'esm'],
  target: 'esnext',
  dts: true,
});