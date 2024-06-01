
import { existsSync } from "fs"
import { Command } from "commander"
import path from "path"
import { getTailwindConfigFilePath, preFlight } from "../utils/get-project-info"
import { z } from "zod"
import { handleError } from "../utils/handle-error"
import { loadConfig } from '../utils/load-config'
import handler from '../generate'
import { logger } from "../utils/logger"

const initOptionsSchema = z.object({
  cwd: z.string(),
  output: z.string(),
  packageName: z.string(),
  previewCompliedResult: z.boolean()
})

export const generate = new Command()
  .name("generate")
  .description("generate your scalawind.scala")
  .option(
    "-o, --output <output>",
    "the output path. defaults to the current directory.",
    "./scalawind.scala"
  )
  .option(
    "-p, --package-name <packageName>",
    "the package name. defaults to scalawind.",
    "scalawind"
  )
  .option(
    "-pcr, --preview-complied-result <previewCompliedResult>",
    "enable show preview compiled result",
    false
  )
  .option(
    "-c, --cwd <cwd>",
    "the working directory. defaults to the current directory.",
    process.cwd()
  )
  .action(async (opts) => {
    try {
      const start = Date.now()

      const options = initOptionsSchema.parse(opts)
      const cwd = path.resolve(options.cwd)
      const outputPath = path.join(cwd, options.output)
      const packageName = options.packageName
      const previewCompliedResult = options.previewCompliedResult

      // Ensure target directory exists.
      if (!existsSync(cwd)) {
        logger.error(`The path ${cwd} does not exist. Please try again.`)
        process.exit(1)
      }

      preFlight(cwd)

      const userConfigPath = await getTailwindConfigFilePath(cwd)

      if(!userConfigPath) {
        handleError("Please make sure your tailwind.config.{js,cjs,ts,mjs} file is present")
      }

      const configObject = loadConfig(userConfigPath)

      handler(configObject, options)

      const duration = Math.floor(Date.now() - start)

      logger.success(`Generated ${outputPath} in ${duration}ms`)

    } catch (error) {
      handleError(error)
    }
  })