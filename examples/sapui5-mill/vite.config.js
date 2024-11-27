import { defineConfig } from 'vite';

const isProd = process.env.NODE_ENV == "production";

export default defineConfig({
  resolve: {
    alias: [
      {
        find: /^scalajs:(.*)$/,
        replacement: `/out/myapp/${isProd ? 'full' : 'fast'}LinkJS.dest/$1`
      }
    ]
  }
});