import { expect, test } from 'bun:test'
import fs from 'fs'
import path from 'path'
import { generateContent } from '../../../src/generate'
import { tailwindConfig } from './config'
import { debugActual } from '../../test-utils'

test('basic test', () => {
  const actual = generateContent(tailwindConfig, "scalawind", false, true)
  debugActual(actual, "./basic.txt")
  const expected = fs.readFileSync(path.join(__dirname, "./expected.txt"), "utf8")
  expect(actual).toBe(expected)
})