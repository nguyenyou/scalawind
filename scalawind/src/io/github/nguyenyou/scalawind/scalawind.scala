package io.github.nguyenyou.scalawind

import scala.quoted.*
import scala.annotation.unused
import scala.language.implicitConversions
import com.raquo.laminar.api.L
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLHeadingElement

// Create a priority hierarchy for implicit conversions
trait LowPriorityImplicits:
  implicit inline def laminarTailwind(inline tailwind: Tailwind): L.HtmlMod =
    ${ laminarTailwindImpl('tailwind) }

  implicit inline def laminarSvgTailwind(inline tailwind: Tailwind): L.SvgMod =
    ${ laminarSvgTailwindImpl('tailwind) }

trait HighPriorityImplicits extends LowPriorityImplicits:
  implicit inline def laminarHtmlHeading(
      inline tailwind: Tailwind
  ): L.Modifier[ReactiveHtmlElement[HTMLHeadingElement]] =
    ${ toHtmlHeadingModImpl('tailwind) }

// Make the companion object extend the priority hierarchy
object Tailwind extends HighPriorityImplicits:
  def apply(): Tailwind = new Tailwind()

  implicit inline def sw(inline tailwind: Tailwind): String =
    ${ swImpl('tailwind) }

extension (inline tailwind: Tailwind)
  inline def toHtmlMod: L.HtmlMod =
    ${ laminarTailwindImpl('tailwind) }
  inline def toSvgMod: L.SvgMod =
    ${ laminarSvgTailwindImpl('tailwind) }
  inline def <--(inline boolSignal: L.Signal[Boolean]): L.HtmlMod =
    ${ boolSignalClsImpl('tailwind, 'boolSignal) }
  inline def :=(inline bool: Boolean): L.HtmlMod =
    ${ boolClsImpl('tailwind, 'bool) }

def boolSignalClsImpl(tailwindExpr: Expr[Tailwind], boolSignal: Expr[L.Signal[Boolean]])(using
    Quotes
): Expr[L.HtmlMod] =
  val value = swImpl(tailwindExpr).valueOrAbort
  '{ L.cls(${ Expr(value) }) <-- ${ boolSignal } }

def boolClsImpl(tailwindExpr: Expr[Tailwind], bool: Expr[Boolean])(using Quotes): Expr[L.HtmlMod] =
  val value = swImpl(tailwindExpr).valueOrAbort
  '{ L.cls(${ Expr(value) }) := ${ bool } }

def laminarTailwindImpl(
    tailwindExpr: Expr[Tailwind]
)(using
    Quotes
): Expr[L.HtmlMod] =
  val value = swImpl(tailwindExpr).valueOrAbort
  '{ L.cls := ${ Expr(value) } }

def laminarSvgTailwindImpl(
    tailwindExpr: Expr[Tailwind]
)(using
    Quotes
): Expr[L.SvgMod] =
  val value = swImpl(tailwindExpr).valueOrAbort
  '{ L.svg.className := ${ Expr(value) } }

def toHtmlHeadingModImpl(tailwindExpr: Expr[Tailwind])(using
    Quotes
): Expr[L.Modifier[ReactiveHtmlElement[HTMLHeadingElement]]] =
  val value = swImpl(tailwindExpr).valueOrAbort
  '{ L.cls := ${ Expr(value) } }

extension (inline tailwind: Tailwind)
  inline def css: String =
    ${ swImpl('tailwind) }

def methodNameToTailwindClass(rawName: String) =
  val name = if rawName.startsWith("_") && rawName.charAt(1).isDigit then rawName.stripPrefix("_") else rawName
  name.replace("_", "-")

def swImpl(tailwindExpr: Expr[Tailwind])(using Quotes): Expr[String] =
  import quotes.reflect.*

  def extractClassNames(term: Term, prefix: String = "", important: Boolean = false): List[String] =
    var stack = List((term, prefix, important))
    var classNames = List.empty[String]

    while stack.nonEmpty do
      stack.headOption.foreach { (currentTerm, currentPrefix, currentImportant) =>
        stack = stack.drop(1)

        currentTerm match
          case Apply(Select(inner, "important"), List(styles)) =>
            stack = (styles, currentPrefix, true) :: stack
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Inlined(_, _, inner) =>
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Select(inner, name) =>
            val methodName = methodNameToTailwindClass(name)
            val className = s"$currentPrefix${if currentImportant then "!" else ""}${methodName}"
            classNames = classNames :+ className
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Ident("tw") =>
          // No action needed, just continue processing the remaining stack
          case Apply(Ident(name), List(arg)) =>
            val methodName = methodNameToTailwindClass(name)
            val className = s"$currentPrefix${if currentImportant then "!" else ""}${methodName}"
            classNames = classNames :+ className
            stack = (arg, currentPrefix, currentImportant) :: stack
          case Apply(Select(inner, name), List(Literal(StringConstant(value)))) if name == "raw" =>
            val className = s"$currentPrefix${if currentImportant then "!" else ""}$value"
            classNames = classNames :+ className
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Apply(Select(inner, name), List(Literal(StringConstant(opacity)))) if name.endsWith("$") =>
            val methodName = methodNameToTailwindClass(name.stripSuffix("$"))
            val className = s"$currentPrefix${if currentImportant then "!" else ""}${methodName}/${opacity}"
            classNames = classNames :+ className
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Apply(Select(inner, name), List(Literal(StringConstant(value)))) =>
            val methodName = methodNameToTailwindClass(name)
            val className = s"$currentPrefix${if currentImportant then "!" else ""}${methodName}[$value]"
            classNames = classNames :+ className
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Apply(Apply(Ident(name), args), List(Literal(StringConstant(value)))) =>
            val methodName = methodNameToTailwindClass(name)
            val className = s"$currentPrefix${if currentImportant then "!" else ""}${methodName}[$value]"
            classNames = classNames :+ className
            stack = args.map(arg => (arg, currentPrefix, currentImportant)) ++ stack
          case Apply(Select(Ident("tw"), name), List(inner)) =>
            val methodName = methodNameToTailwindClass(name)
            stack = (inner, s"$currentPrefix${methodName}:", currentImportant) :: stack
          case Apply(Select(inner, "variant"), List(Literal(StringConstant(selector)), styles)) =>
            val variantPrefix = s"$currentPrefix[$selector]:" // Use the selector as provided
            val styleClasses =
              extractClassNames(styles, variantPrefix, currentImportant) // Extract classes with the variant prefix
            classNames = classNames ++ styleClasses
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Apply(Select(inner, name), args) =>
            val methodName = methodNameToTailwindClass(name)
            val innerClasses = args.flatMap(arg => extractClassNames(arg, s"$currentPrefix${methodName}:"))
            classNames = classNames ++ innerClasses
            stack = (inner, currentPrefix, currentImportant) :: stack
          case unexpectedTerm =>
            report.errorAndAbort(s"Unexpected term: $unexpectedTerm")
        end match
      }
    end while

    classNames
  end extractClassNames

  val term = tailwindExpr.asTerm
  val classList = extractClassNames(term).reverse
  val combinedClasses = classList.mkString(" ")
  Expr(combinedClasses)
end swImpl

val tw = Tailwind()

case class Tailwind() {
  def flex: Tailwind = this
  def items_center: Tailwind = this
  def justify_center: Tailwind = this
  def bg_blue_500: Tailwind = this
  def text_white: Tailwind = this
  def rounded: Tailwind = this
  def py_3: Tailwind = this
  def px_4: Tailwind = this
  def hover(@unused styles: Tailwind): Tailwind = this
  def text_(@unused styles: String): Tailwind = this
  def `w_1.5`: Tailwind = this
  def `w_1/2`: Tailwind = this
  def `h_1.5`: Tailwind = this
  def _left_1: Tailwind = this
  def text_green_400: Tailwind = this
  def text_red_400: Tailwind = this
  def text_red_400$(@unused styles: String): Tailwind = this
  def bg_black$(@unused styles: String): Tailwind = this
  def _2xl(@unused styles: Tailwind): Tailwind = this
  def md(@unused styles: Tailwind): Tailwind = this
  def text_black: Tailwind = this
  def important(@unused styles: Tailwind): Tailwind = this
  def raw(@unused styles: String): Tailwind = this
  def text_red_500: Tailwind = this
  def underline: Tailwind = this
  def variant(@unused selector: String, @unused styles: Tailwind): Tailwind = this
  def bg_(@unused styles: String): Tailwind = this
  def font_bold: Tailwind = this
  def bg_blue_600: Tailwind = this
  def first_letter(@unused styles: Tailwind): Tailwind = this
  def bg_green_500$(@unused styles: String): Tailwind = this
  def bg_sky_900: Tailwind = this
  def bg_sky_800: Tailwind = this
  def lg(@unused styles: Tailwind): Tailwind = this
  def bg_blue_500$(@unused styles: String): Tailwind = this
  def list_disc: Tailwind = this
  def mx_5: Tailwind = this
  def py_4: Tailwind = this
  def px_5: Tailwind = this
  def dark(@unused styles: Tailwind): Tailwind = this
  def sm(@unused styles: Tailwind): Tailwind = this
  def items_start: Tailwind = this
  def text_red_600: Tailwind = this
  def gap_2: Tailwind = this
  def row_start_3: Tailwind = this
  def underline_offset_4: Tailwind = this
  def gap_6: Tailwind = this
  def flex_wrap: Tailwind = this
  def rounded_full: Tailwind = this
  def border: Tailwind = this
  def border_solid: Tailwind = this
  def border_black: Tailwind = this
  def border_black$(@unused styles: String): Tailwind = this
  def border_white$(@unused styles: String): Tailwind = this
  def transition_colors: Tailwind = this
  def border_transparent: Tailwind = this
  def text_sm: Tailwind = this
  def text_base: Tailwind = this
  def h_10: Tailwind = this
  def h_12: Tailwind = this
  def min_w_44: Tailwind = this
  def gap_4: Tailwind = this
  def flex_col: Tailwind = this
  def flex_row: Tailwind = this
  def bg_white: Tailwind = this
  def bg_white$(@unused styles: String): Tailwind = this
  def px_1: Tailwind = this
  def `py_0.5`: Tailwind = this
  def font_semibold: Tailwind = this
  def font_mono: Tailwind = this
  def list_inside: Tailwind = this
  def list_decimal: Tailwind = this
  def text_center: Tailwind = this
  def text_left: Tailwind = this
  def invert: Tailwind = this
  def gap_8: Tailwind = this
  def row_start_2: Tailwind = this
  def font_sans: Tailwind = this
  def grid: Tailwind = this
  def grid_rows_(@unused styles: String): Tailwind = this
  def justify_items_center: Tailwind = this
  def min_h_screen: Tailwind = this
  def p_8: Tailwind = this
  def pb_20: Tailwind = this
  def gap_16: Tailwind = this
  def p_20: Tailwind = this
}
