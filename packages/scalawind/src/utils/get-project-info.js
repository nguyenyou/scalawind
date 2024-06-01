import fg from "fast-glob"
import path from "path"

const PROJECT_SHARED_IGNORE = [
  "**/node_modules/**",
  ".next",
  "public",
  "dist",
  "build",
]

export async function preFlight(cwd) {
  // We need Tailwind CSS to be configured.
  const tailwindConfig = await fg.glob("tailwind.config.*", {
    cwd,
    deep: 3,
    ignore: PROJECT_SHARED_IGNORE,
  })

  if (!tailwindConfig.length) {
    throw new Error(
      "Tailwind CSS is not installed. Visit https://tailwindcss.com/docs/installation to get started."
    )
  }

  return true
}

export async function getTailwindConfigFilePath(cwd) {
  const files = await fg.glob("tailwind.config.{js,cjs,ts,mjs}", {
    cwd,
    deep: 3,
    ignore: PROJECT_SHARED_IGNORE,
  })

  if (!files.length) {
    return null
  }

  for (const file of files) {
    const filePath = path.resolve(cwd, file)
    return filePath
  }

  return null
}