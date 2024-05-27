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

val styles = sw(tw.bg_black.text_white.hover(tw.bg_white.text_black))
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

Done. You can experience typesafe tailwindcss now.

## Quickstart

You can use [degit](https://github.com/Rich-Harris/degit) to clone the vite example that's already setup everything for you to get started.

```
npx degit nguyenyou/scalawind/examples/vite-app my-scalawind-app
```

## Modifiers

### important

To specify a class to be important, you can wrap it inside the `tw.important()` or `tw.i()` modifier.

```scala
button(cls := sw(tw.text_red_500.important(tw.text_black)), "Click me")
```


## Tips

### Reducing generated code
Only including the utilities that you really use in your project, especially colorset. By default, TailwindCSS includes all of their colorset which make the generated scala code has to cover all the usages of these colors.

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


## Acknowledgement

This project is inspired by https://github.com/mokshit06/typewind. Thank you a lot for making the library.

## License

MIT License © 2024-Present [You Nguyen](https://github.com/younguyen)
