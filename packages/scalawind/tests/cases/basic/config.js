const colors = require('tailwindcss/colors')

/** @type {import('tailwindcss').Config} */
export const tailwindConfig = {
  theme: {
    colors: {
      black: '#000',
      red: colors.red
    }
  },
  corePlugins: [
    'textColor',
    'container',
    'animation',
    'width',
    'margin'
  ]
};