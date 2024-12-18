---
"scalawind": major
---

# Release 1.0

## Scala Source Transform

Previously, we need to configure Tailwind to scan the compiled JS files for extracting Tailwind classes. We have to do that because Tailwind doesn't understand our syntax. In this major release, we provide a transform source method to transform our Scala code into Tailwind classes so that Tailwind can understand and generate corresponding CSS classes.

```js
const { scalaSourceTransform } = require("scalawind/dist/transform");

/** @type {import('tailwindcss').Config} */
module.exports = {
  content: {
    files: ["./index.html", "./src/**/*.scala"],
    transform: scalaSourceTransform,
  }
}

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
