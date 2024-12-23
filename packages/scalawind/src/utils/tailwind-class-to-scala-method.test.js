import { expect, test } from 'bun:test'
import { tailwindClassToScalaMethod as fmt } from './tailwind-class-to-scala-method'

test('format to scalawind', () => {
  expect(fmt("text-red-500")).toBe("text_red_500")
  expect(fmt("width-1/2")).toBe("`width_1/2`")
  expect(fmt("height-1.5")).toBe("`height_1.5`")
})