![Write typesafe Tailwindcss with Scalawind](.github/assets/banner.png 'Write typesafe Tailwindcss with Scalawind')

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
