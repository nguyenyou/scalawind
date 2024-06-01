import fs from 'fs'

export function writeToDisk(path, content) {
  fs.writeFileSync(path, content, 'utf8');
}