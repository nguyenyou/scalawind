import chalk from "chalk"

const prefix = "Scalawind CLI 🎉: "

export const logger = {
  error(...args) {
    console.log(prefix + chalk.red(...args))
  },
  warn(...args) {
    console.log(prefix + chalk.yellow(...args))
  },
  info(...args) {
    console.log(prefix + chalk.cyan(...args))
  },
  success(...args) {
    console.log(prefix + chalk.green(...args))
  },
  break() {
    console.log("")
  },
}
