#!/usr/bin/env node

import { generate } from "./commands/generate/index.js";

import { Command } from 'commander';
const program = new Command();

program
  .name('scalawind')
  .description('Scalawind CLI')
  .version('0.0.1');

program.command('generate')
  .description('Generate scalawind package based on user"s tailwind config')
  .option('-o', '--output', 'Specify the path to output the scalawind package')
  .option('-i, --input', 'Specify the path to your tailwind config')
  .option('-p, --package', 'Customize the generated package name. Default: "scalawind"')
  .action(async (str, options) => {
    // const limit = options.first ? 1 : undefined;
    // console.log(str.split(options.separator, limit));
    generate().catch(err => {
      console.error(err)
      process.exit(1)
    })
  });

program.parse();