import mill._, scalalib._, scalajslib._, scalajslib.api._

object myapp extends ScalaJSModule {
  def scalaVersion = "3.3.3"
  def scalaJSVersion = "1.17.0"

  def moduleKind = ModuleKind.ESModule
  def moduleSplitStyle = ModuleSplitStyle.SmallModulesFor(List("myapp"))

  def ivyDeps = Agg(
    ivy"org.scala-js::scalajs-dom::2.4.0",
    ivy"com.raquo::laminar::17.1.0"
  )
}
