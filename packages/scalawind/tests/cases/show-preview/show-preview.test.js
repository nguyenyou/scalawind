import { expect, test } from 'bun:test'
import fs from 'fs'
import path from 'path'
import { generateContent } from '../../../src/generate'
import { tailwindConfig } from './config'

test('show preview compiled', () => {
  const actual = generateContent(tailwindConfig, "scalawind", true)
  const expected = fs.readFileSync(path.join(__dirname, "./expected.txt"), "utf8")
  expect(actual).toBe(expected)
})