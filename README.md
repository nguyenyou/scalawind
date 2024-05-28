![Write typesafe Tailwindcss with Scalawind](.github/assets/banner.png 'Write typesafe Tailwindcss with Scalawind')

<p align="center">
  <br/>
  <a href="https://github.com/nguyenyou/scalawind">Scalawind</a> is a zero-runtime typesafe tailwindcss for Scala &mdash;
  <br/>
  compile time, type safe, and scalable tailwindcss
  <br/><br/>
</p>

https://github.com/nguyenyou/scalawind/assets/38455472/5668b9bc-244c-4274-bf4c-dddade787fda

## Features

- ⚡️  Write faster with Fluent API
- 🚀 Thanks Scala 3 macros, we can completely eliminate runtime cost. Only strings present in the final compiled code. No function calls. No overhead.
- 🦄 Works with every UI libraries in ScalaJS ecosystem
- 🎨 Customizable via user's tailwind config
- 💪 Type-safe tailwindcss classes and autocomplete (via codegen)

<br/>

# Scalawind - Zero-runtime Typesafe TailwindCSS in Scala

> This library is still very early and not production-ready yet, use at your own risk.

The idea is very simple, you can generate typesafe scala code from tailwind config file and use them in a typesafe way.


```scala
import scalawind.*

val styles: String = sw(tw.bg_black.text_white.hover(tw.bg_white.text_black))
// "bg-black text-white hover:bg-white hover:text-black
```

We use fluent syntax to type our tailwind classes. These classes will be compiled at compile-time so there's no runtime cost for this.

The `sw` method is a macro that will do the compile classes.
The `tw` object contains all the classes and modifiers.

## How to use

Install the CLI, using any node package manager that you prefer:

```
# pnpm add -D scalawind
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
```

That's it.

## Quickstart

You can use [degit](https://github.com/Rich-Harris/degit) to clone the vite example that's already setup everything for you to get started.

```
npx degit nguyenyou/scalawind/examples/vite-app my-scalawind-app
```

## Normal Usage

### Fluent API

Scalawind uses Fluent Syntax which can help us type faster and still benefit from type safety.

```scala
tw.bg_blue_500.text_white.rounded.py_3.px_4
// Output: bg-blue-500 text-white rounded py-3 px-4
```

### Negative value

To use classes which start with negative values like `-left-1`, just replace `-` with `_` underscore. In this case, you can type: `tw._left_1`


## Modifiers

### Ordering stacked modifiers

```scala
tw.dark(tw.groupHover(tw.focus(tw.bg_black)))
```

will be:

```
"dark:group-hover:focus:bg-black"
```

This behavior is the same as tailwindcss [ordering stacked modifiers](https://tailwindcss.com/docs/hover-focus-and-other-states#ordering-stacked-modifiers) behavior


### Important

To specify a class to be important, you can wrap it inside the `tw.important()` or `tw.i()` modifier.

```scala
button(cls := sw(tw.important(tw.text_black).hover(tw.important(tw.text_blue_700))), "Click me")
```

The output will be:
```
<button class="!text-black hover:!text-blue-700">Click me</button>
```

## Arbitrary

In some cases, you might need to use some arbitrary values or arbitrary variants, then, in this case, the typesafe thing doesn't make sense, I suggest that you can just type in directly the arbitrary things that you want to use in strings.

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

## Notes

### Macros

The most reliable way right now is using `sw()` macro to compile the `tw` styles. However in the context of String you can omit the `sw()` and the library will implicitly call it for you. So, you can write:

```scala
val styles: String = tw.bg_black.text_white.hover(tw.bg_white.text_black) // without the sw()
// Still output: bg-black text-white hover:bg-white hover:text-back
```

However, this is not work 100% time, for example, when using with `cls :=` method of Laminar, it doesn't work. So in this case, you need to explicitly use the `sw()` macro:

```scala
div(cls := sw(tw.bg_black.text_white.hover(tw.bg_white.text_black)))
```

In case you still try to omit the `sw()` call entirely, you can try to assign the `tw` to a String val first:

```scala
val styles: String = tw.bg_black.text_white.hover(tw.bg_white.text_black)

div(cls := styles)
```

This is truely a technical constraint that I don't know how to overcome yet, if you guys know how to improve it, please help.

## Acknowledgement

This project is inspired by https://github.com/mokshit06/typewind. Thank you a lot for making the library.

## License

MIT License © 2024-Present [You Nguyen](https://github.com/younguyen)
