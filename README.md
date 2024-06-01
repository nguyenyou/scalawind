![Write typesafe Tailwindcss with Scalawind](https://raw.githubusercontent.com/nguyenyou/scalawind/main/.github/assets/banner.png 'Write typesafe Tailwindcss with Scalawind')

<p align="center">
  <br/>
  <a href="https://github.com/nguyenyou/scalawind">Scalawind</a> is a Zero-Runtime Typesafe Tailwindcss in Scala
  <br/><br/>
</p>

https://github.com/nguyenyou/scalawind/assets/38455472/5668b9bc-244c-4274-bf4c-dddade787fda

## Features

- ⚡️  Write faster with Fluent API
- 🚀 Thanks Scala 3 macros, we can completely eliminate runtime cost. Only strings present in the final compiled code. No function calls. No overhead.
- 🦄 Works with every UI libraries in ScalaJS ecosystem
- 🎨 Customizable via user's tailwind config
- 💪 Typesafe tailwindcss classes and autocomplete (via codegen)

<br/>

# Scalawind - Zero-Runtime Typesafe TailwindCSS in Scala

> Although this library is still very early, the actual code is just a single file generated and output directly into your project. You can twist it, fix it, make changes to it however you like. 

The idea is very simple, you can generate typesafe scala code from tailwind config file and use tailwind utility classes in a typesafe way.

```scala
import scalawind.*

val styles: String = sw(tw.bg_black.text_white.hover(tw.bg_white.text_black))

// ↓ ↓ ↓ ↓ ↓ ↓

val styles: String = "bg-black text-white hover:bg-white hover:text-black
```

We use fluent syntax to type our tailwind classes. These classes will be compiled at *compile-time* so there's no runtime cost for this.

The `sw` method is a macro that will transform the all the function calls into just one single literal string at *compile-time*.

## Quickstart

You can use [degit](https://github.com/Rich-Harris/degit) to clone the vite example that's already setup everything for you to get started.

```bash
$ npx degit nguyenyou/scalawind/examples/vite-app my-scalawind-app
```

https://github.com/nguyenyou/scalawind/assets/38455472/ed0dc006-a263-49be-a809-8a8c1c340ec1

There many examples for you to choose, you can take about at the examples folder. Pick one and replace `EXAMPLE_NAME_HERE` following the syntax: 

```bash
$ npx degit nguyenyou/scalawind/examples/EXAMPLE_NAME_HERE my-scalawind-app
```

## How to use

Install the CLI, using any node package manager that you prefer:

```bash
$ npm install scalawind --save-dev
```

Then, add the `postinstall` script to your `package.json` to make sure the code will automatically run after install:

```json
"scripts": {
  "postinstall": "scalawind generate",
}
```

After generating, you will have a `scalawind.scala` file at the root of your project. You can move it to your preferred location and rename the package however you like.

Then, `import scalawind.*` and you're ready to go.

```scala
import scalawind.*

button(
  cls := sw(tw.bg_blue_500
        .hover(tw.bg_blue_600).first_letter(tw.text_red_500.font_bold)
        .text_white.rounded.py_3.px_4.md(tw.py_4.px_5)
        .dark(tw.bg_sky_900.hover(tw.bg_sky_800))),
  "Click me"
)

// ↓ ↓ ↓ ↓ ↓ ↓

<button class="bg-blue-500 hover:bg-blue-600 first-letter:text-red-500 first-letter:font-bold text-white rounded py-3 px-4 md:py-4 md:px-5 dark:bg-sky-900 dark:hover:bg-sky-800">
  Click Me
</button>
```

That's it.

## Customize Generated Code

The Scalawind CLI supports `-o` to specify the output path and `-p` to specify the generated package name. For example:

```bash
$ scalawind generate -o ./src/main/scala/myapp/scalawind.scala -p scalawind
```

## Show Compiled Class On Mouse Hover

You can turn on the show compiled class on mouse hover feature by adding the `--preview-compiled-result` or `-pcr` to the command. For example:

```bash
$ scalawind generate -pcr -o ./src/main/scala/myapp/scalawind.scala 
```

## Normal Usage

### Fluent API

Scalawind uses Fluent Syntax which can help us type faster and still benefit from type safety.

```scala
tw.bg_blue_500.text_white.rounded.py_3.px_4

// ↓ ↓ ↓ ↓ ↓ ↓

"bg-blue-500 text-white rounded py-3 px-4"
```

### Negative value

To use classes which start with negative values like `-left-1`, just replace `-` with `_` underscore. In this case, you can type: `tw._left_1`

### Percentage value

For utilities like `w-1/2`, we have to replace the `/` backward slash character with the `$` dollar sign character because the `/` backward slash character is invalid for method name.

```scala
val styles: String = tw.w_1$2

// ↓ ↓ ↓ ↓ ↓ ↓

val styles: String = "w-1/2"
```

### Color Opacity

In case you need color opacity utility classes like `bg-red-500/20`, we have support for that:

```scala
val styles: String = tw.text_blue_500.opacity(10).bg_red_500

// ↓ ↓ ↓ ↓ ↓ ↓

val styles: String = "text-blue-500/10 bg-red-500"
```

As you can see, the `opacity` method only apply the opacity value to the immediate preceding class.

## Modifiers

### Ordering stacked modifiers

```scala
tw.dark(tw.groupHover(tw.focus(tw.bg_black)))

// ↓ ↓ ↓ ↓ ↓ ↓

"dark:group-hover:focus:bg-black"
```

This behavior is the same as tailwindcss [ordering stacked modifiers](https://tailwindcss.com/docs/hover-focus-and-other-states#ordering-stacked-modifiers) behavior


### Important modifier

To specify a class to be important, you can wrap it inside the `tw.important()` or `tw.i()` modifier.

```scala
button(cls := sw(tw.important(tw.text_black).hover(tw.important(tw.text_blue_700))), "Click me")

// ↓ ↓ ↓ ↓ ↓ ↓

<button class="!text-black hover:!text-blue-700">Click me</button>
```

## Arbitrary variants

We have support for [arbitrary variants](https://tailwindcss.com/docs/adding-custom-styles#arbitrary-variants) feature.

> Arbitrary variants are like arbitrary values but for doing on-the-fly selector modification, like you can with built-in pseudo-class variants like hover:{utility} or responsive variants like md:{utility} but using square bracket notation directly in your HTML.

```scala
val styles: String = tw.variant("&:nth-child(3)", tw.text_red_500)

// ↓ ↓ ↓ ↓ ↓ ↓

val styles: String = "[&:nth-child(3)]:text-red-500"
```


## Escape Hatches

There're cases you need some Tailwind classes that Scalawind currently doesn't support, you can use the `raw` method to directly write the utilities that you need, for example:

```scala
tw.raw("some-very-special-class")
```

Of course, this method can be chain in the fluent style like any other methods:

```scala
val styles = sw(tw.text_black.bg_white.hover(tw.raw("text-white bg-black")))

// ↓ ↓ ↓ ↓ ↓ ↓

val styles = "text-black bg-white hover:text-white hover:bg-black"
```

## Reducing Generated Code Size

### Colors

By default, TailwindCSS includes all of their colorset which make the generated scala code has to cover all the usages of these colors.

You can pick some of them to use by overriding the config, like this:

```js
// tailwind.config.js

const colors = require("tailwindcss/colors");

/** @type {import('tailwindcss').Config} */
module.exports = {
  content: {
    files: ["./index.html", "./scalajs-modules/**/*.js"],
  },
  theme: {
    colors: {
      transparent: "transparent",
      current: "currentColor",
      black: colors.black,
      white: colors.white,
      red: colors.red,
    },
  },
};

```

### Core Plugins

TailwindCSS by default includes all their core plugins for you, this will cause the generated scala code has to cover all the core plugins, you can pick only the plugins that you use:

```js
// tailwind.config.js

/** @type {import('tailwindcss').Config} */
module.exports = {
  content: {
    files: ['./index.html', './scalajs-modules/**/*.js'],
  },
  corePlugins: [
    'display',
    'textColor',
    'width',
    'height',
    'alignItems',
    'justifyContent'
  ]
};
```

## How it works?

The Scalawind CLI reads your `tailwind.config.js` and using some utilities from the `tailwind` package to parse the config into a list of unititly classes. After that, we use a handlebar template to generate the actual scala code that you will use in your scala project.

This is the handlebar template:

```hbs
package {{package}}

import scala.quoted.*
import scala.annotation.unused

case class Tailwind() {
  {{#each modifiers}}
  def {{this.name}}(@unused styles: Tailwind): Tailwind = Tailwind()
  {{/each}}
  def important(@unused styles: Tailwind): Tailwind = Tailwind()
  def i(@unused styles: Tailwind): Tailwind = Tailwind()
}

object tw {
  def apply(): Tailwind = Tailwind()

  {{#each standard}}
  def {{this.prop}}: Tailwind = Tailwind()
  {{/each}}

  {{#each modifiers}}
  def {{this.name}}(@unused styles: Tailwind): Tailwind = Tailwind()
  {{/each}}
  def important(@unused styles: Tailwind): Tailwind = Tailwind()
  def i(@unused styles: Tailwind): Tailwind = Tailwind()
}

extension (tailwind: Tailwind)
  {{#each standard}}
  def {{this.prop}}: Tailwind = Tailwind()
  {{/each}}

inline def sw(inline tailwind: Tailwind): String =
  ${ swImpl('tailwind) }

def swImpl(twStyleExpr: Expr[Tailwind])(using Quotes): Expr[String] = {
  import quotes.reflect.*

  def extractClassNames(term: Term): List[String] = term match {
    {{#each modifiers}}
    case Apply(Select(inner, "{{this.name}}"), List(styles)) =>
      val classes = extractClassNames(styles).map(clx => s"{{this.value}}:$clx")
      extractClassNames(inner) ++ classes
    {{/each}}
    case Apply(Select(inner, "important"), List(styles)) =>
      val classes = extractClassNames(styles).map(clx => s"!$clx")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "i"), List(styles)) =>
      val classes = extractClassNames(styles).map(clx => s"!$clx")
      extractClassNames(inner) ++ classes
    case Apply(Ident(name), List(inner)) =>
      extractClassNames(inner) :+ name.replace("_", "-")
    case Inlined(_, _, inner) =>
      extractClassNames(inner)
    case Select(inner, name) =>
      extractClassNames(inner) :+ name.replace("_", "-")
    case Ident("tailwind") =>
      Nil
    case Ident("tw") =>
      Nil
    case _ =>
      report.errorAndAbort(s"Unexpected term: $term")
  }

  val term = twStyleExpr.asTerm
  val classNames = extractClassNames(term)
  val combinedClasses = classNames.mkString(" ")
  report.info(s"Compiled: $combinedClasses")
  Expr(combinedClasses)
}
```

Now, let's take a look at this minimal `scalawind.scala` file that you can copy and paste into your source code.

```scala
package scalawind

import scala.quoted.*
import scala.annotation.unused

case class Tailwind() {
  def hover(@unused styles: Tailwind): Tailwind = Tailwind()
}

object tw {
  def apply(): Tailwind = Tailwind()

  def text_blue_500: Tailwind = Tailwind()
  def text_red_500: Tailwind = Tailwind()
  def hover(@unused styles: Tailwind): Tailwind = Tailwind()
}

extension (tailwind: Tailwind)
  def text_blue_500: Tailwind = Tailwind()
  def text_red_500: Tailwind = Tailwind()

inline def sw(inline tailwind: Tailwind): String =
  ${ swImpl('tailwind) }

def swImpl(twStyleExpr: Expr[Tailwind])(using Quotes): Expr[String] = {
  import quotes.reflect.*

  def extractClassNames(term: Term): List[String] = term match {
    case Apply(Select(inner, "hover"), List(styles)) =>
      val classes = extractClassNames(styles).map(clx => s"hover:$clx")
      extractClassNames(inner) ++ classes
    case Apply(Ident(name), List(inner)) =>
      extractClassNames(inner) :+ name.replace("_", "-")
    case Inlined(_, _, inner) =>
      extractClassNames(inner)
    case Select(inner, name) =>
      extractClassNames(inner) :+ name.replace("_", "-")
    case Ident("tailwind") =>
      Nil
    case Ident("tw") =>
      Nil
    case _ =>
      report.errorAndAbort(s"Unexpected term: $term")
  }

  val term = twStyleExpr.asTerm
  val classNames = extractClassNames(term)
  val combinedClasses = classNames.mkString(" ")
  report.info(s"Compiled: $combinedClasses")
  Expr(combinedClasses)
}
```

Then use it:

```scala
val styles: String = sw(tw.text_red_500.hover(tw.text_blue_500))

// ↓ ↓ ↓ ↓ ↓ ↓

val styles: String = "text-red-500 hover:text-blue-500"
```

As you can see, the whole scalawind thing includes two parts:
- The `case class Tailwind`, the `object tw` and the `extension (tailwind: Tailwind):` is just there for the Fluent Syntax.
- The `sw` and  `swImpl` is the macro that will compile all those fluent thing into a string


## Acknowledgement

This project is inspired by https://github.com/mokshit06/typewind. Thank you a lot for making the library.

## License

MIT License © 2024-Present [You Nguyen](https://github.com/younguyen)
