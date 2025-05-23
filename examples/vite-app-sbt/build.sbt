import org.scalajs.linker.interface.ModuleSplitStyle

enablePlugins(ScalaJSPlugin)

scalaVersion := "3.6.3"
scalaJSUseMainModuleInitializer := true

scalaJSLinkerConfig ~= {
  _.withModuleKind(ModuleKind.ESModule)
    .withModuleSplitStyle(ModuleSplitStyle.SmallModulesFor(List("myapp")))
}

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.8.0"
libraryDependencies += "com.raquo" %%% "laminar" % "17.2.0"

Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / "scalajs-modules"
Compile / fullLinkJS / scalaJSLinkerOutputDirectory := target.value / "scalajs-modules"
