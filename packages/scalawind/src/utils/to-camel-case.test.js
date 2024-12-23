import { expect, test } from 'bun:test'
import { toCamelCase } from './to-camel-case'

test('format snake case to camel case', () => {
  expect(toCamelCase("text_red_500")).toBe("textRed500")
  expect(toCamelCase("items_center")).toBe("itemsCenter")
  expect(toCamelCase("h_")).toBe("h_")
  // percentage
  expect(toCamelCase("_2xl")).toBe("_2xl")
  // percentage
  expect(toCamelCase("w_1/2")).toBe("w_1/2")
  // negative cases
  expect(toCamelCase("_left_1")).toBe("_left1")
})