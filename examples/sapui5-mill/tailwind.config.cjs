/** @type {import('tailwindcss').Config} */
module.exports = {
  content: {
    files: [
      './index.html', 
      './out/myapp/fastLinkJS.dest/**/*.js', 
      './out/myapp/fullLinkJS.dest/**/*.js'
    ],
  },
};