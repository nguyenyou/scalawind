/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./out/myapp/fastLinkJS.dest/**/*.js",
    "./pages/**/*.js",
  ],
  theme: {
    extend: {
      colors: {
        background: "var(--background)",
        foreground: "var(--foreground)",
      },
    },
  },
  plugins: [],
};
