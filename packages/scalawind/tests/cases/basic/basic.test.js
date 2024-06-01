import { expect, test } from 'vitest'
import fs from 'fs'
import path from 'path'
import { generateContent } from '../../../src/generate'
import { tailwindConfig } from './config'

test('basic test', () => {
  const actual = generateContent(tailwindConfig, "scalawind")
  const expected = fs.readFileSync(path.join(__dirname, "./expected.txt"), "utf8")
  expect(actual).toBe(expected)
})