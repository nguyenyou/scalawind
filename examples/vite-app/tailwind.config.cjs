/** @type {import('tailwindcss').Config} */
module.exports = {
  content: {
    files: ['./index.html', './scalajs-modules/**/*.js'],
  },
  theme: {
    extend: {
      colors: {
        primary: '#DE3423',
      },
    },
  },
};