#!/usr/bin/env node

import cac from "cac";

const cli = cac();

cli
  .command("shorten <link>", "Shorten a link")
  .action((link) => console.log(link))

cli.help()
cli.parse()