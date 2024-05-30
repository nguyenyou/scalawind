const colors = require("tailwindcss/colors");

/** @type {import('tailwindcss').Config} */
module.exports = {
  content: {
    files: ['./index.html', './target/scalajs-modules/**/*.js'],
  },
  theme: {
    colors: {
      transparent: "transparent",
      current: "currentColor",
      black: colors.black,
      white: colors.white,
      red: colors.red,
    },
    extend: {
      colors: {
        primary: '#DE3423',
        secondary: ' #380d09'
      },
    },
  },
  corePlugins: [
    'display',
    'textColor',
    'width',
    'height',
    'alignItems',
    'justifyContent',
    'padding',
    'backgroundColor'
  ]
};