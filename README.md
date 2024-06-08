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


## Supported Tailwind Features

- [x] Normal, like `flex items-center justify-center`
- [x] Arbitrary values, like `bg-[#de3423] text-[#380d09] h-[100px]`
- [x] Normal modifiers, like `hover:bg-red-500` or `md:text-xs`
- [x] Important modifiers, like `!text-red-500`
- [x] Color opacity, like `bg-blue-500/25` or `bg-black/[.05]`
- [x] Raw, an escape hatch to pass in raw tailwind utility classes
- [x] Arbitrary variants, like `[&:nth-child(3)]:text-red-500`
- [x] Negative values, like `-top-1`
- [x] Percentage values, like `w-1/2`
- [x] Dot values, like `w-1.5`

# Scalawind - Zero-Runtime Typesafe TailwindCSS in Scala

> Although this library is still very early, the actual code is just a single file generated and output directly into your project. You can twist it, fix it, make changes to it however you like. 

![Integration Testing](https://github.com/nguyenyou/scalawind/actions/workflows/integration-test.yml/badge.svg)

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

For utilities like `w-1/2`, we have to replace the `/` backward slash character with the `per` word because the `/` backward slash character is invalid for method name.

```scala
val styles: String = tw.w_1per2

// ↓ ↓ ↓ ↓ ↓ ↓

val styles: String = "w-1/2"
```

### Dot value

For utilities like `w-1.5`, we have to replace the `.` dot character with the `dot` word. Example usage:

```scala
val styles: String = tw.w_1dot2

// ↓ ↓ ↓ ↓ ↓ ↓

val styles: String = "w-1.2"
```

### Color opacity

You can write color opacity class, by writing the color class name follow by `$` dollar sign and invoke function call with a opacity value in number:

```scala
val styles: String = tw.text_red_500$("25").bg_black$("[.05]")

// ↓ ↓ ↓ ↓ ↓ ↓

val styles: String = "text-red-500/25 bg-black/[.05]"
```


## Modifiers

### Ordering stacked modifiers

```scala
tw.dark(tw.groupHover(tw.focus(tw.bg_black)))

// ↓ ↓ ↓ ↓ ↓ ↓

"dark:group-hover:focus:bg-black"
```

This behavior is the same as tailwindcss [ordering stacked modifiers](https://tailwindcss.com/docs/hover-focus-and-other-states#ordering-stacked-modifiers) behavior


### Important modifier

To specify a class to be important, you can wrap it inside the `tw.important()` modifier.

```scala
button(cls := sw(tw.important(tw.text_black).hover(tw.important(tw.text_blue_700))), "Click me")

// ↓ ↓ ↓ ↓ ↓ ↓

<button class="!text-black hover:!text-blue-700">Click me</button>
```

## Arbitrary values

> This feature is not stable yet, it works but very limited

We have support for [arbitrary values](https://tailwindcss.com/docs/adding-custom-styles#using-arbitrary-values) with quite similar signature, instead of wrapping your arbitrary value in square brackets, you now use function call. For example:

```scala
val styles: String = tw.bg_("#bada55").text_("22px")

// ↓ ↓ ↓ ↓ ↓ ↓

val styles: String = "bg-[#bada55] text-[22px]"
```

## Arbitrary variants

We have support for [arbitrary variants](https://tailwindcss.com/docs/adding-custom-styles#arbitrary-variants) feature.

> Arbitrary variants are like arbitrary values but for doing on-the-fly selector modification, like you can with built-in pseudo-class variants like hover:{utility} or responsive variants like md:{utility} but using square bracket notation directly in your HTML.

```scala
val styles: String = tw.variant("&:nth-child(3)", tw.text_red_500.bg_black)

// ↓ ↓ ↓ ↓ ↓ ↓

val styles: String = "[&:nth-child(3)]:text-red-500 [&:nth-child(3)]:bg-black"
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

## Classes Validation

Passing the flag `-cv` or `--classes-validation` to enable this feature.

### Check Duplication
When writing a long list of utility classes, it's sometime necessary to check if we accidentally duplicate our class, with class validation feature enabled, we check it for you:

### Usage Optimization
In Tailwind, we have `margin` and `padding` classes that can be used in three different fashions:

- One-direction: `mt-2`, `mb-2`, `ml-2` and `mr-2`
- Two-directions: `my-2` and `mx-2`
- Four-directions: `m-2`

It makes sense that we provide a check for efficient usage, such as, we should use `m-2` instead of combination of `my-2` and `mx-2` or we should use `mx-2` instead of combination of `mr-2` and `ml-2`.

## Advanced Usage

### Implicit Conversion

Depends on your UI library, if we're lucky, we can leverage the implicit conversion feature to shorten our code.

#### Slinky

In slinky, we can just completely skip the `sw` macro method, like this:

```scala
className := tw.flex.items_center.justify_center
```

#### Laminar

In laminar, we can skip `sw` macro method, like this:

```scala
cls[String](tw.flex.items_center.justify_center)

// or if you don't want to pass [String] to every cls call, then you can do this:
import com.raquo.laminar.api.L.cls
def clx(styles: String) = cls(styles)
// now, the implicit conversion works
clx(tw.flex.items_center.justify_center)
```
Another way to skip the `sw` is using infix notation:

```scala
import com.raquo.laminar.api.L.cls
object clx:
  def apply(styles: String) = cls(styles)
  def :=(styles: String) = cls(styles)

div(
  clx := tw.text_green_500,
  "Scala ❤️ Tailwind"
),
```

We also have a CLI option for this, use `-l` or `--laminar` to auto generate the `clx` object for you.

Another way is defining your custom string interpolation

```scala
extension (sc: StringContext) def clx(args: String*): Modifier[HtmlElement] = cls(sc.s(args*))

div(
  clx"${tw.text_red_500}",
  "Scala ❤️ Tailwind"
),
```

### Scalajs-React

Similar to Laminar, we also have support for helper methods via the `-sr` or `--scalajs-react` flag. Running the generate command with this flag, you will have:

```scala
import japgolly.scalajs.react.vdom.html_<^.*

object clx:
  def apply(styles: String): TagMod = ^.cls := styles
  def :=(styles: String): TagMod = ^.cls := styles

// usage

<.div(
  cls(tw.flex.items_center.justify_center),
  "Hello, world!"
)
```

## Reducing Generated Code Size

### Colors

By default, TailwindCSS includes all of their colorset which make the generated scala code has to cover all the usages of these colors.

You can pick some of them to use by overriding the config, like this:

```js
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

## Acknowledgement

This project is inspired by https://github.com/mokshit06/typewind. Thank you a lot for making the library.

## License

MIT License © 2024-Present [You Nguyen](https://github.com/younguyen)
