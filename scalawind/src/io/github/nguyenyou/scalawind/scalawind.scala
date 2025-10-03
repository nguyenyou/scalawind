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
}
