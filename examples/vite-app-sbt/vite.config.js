import { defineConfig } from 'vite';
export default defineConfig({
  plugins: [
  ],
  resolve: {
    alias: [
      {
        find: /^scalajs:(.*)$/,
        replacement: `/target/scalajs-modules/$1`
      }
    ]
  },
});