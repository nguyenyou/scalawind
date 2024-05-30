/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./target/scalajs-modules/**/*.js",
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
