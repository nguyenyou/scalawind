import jitiFactory from 'jiti'
import { transform } from '@swc/core'

let jiti = null
function lazyJiti() {
  // @ts-expect-error SWC's transform function should be compatible
  return jiti ?? (jiti = jitiFactory(__filename, { interopDefault: true, transform }))
}

export function loadConfig(path) {
  try {
    return path ? require(path) : {}
  } catch {
    return lazyJiti()(path)
  }
}