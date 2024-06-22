import org.scalajs.linker.interface.ModuleSplitStyle

enablePlugins(ScalaJSPlugin)

scalaVersion := "3.3.3"
scalaJSUseMainModuleInitializer := true

scalaJSLinkerConfig ~= {
  _.withModuleKind(ModuleKind.ESModule)
    .withModuleSplitStyle(ModuleSplitStyle.SmallModulesFor(List("myapp")))
}

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.4.0"
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "3.0.0-beta3"

Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / "scalajs-modules"
Compile / fullLinkJS / scalaJSLinkerOutputDirectory := target.value / "scalajs-modules"
