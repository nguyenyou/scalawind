import { expect, test } from 'bun:test'
import path from 'path'
import { generateContent } from '../../../src/generate'
import { tailwindConfig } from './config'
import * as utils from '../../test-utils'

test('full config test', () => {
  const actual = generateContent({
    userConfig: tailwindConfig,
    packageName: "scalawind",
    previewCompliedResult: true,
    framework: "laminar",
    checkDuplication: false,
    checkOptimization: false,
  })
  const filepath = path.join(__dirname, "./expected.txt")
  // utils.writeFile(filepath, actual)
  const expected = utils.readFile(filepath)
  expect(actual).toBe(expected)
})