import { defineConfig } from "vite";
import tailwindcss from "@tailwindcss/vite";

const IS_CI = process.env.CI === "true";

export default defineConfig({
  plugins: [tailwindcss()],
  base: IS_CI ? "/scalawind/" : "/",
});
