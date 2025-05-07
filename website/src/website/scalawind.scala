import com.raquo.laminar.api.L
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.HTMLHeadingElement

import scala.annotation.unused
import scala.language.implicitConversions
import scala.quoted.*

// Create a priority hierarchy for implicit conversions
trait LowPriorityImplicits {
  implicit inline def laminarTailwind(inline tailwind: Tailwind): L.HtmlMod = {
    ${ laminarTailwindImpl('tailwind) }
  }

  implicit inline def laminarSvgTailwind(inline tailwind: Tailwind): L.SvgMod = {
    ${ laminarSvgTailwindImpl('tailwind) }
  }
}

trait HighPriorityImplicits extends LowPriorityImplicits {
  implicit inline def laminarHtmlHeading(
      inline tailwind: Tailwind
  ): L.Modifier[ReactiveHtmlElement[HTMLHeadingElement]] = {
    ${ toHtmlHeadingModImpl('tailwind) }
  }
}

// Make the companion object extend the priority hierarchy
object Tailwind extends HighPriorityImplicits {
  def apply(): Tailwind = new Tailwind()

  implicit inline def sw(inline tailwind: Tailwind): String =
    ${ swImpl('tailwind) }
}

extension (inline tailwind: Tailwind) {
  inline def toHtmlMod: L.HtmlMod =
    ${ laminarTailwindImpl('tailwind) }
  inline def toSvgMod: L.SvgMod =
    ${ laminarSvgTailwindImpl('tailwind) }
  inline def <--(inline boolSignal: L.Signal[Boolean]): L.HtmlMod =
    ${ boolSignalClsImpl('tailwind, 'boolSignal) }
  inline def :=(inline bool: Boolean): L.HtmlMod =
    ${ boolClsImpl('tailwind, 'bool) }
}

def boolSignalClsImpl(tailwindExpr: Expr[Tailwind], boolSignal: Expr[L.Signal[Boolean]])(using
    Quotes
): Expr[L.HtmlMod] = {
  val value = swImpl(tailwindExpr).valueOrAbort
  '{ L.cls(${ Expr(value) }) <-- ${ boolSignal } }
}

def boolClsImpl(tailwindExpr: Expr[Tailwind], bool: Expr[Boolean])(using Quotes): Expr[L.HtmlMod] = {
  val value = swImpl(tailwindExpr).valueOrAbort
  '{ L.cls(${ Expr(value) }) := ${ bool } }
}

def laminarTailwindImpl(
    tailwindExpr: Expr[Tailwind]
)(using
    Quotes
): Expr[L.HtmlMod] = {
  val value = swImpl(tailwindExpr).valueOrAbort
  '{ L.cls := ${ Expr(value) } }
}

def laminarSvgTailwindImpl(
    tailwindExpr: Expr[Tailwind]
)(using
    Quotes
): Expr[L.SvgMod] = {
  val value = swImpl(tailwindExpr).valueOrAbort
  '{ L.svg.className := ${ Expr(value) } }
}

def toHtmlHeadingModImpl(
    tailwindExpr: Expr[Tailwind]
)(using Quotes): Expr[L.Modifier[ReactiveHtmlElement[HTMLHeadingElement]]] = {
  val value = swImpl(tailwindExpr).valueOrAbort
  '{ L.cls := ${ Expr(value) } }
}

extension (inline tailwind: Tailwind) {
  inline def css: String =
    ${ swImpl('tailwind) }
}

def methodNameToTailwindClass(rawName: String) = {
  val name = if (rawName.startsWith("_") && rawName.charAt(1).isDigit) rawName.stripPrefix("_") else rawName
  name.replace("_", "-")
}

def swImpl(tailwindExpr: Expr[Tailwind])(using Quotes): Expr[String] = {
  import quotes.reflect.*
  @SuppressWarnings(
    Array(
      "scalafix:DisableSyntax.var"
    )
  )
  def extractClassNames(term: Term, prefix: String = "", important: Boolean = false): List[String] = {
    var stack      = List((term, prefix, important))
    var classNames = List.empty[String]

    while (stack.nonEmpty) {
      stack.headOption.foreach { (currentTerm, currentPrefix, currentImportant) =>
        stack = stack.drop(1)

        currentTerm match {
          case Apply(Select(inner, "important"), List(styles)) =>
            stack = (styles, currentPrefix, true) :: stack
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Inlined(_, _, inner) =>
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Select(inner, name) =>
            val methodName = methodNameToTailwindClass(name)
            val className  = s"$currentPrefix${if (currentImportant) "!" else ""}${methodName}"
            classNames = classNames :+ className
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Ident("tw") =>
          // No action needed, just continue processing the remaining stack
          case Apply(Ident(name), List(arg)) =>
            val methodName = methodNameToTailwindClass(name)
            val className  = s"$currentPrefix${if (currentImportant) "!" else ""}${methodName}"
            classNames = classNames :+ className
            stack = (arg, currentPrefix, currentImportant) :: stack
          case Apply(Select(inner, name), List(Literal(StringConstant(value)))) if name == "raw" =>
            val className = s"$currentPrefix${if (currentImportant) "!" else ""}$value"
            classNames = classNames :+ className
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Apply(Select(inner, name), List(Literal(StringConstant(opacity)))) if name.endsWith("$") =>
            val methodName = methodNameToTailwindClass(name.stripSuffix("$"))
            val className  = s"$currentPrefix${if (currentImportant) "!" else ""}${methodName}/${opacity}"
            classNames = classNames :+ className
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Apply(Select(inner, name), List(Literal(StringConstant(value)))) =>
            val methodName = methodNameToTailwindClass(name)
            val className  = s"$currentPrefix${if (currentImportant) "!" else ""}${methodName}[$value]"
            classNames = classNames :+ className
            stack = (inner, currentPrefix, currentImportant) :: stack
          case Apply(Apply(Ident(name), args), List(Literal(StringConstant(value)))) =>
            val methodName = methodNameToTailwindClass(name)
            val className  = s"$currentPrefix${if (currentImportant) "!" else ""}${methodName}[$value]"
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
            val methodName   = methodNameToTailwindClass(name)
            val innerClasses = args.flatMap(arg => extractClassNames(arg, s"$currentPrefix${methodName}:"))
            classNames = classNames ++ innerClasses
            stack = (inner, currentPrefix, currentImportant) :: stack
          case unexpectedTerm =>
            report.errorAndAbort(s"Unexpected term: $unexpectedTerm")
        }
      }
    }

    classNames
  }

  val term            = tailwindExpr.asTerm
  val classList       = extractClassNames(term).reverse
  val combinedClasses = classList.mkString(" ")
  Expr(combinedClasses)
}

val tw = Tailwind()

case class Tailwind() {
  def hover(@unused tw: Tailwind)     = this
  def group_hover(@unused tw: Tailwind) = this
  def focus(@unused tw: Tailwind)     = this
  def active(@unused tw: Tailwind)    = this
  def sm(@unused tw: Tailwind)        = this
  def md(@unused tw: Tailwind)        = this
  def lg(@unused tw: Tailwind)        = this
  def xl(@unused tw: Tailwind)        = this
  def _2xl(@unused tw: Tailwind)      = this
  def important(@unused tw: Tailwind) = this
  def raw(@unused tw: String)         = this
  def min_h_(@unused tw: String)      = this
  def w_(@unused tw: String)          = this
  def h_(@unused tw: String)          = this
  def grid_cols_(@unused tw: String)  = this
  def group                           = this
  def flex                            = this
  def flex_1                          = this
  def flex_col                        = this
  def min_h_svh                       = this
  def justify_center                  = this
  def relative                        = this
  def bg_sap_brand                    = this
  def bg_sap_background               = this
  def bg_sap_neutral                  = this
  def text_sap_text                   = this
  def text_sap_brand                  = this
  def border_sap_neutral              = this
  def border_grid                     = this
  def border_border                   = this
  def container_wrapper               = this
  def no_scrollbar                    = this
  def sidebar_item_hover              = this
  def bg_black                        = this
  def sticky                          = this
  def border_b                        = this
  def border_l                        = this
  def border_r                        = this
  def border_t                        = this
  def container                       = this
  def mr_4                            = this
  def mr_6                            = this
  def h_6                             = this
  def h_14                            = this
  def w_6                             = this
  def object_contain                  = this
  def inline_block                    = this
  def font_bold                       = this
  def ml_auto                         = this
  def items_center                    = this
  def gap_2                           = this
  def gap_4                           = this
  def gap_6                           = this
  def gap_10                          = this
  def items_start                     = this
  def grid                            = this
  def py_0                            = this
  def py_4                            = this
  def py_6                            = this
  def py_8                            = this
  def mx_auto                         = this
  def w_full                          = this
  def min_w_0                         = this
  def max_w_2xl                       = this
  def hidden                          = this
  def text_sm                         = this
  def block                           = this
  def top_0                           = this
  def top_20                          = this
  def _mt_6                           = this
  def pt_4                            = this
  def text_balance                    = this
  def text_center                     = this
  def text_left                       = this
  def leading_loose                   = this
  def justify_end                     = this
  def z_50                            = this
  def bg_opacity_95                   = this
  def backdrop_blur                   = this
  def absolute                        = this
  def opacity_0                       = this
  def opacity_10                      = this
  def opacity_50                      = this
  def opacity_80                      = this
  def opacity_100                     = this
  def border_0                        = this
  def rounded                         = this
  def transition_all                  = this
  def duration_300                    = this
  def `gap_0.5`                       = this
  def ease_out                        = this
  def text_white                      = this
  def `h_0.5`                         = this
  def `_bottom_1.5`                   = this
  def space_y_2                       = this
  def h_9                             = this
  def transition_colors               = this
  def m_0                             = this
  def whitespace_pre_wrap             = this
  def rounded_md                      = this
  def overflow_hidden                 = this
  def inline_flex                     = this
  def cursor_pointer                  = this
  def w_9                             = this
  def border_none                     = this
  def outline_none                    = this
  def right_6                         = this
  def top_4                           = this
  def bg_neutral_800                  = this
  def px_3                            = this
  def py_1                            = this
  def mb_4                            = this
  def font_semibold                   = this
  def text_lg                         = this
  def px_8                            = this
  def gap_1                           = this
  def mb_5                            = this
  def z_10                            = this
  def p_10                            = this
  def border                          = this
  def h_full                          = this
  def overflow_y_auto                 = this
  def font_medium                     = this
  def h_8                             = this
  def rounded_lg                      = this
  def font_normal                     = this
  def px_2                            = this
  def grid_flow_row                   = this
  def ml_2                            = this
  def shrink_0                        = this
  def auto_rows_max                   = this
  def overflow_auto                   = this
  def pr_4                            = this
  def fixed                           = this
  def top_14                          = this
  def z_30                            = this
  def ml_0                            = this
  def ml_4                            = this
  def ml_6                            = this
  def ml_8                            = this
  def p_4                             = this
  def space_y_4                       = this
  def flex_wrap                       = this
  def space_x_2                       = this
  def space_x_4                       = this
  def text_green_500                  = this
  def text_red_500                    = this
  def text_orange_500                 = this
  def p_6                             = this
  def text_2xl                        = this
  def mt_0                            = this
  def bg_gray_100                     = this
  def p_2                             = this
  def shadow_md                       = this
  def flex_row                        = this
  def mb_2                            = this
  def bg_gray_200                     = this
  def text_xs                         = this
  def bg_gray_300                     = this
  def text_blue_700                   = this
  def bg_amber_500                    = this
  def bg_amber_100                    = this
  def text_amber_700                  = this
  def text_gray_500                   = this
  def text_gray_700                   = this
  def transition_opacity              = this
  def font_mono                       = this
  def list_inside                     = this
  def list_none                       = this
  def bg_gray_800                     = this
}
