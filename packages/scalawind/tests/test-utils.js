import fs from 'fs'
import path from 'path'

export function debugActual(content, filepath = "./actual.txt") {
  fs.writeFileSync(path.join(__dirname, filepath), content, "utf8")
}