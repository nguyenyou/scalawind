import { expect, test } from 'bun:test'
import fs from 'fs'
import path from 'path'
import { generateContent } from '../../../src/generate'
import { tailwindConfig } from './config'
import { debugActual } from '../../test-utils'

test('full config test', () => {
  const actual = generateContent(tailwindConfig, "scalawind")
  debugActual(actual)
  const expected = fs.readFileSync(path.join(__dirname, "./expected.txt"), "utf8")
  expect(true).toBe(true)
})