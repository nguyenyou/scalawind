![Write typesafe Tailwindcss with Scalawind](https://raw.githubusercontent.com/nguyenyou/scalawind/main/.github/assets/banner.png 'Write typesafe Tailwindcss with Scalawind')

<p align="center">
  <br/>
  <a href="https://github.com/nguyenyou/scalawind">Scalawind</a> is a Zero-Runtime Typesafe Tailwindcss in Scala
  <br/><br/>
</p>

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

You can provide your custom package name and output path by adding a `scalawind` field to the `package.json` file, for example:

```json
{
  "name": "myapp",
  "scripts": {},
  "dependencies": {},
  "scalawind": {
    "outputPath": "./scalawind.scala",
    "packageName": "scalawind"
  },
}
```

- `outputPath`: specify both the generated filename and also where to generate it.
- `packageName`: is the name of the generated package.

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

## Arbitrary

In some cases, you might need to use some arbitrary values or arbitrary variants, then, in this case, the typesafe thing doesn't make sense, I suggest that you can just type in directly the arbitrary things that you want to use in strings.

## Reducing Generated Code Size

### Colors

By default, TailwindCSS includes all of their colorset which make the generated scala code has to cover all the usages of these colors.

You can pick some of them to use by overriding the config, like this:

```js
// tailwind.config.cjs

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
// tailwind.config.cjs

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

## Troubleshoot

### Cannot read the tailwind config

You might need to change the filename to `tailwind.config.cjs` and inside the config file, it should have `module.exports = {}`, for example:

```js
// tailwind.config.cjs

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

## How it works?

The Scalawind CLI reads your `tailwind.config.cjs` and using some utilities from the `tailwind` package to parse the config into a list of unititly classes. After that, we use a handlebar template to generate the actual scala code that you will use in your scala project.

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
