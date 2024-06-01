import fs from 'fs'
import path from 'path'

export function debugActual(content) {
  fs.writeFileSync(path.join(__dirname, "./actual.txt"), content, "utf8")
}