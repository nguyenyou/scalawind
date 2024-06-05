/** @type {import('tailwindcss').Config} */
module.exports = {
  content: {
    files: ['./index.html', './scalajs-modules/**/*.js'],
  },
  theme: {
    extend: {
      colors: {
        background: "var(--background)",
        foreground: "var(--foreground)",
      },
      fontFamily: {
        sans: ["Inter"],
        mono: ["Roboto Mono"],
      },
    },
  },
};