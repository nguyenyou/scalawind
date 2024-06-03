import fs from 'fs'

export function readFile(filepath) {
  return fs.readFileSync(filepath, "utf8")
}
export function writeFile(filepath, content) {
  return fs.writeFileSync(filepath, content, "utf8")
}
