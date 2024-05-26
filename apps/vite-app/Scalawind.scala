package scalawind

import scala.quoted.*

object tw {
  val flex = "flex"
  val bg_black = "bg-black"
  val bg_white = "bg-white"
  val text_white = "text-white"
  val text_black = "text-black"
}

case class SwStyle(style: String = "") {
  def addClasses(classNames: String): SwStyle = {
    val newStyle = s"$style ${classNames}".trim
    SwStyle(newStyle)
  }
  def addClass(className: String): SwStyle = addClasses(className)

  def hover(hoverStyle: SwStyle): SwStyle = {
    val hoverClasses = hoverStyle.style.split("\\s+").map(tw => s"hover:$tw").mkString(" ")
    addClasses(hoverClasses)
  }

  override def toString: String = style
}

given Conversion[SwStyle, String] with
  def apply(swStyle: SwStyle): String = swStyle.style

extension (swStyle: SwStyle)
  def flex: SwStyle = swStyle.addClass(tw.flex)
  def bg_black: SwStyle = swStyle.addClass(tw.bg_black)
  def bg_white: SwStyle = swStyle.addClass(tw.bg_white)
  def text_white: SwStyle = swStyle.addClass(tw.text_white)
  def text_black: SwStyle = swStyle.addClass(tw.text_black)

object sw {
  def apply(): SwStyle = SwStyle()

  def flex: SwStyle = SwStyle().addClass(tw.flex)
  def bg_black: SwStyle = SwStyle().addClass(tw.bg_black)
  def bg_white: SwStyle = SwStyle().addClass(tw.bg_white)
  def text_white: SwStyle = SwStyle().addClass(tw.text_white)
  def text_black: SwStyle = SwStyle().addClass(tw.text_black)
}

inline def sw(inline styles: TwStyle): String =
  ${ swImpl('styles) }

private def swImpl(stylesExpr: Expr[TwStyle])(using Quotes): Expr[String] = {
  import quotes.reflect.*

  def extractClassNames(term: Term): List[String] = term match {
    case Apply(Select(inner, "hover"), List(hoverStyle)) =>
      val hoverClasses = extractClassNames(hoverStyle).map(cls => s"hover:$cls")
      extractClassNames(inner) ++ hoverClasses
    case Apply(Ident(name), List(inner)) =>
      extractClassNames(inner) :+ name.replace("_", "-")
    case Inlined(_, _, inner) =>
      extractClassNames(inner)
    case Select(inner, name) =>
      extractClassNames(inner) :+ name.replace("_", "-")
    case Ident("tw") =>
      Nil
    case _ =>
      report.errorAndAbort(s"Unexpected term: $term")
  }

  val term = stylesExpr.asTerm
  val classNames = extractClassNames(term)
  val combinedClasses = classNames.mkString(" ")
  report.info(s"Compiled classes: $combinedClasses")
  Expr(combinedClasses)
}