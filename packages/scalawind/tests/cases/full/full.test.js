import { expect, test } from 'bun:test'
import fs from 'fs'
import path from 'path'
import { generateContent } from '../../../src/generate'
import { tailwindConfig } from './config'
import * as utils from '../../test-utils'

test('full config test', () => {
  const actual = generateContent(tailwindConfig, "scalawind", true)
  const filepath = path.join(__dirname, "./expected.txt")
  // utils.writeFile(filepath, actual)
  const expected = utils.readFile(filepath)
  expect(actual).toBe(expected)
})