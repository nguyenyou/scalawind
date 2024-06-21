---
"scalawind": patch
---

Added `css` method. This method is used in case the implicit conversion of the `sw` method doesn't work.

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