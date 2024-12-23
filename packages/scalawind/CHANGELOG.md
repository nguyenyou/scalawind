# scalawind

## 1.0.3

### Patch Changes

- 9b90689: add support for camelCase

## 1.0.2

### Patch Changes

- 96c7c7d: add try-catch for transform scala source

## 1.0.1

### Patch Changes

- 5f72dfe: refactor code to use pipe pattern for transform source

## 1.0.0

### Major Changes

- b08adb5: # Release 1.0

  ## Scala Source Transform

  Previously, we need to configure Tailwind to scan the compiled JS files for extracting Tailwind classes. We have to do that because Tailwind doesn't understand our syntax. In this major release, we provide a transform source method to transform our Scala code into Tailwind classes so that Tailwind can understand and generate corresponding CSS classes.

  ```js
  const { scalaSourceTransform } = require("scalawind/dist/transform");

  /** @type {import('tailwindcss').Config} */
  module.exports = {
    content: {
      files: ["./index.html", "./src/**/*.scala"],
      transform: scalaSourceTransform,
    },
  };
  ```

  ## Laminar Supports

  We now have a more Laminar way for conditional styling.

  ### Signal[Boolean]

  ```scala
  div(
    tw.flex.items_center <-- booleanSignal
  )
  ```

  ### Boolean

  ```scala
  div(
    tw.flex.items_center := boolean
  )
  ```

## 0.9.4

### Patch Changes

- 0f2ec98: remove unused code

## 0.9.3

### Patch Changes

- c3d6e75: minor update macro

## 0.9.2

### Patch Changes

- c3e11ec: fix commander flag name

## 0.9.1

### Patch Changes

- 9cf591d: fix correct command flag value type

## 0.9.0

### Minor Changes

- 56551b5: allow turn off arbitrary, opacity color, negative color supports

## 0.8.11

### Patch Changes

- 38d32c6: prefer curly brace syntax

## 0.8.10

### Patch Changes

- 3b44335: prefer curly braces syntax

## 0.8.9

### Patch Changes

- ad3b292: remove redundant import

## 0.8.8

### Patch Changes

- d1452d6: fix framework flag should be string

## 0.8.7

### Patch Changes

- af5a149: fix framework flag

## 0.8.6

### Patch Changes

- 5da54db: implicit conversion for laminar and scalajs-react
- e8784c6: default framework is none

## 0.8.5

### Patch Changes

- 0c399e3: add daisy example

## 0.8.4

### Patch Changes

- 4873c98: remove comments of css method

## 0.8.3

### Patch Changes

- 5273f10: Added `css` method. This method is used in case the implicit conversion of the `sw` method doesn't work.

  Previously, using scalawind in Laminar requires us the wrap our chaining tailwind classes inside the `sw` macro so that it can be compiled. With this `css` method, we have one more option for this, so:

  ```scala
  div(
    cls := sw(tw.flex.items_center.justify_center)
  )

  // ↓ ↓ ↓ ↓ ↓ ↓

  div(
    cls := tw.flex.items_center.justify_center.css
  )
  ```

  I believe the new syntax is better, because we can keep writing and editing the code without worry about the boundary of the open&close parentheses.

## 0.8.2

### Patch Changes

- ebef136: improve method name for "per" and "dot" classes

## 0.8.1

### Patch Changes

- 42d72fb: separate check flags for duplication and optimization

## 0.8.0

### Minor Changes

- 805ea2a: add class optimization for padding and margin utilities

### Patch Changes

- 0fc14b3: refactor template, break the one big template into many smaller templates

## 0.7.5

### Patch Changes

- f95ab26: add import scala.language.implicitConversions

## 0.7.4

### Patch Changes

- da0b764: use scala 3 syntax
- 784e894: use scala3 syntax case class

## 0.7.3

### Patch Changes

- 2041738: add helper methods for scalajs-react

## 0.7.2

### Patch Changes

- fc293bf: add --laminar cli option for auto generate laminar helpers

## 0.7.1

### Patch Changes

- 77f2c06: add implicit conversion to sw inline method

## 0.7.0

### Minor Changes

- a771b7d: Cut the generated file size in half, really, roughly 50%

## 0.6.2

### Patch Changes

- 92b0caf: fix for modifiers start with a number

## 0.6.1

### Patch Changes

- af32c16: improve color opacity support

## 0.6.0

### Minor Changes

- 95f5937: add support for color opacity

## 0.5.7

### Patch Changes

- 78ab099: remove color opacity modifier, we will need to rework this feature

## 0.5.6

### Patch Changes

- fdd3562: percentage value now use the "per" word instead of the "$" dollar sign

## 0.5.5

### Patch Changes

- 620e144: rename TW to Tailwind, because of name conflict

## 0.5.4

### Patch Changes

- 41d1762: rename Tailwind to TW for short

## 0.5.3

### Patch Changes

- 004a8e6: update generated code more scala3 syntax

## 0.5.2

### Patch Changes

- 4693997: always support arbitrary values, previously user have to enable via flag

## 0.5.1

### Patch Changes

- ecbb9cd: fix the preview compiled result flag from previous refactor

## 0.5.0

### Minor Changes

- 4a527fe: refactor macro

## 0.4.1

### Patch Changes

- 13e49e9: refactor macro

## 0.4.0

### Patch Changes

- 9a608cd: Support arbitrary values

## 0.3.8

### Patch Changes

- 8003cee: add support for dot value, such as w-1.5
- 24d1d31: fix bug css doc cause code break

## 0.3.7

### Patch Changes

- d66629d: support arbitrary variant

## 0.3.6

### Patch Changes

- c341ffe: support color opacity

## 0.3.5

### Patch Changes

- 3a49bc3: support for class have slash like w-1/2

## 0.3.4

### Patch Changes

- 2b2e164: add raw method as an escape hatch

## 0.3.3

### Patch Changes

- 55a1a55: allow user config whether to show preview compiled result or not

## 0.3.2

### Patch Changes

- 6b9a4d5: add css doc

## 0.3.1

### Patch Changes

- a762fcb: refactor for unit testing purpose

## 0.3.0

### Minor Changes

- 1c079ec: major rewrite cli, now we can support .js, .mjs, .ts, .js tailwind config

## 0.2.3

### Patch Changes

- f06eadb: since we use scalawind everywhere in the codebase, these info might be annoying

## 0.2.2

### Patch Changes

- 22d60e4: remove implicit conversion sw to unify the API

## 0.2.1

### Patch Changes

- 46a8c48: rename to TwStyle to Tailwind

## 0.2.0

### Minor Changes

- 7de2a7d: remove runtime logic since we're all about compile-time

## 0.1.8

### Patch Changes

- e5a453f: allow user passing custom package name and output path

## 0.1.7

### Patch Changes

- d4904a3: remove unnecessary clx object, cause we're using a CLI for generating code.

## 0.1.6

### Patch Changes

- 5351d0c: npm readme

## 0.1.5

### Patch Changes

- 936baa2: remove unused code

## 0.1.4

### Patch Changes

- 1dbfb82: fix multi word modifier
- 270a669: add shortcut i for important modifier

## 0.1.3

### Patch Changes

- 5fb023a: fix important modifier

## 0.1.2

### Patch Changes

- 2686658: remove unreachable case

## 0.1.1

### Patch Changes

- ec0c8c1: fix template

## 0.1.0

### Minor Changes

- db4f771: implicit macro

## 0.0.17

### Patch Changes

- 2060c06: avoid conflict cls

## 0.0.16

### Patch Changes

- 8b8ed3a: remove percentage

## 0.0.15

### Patch Changes

- b15719a: clean up
