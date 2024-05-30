import org.scalajs.linker.interface.ModuleSplitStyle

enablePlugins(ScalaJSPlugin)

externalNpm := baseDirectory.value

scalaVersion := "3.3.3"
scalaJSUseMainModuleInitializer := true

scalaJSLinkerConfig ~= {
  _.withModuleKind(ModuleKind.ESModule)
    .withModuleSplitStyle(ModuleSplitStyle.SmallModulesFor(List("myapp")))
}

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.4.0"
libraryDependencies += "com.raquo" %%% "laminar" % "17.0.0"

Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / "scalajs-modules"
Compile / fullLinkJS / scalaJSLinkerOutputDirectory := target.value / "scalajs-modules"