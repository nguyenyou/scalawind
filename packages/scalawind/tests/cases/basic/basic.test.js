import { expect, test } from 'bun:test'
import path from 'path'
import { generateContent } from '../../../src/generate'
import * as utils from '../../test-utils'
import { tailwindConfig } from './config'

test('basic test', () => {
  const actual = generateContent({
    userConfig: tailwindConfig,
    packageName: "scalawind",
    previewCompliedResult: true,
    checkDuplication: true,
    checkOptimization: true,
    genDoc: "false",
    supportArbitrary: "false",
    supportOpacityColor: "false",
    supportNegativeValue: "false",
    framework: 'both',
  })
  const filepath = path.join(__dirname, "./expected.txt")
  // utils.writeFile(filepath, actual) // uncomment to update snapshot
  const expected = utils.readFile(filepath)
  expect(actual).toBe(expected)
})