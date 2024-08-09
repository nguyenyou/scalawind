import mill._, scalalib._, scalajslib._, scalajslib.api._

object myapp extends ScalaJSModule {
  def scalaVersion = "3.3.3"
  def scalaJSVersion = "1.16.0"

  def moduleKind = ModuleKind.ESModule
  def moduleSplitStyle = ModuleSplitStyle.SmallModulesFor(List("myapp"))

  def ivyDeps = Agg(
    ivy"com.github.japgolly.scalajs-react::core::3.0.0-beta6"
  )
}
