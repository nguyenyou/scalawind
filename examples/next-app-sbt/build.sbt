import org.scalajs.linker.interface.ModuleSplitStyle

enablePlugins(ScalaJSPlugin)

scalaVersion := "3.3.3"

scalaJSLinkerConfig ~= {
  _.withModuleKind(ModuleKind.ESModule)
    .withModuleSplitStyle(ModuleSplitStyle.SmallModulesFor(List("myapp")))
}

libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "3.0.0-beta6"

Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / "scalajs-modules"
Compile / fullLinkJS / scalaJSLinkerOutputDirectory := target.value / "scalajs-modules"
