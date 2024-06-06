package scalawind

import scala.quoted.*
import scala.annotation.unused
import japgolly.scalajs.react.vdom.html_<^.*

object clx:
  def apply(styles: String): TagMod = ^.cls := styles
  def :=(styles: String): TagMod = ^.cls := styles

val tw = Tailwind()

implicit inline def sw(inline tailwind: Tailwind): String =
  ${ swImpl('tailwind) }

def methodNameToTailwindClass(rawName: String) =
  val name = if rawName.startsWith("_") && rawName.charAt(1).isDigit then rawName.stripPrefix("_") else rawName
  name.replace("_", "-").replace("per", "/").replace("dot", ".")

def swImpl(tailwindExpr: Expr[Tailwind])(using Quotes): Expr[String] =
  import quotes.reflect.*

  def extractClassNames(term: Term, prefix: String = "", important: Boolean = false): List[String] = {
    var stack = List((term, prefix, important))
    var classNames = List.empty[String]

    while (stack.nonEmpty) {
      val (currentTerm, currentPrefix, currentImportant) = stack.head
      stack = stack.tail

      currentTerm match {
        case Apply(Select(inner, "important"), List(styles)) =>
          stack = (styles, currentPrefix, true) :: stack
          stack = (inner, currentPrefix, currentImportant) :: stack
        case Inlined(_, _, inner) =>
          stack = (inner, currentPrefix, currentImportant) :: stack
        case Select(inner, name) =>
          val methodName = methodNameToTailwindClass(name)
          val className = s"$currentPrefix${if (currentImportant) "!" else ""}${methodName}"
          classNames = classNames :+ className
          stack = (inner, currentPrefix, currentImportant) :: stack
        case Ident("tw") =>
        // No action needed, just continue processing the remaining stack
        case Apply(Ident(name), List(arg)) =>
          val methodName = methodNameToTailwindClass(name)
          val className = s"$currentPrefix${if (currentImportant) "!" else ""}${methodName}"
          classNames = classNames :+ className
          stack = (arg, currentPrefix, currentImportant) :: stack
        case Apply(Select(inner, name), List(Literal(StringConstant(value)))) if name == "raw" =>
          val className = s"$currentPrefix${if (currentImportant) "!" else ""}$value"
          classNames = classNames :+ className
          stack = (inner, currentPrefix, currentImportant) :: stack
        case Apply(Select(inner, name), List(Literal(StringConstant(opacity)))) if name.endsWith("$") =>
          val methodName = methodNameToTailwindClass(name.stripSuffix("$"))
          val className = s"$currentPrefix${if (currentImportant) "!" else ""}${methodName}/${opacity}"
          classNames = classNames :+ className
          stack = (inner, currentPrefix, currentImportant) :: stack
        case Apply(Select(inner, name), List(Literal(StringConstant(value)))) =>
          val methodName = methodNameToTailwindClass(name)
          val className = s"$currentPrefix${if (currentImportant) "!" else ""}${methodName}[$value]"
          classNames = classNames :+ className
          stack = (inner, currentPrefix, currentImportant) :: stack
        case Apply(Apply(Ident(name), args), List(Literal(StringConstant(value)))) =>
          val methodName = methodNameToTailwindClass(name)
          val className = s"$currentPrefix${if (currentImportant) "!" else ""}${methodName}[$value]"
          classNames = classNames :+ className
          stack = args.map(arg => (arg, currentPrefix, currentImportant)) ++ stack
        case Apply(Select(Ident("tw"), name), List(inner)) =>
          val methodName = methodNameToTailwindClass(name)
          stack = (inner, s"$currentPrefix${methodName}:", currentImportant) :: stack
        case Apply(Select(inner, "variant"), List(Literal(StringConstant(selector)), styles)) =>
          val variantPrefix = s"$currentPrefix[$selector]:" // Use the selector as provided
          val styleClasses = extractClassNames(styles, variantPrefix, currentImportant) // Extract classes with the variant prefix
          classNames = classNames ++ styleClasses
          stack = (inner, currentPrefix, currentImportant) :: stack
        case Apply(Select(inner, name), args) =>
          val methodName = methodNameToTailwindClass(name)
          val innerClasses = args.flatMap(arg => extractClassNames(arg, s"$currentPrefix${methodName}:"))
          classNames = classNames ++ innerClasses
          stack = (inner, currentPrefix, currentImportant) :: stack
        case unexpectedTerm =>
          report.errorAndAbort(s"Unexpected term: $unexpectedTerm")
      }
    }
    classNames
  }

  val term = tailwindExpr.asTerm
  val classNames = extractClassNames(term)
  val combinedClasses = classNames.reverse.mkString(" ")
  report.info(s"$combinedClasses")
  Expr(combinedClasses)

case class Tailwind() {
  def first_letter(@unused styles: Tailwind): Tailwind = this
  def first_line(@unused styles: Tailwind): Tailwind = this
  def marker(@unused styles: Tailwind): Tailwind = this
  def selection(@unused styles: Tailwind): Tailwind = this
  def file(@unused styles: Tailwind): Tailwind = this
  def placeholder(@unused styles: Tailwind): Tailwind = this
  def backdrop(@unused styles: Tailwind): Tailwind = this
  def before(@unused styles: Tailwind): Tailwind = this
  def after(@unused styles: Tailwind): Tailwind = this
  def first(@unused styles: Tailwind): Tailwind = this
  def last(@unused styles: Tailwind): Tailwind = this
  def only(@unused styles: Tailwind): Tailwind = this
  def odd(@unused styles: Tailwind): Tailwind = this
  def even(@unused styles: Tailwind): Tailwind = this
  def first_of_type(@unused styles: Tailwind): Tailwind = this
  def last_of_type(@unused styles: Tailwind): Tailwind = this
  def only_of_type(@unused styles: Tailwind): Tailwind = this
  def visited(@unused styles: Tailwind): Tailwind = this
  def target(@unused styles: Tailwind): Tailwind = this
  def open(@unused styles: Tailwind): Tailwind = this
  def default(@unused styles: Tailwind): Tailwind = this
  def checked(@unused styles: Tailwind): Tailwind = this
  def indeterminate(@unused styles: Tailwind): Tailwind = this
  def placeholder_shown(@unused styles: Tailwind): Tailwind = this
  def autofill(@unused styles: Tailwind): Tailwind = this
  def optional(@unused styles: Tailwind): Tailwind = this
  def required(@unused styles: Tailwind): Tailwind = this
  def valid(@unused styles: Tailwind): Tailwind = this
  def invalid(@unused styles: Tailwind): Tailwind = this
  def in_range(@unused styles: Tailwind): Tailwind = this
  def out_of_range(@unused styles: Tailwind): Tailwind = this
  def read_only(@unused styles: Tailwind): Tailwind = this
  def empty(@unused styles: Tailwind): Tailwind = this
  def focus_within(@unused styles: Tailwind): Tailwind = this
  def hover(@unused styles: Tailwind): Tailwind = this
  def focus(@unused styles: Tailwind): Tailwind = this
  def focus_visible(@unused styles: Tailwind): Tailwind = this
  def active(@unused styles: Tailwind): Tailwind = this
  def enabled(@unused styles: Tailwind): Tailwind = this
  def disabled(@unused styles: Tailwind): Tailwind = this
  def group_first(@unused styles: Tailwind): Tailwind = this
  def group_last(@unused styles: Tailwind): Tailwind = this
  def group_only(@unused styles: Tailwind): Tailwind = this
  def group_odd(@unused styles: Tailwind): Tailwind = this
  def group_even(@unused styles: Tailwind): Tailwind = this
  def group_first_of_type(@unused styles: Tailwind): Tailwind = this
  def group_last_of_type(@unused styles: Tailwind): Tailwind = this
  def group_only_of_type(@unused styles: Tailwind): Tailwind = this
  def group_visited(@unused styles: Tailwind): Tailwind = this
  def group_target(@unused styles: Tailwind): Tailwind = this
  def group_open(@unused styles: Tailwind): Tailwind = this
  def group_default(@unused styles: Tailwind): Tailwind = this
  def group_checked(@unused styles: Tailwind): Tailwind = this
  def group_indeterminate(@unused styles: Tailwind): Tailwind = this
  def group_placeholder_shown(@unused styles: Tailwind): Tailwind = this
  def group_autofill(@unused styles: Tailwind): Tailwind = this
  def group_optional(@unused styles: Tailwind): Tailwind = this
  def group_required(@unused styles: Tailwind): Tailwind = this
  def group_valid(@unused styles: Tailwind): Tailwind = this
  def group_invalid(@unused styles: Tailwind): Tailwind = this
  def group_in_range(@unused styles: Tailwind): Tailwind = this
  def group_out_of_range(@unused styles: Tailwind): Tailwind = this
  def group_read_only(@unused styles: Tailwind): Tailwind = this
  def group_empty(@unused styles: Tailwind): Tailwind = this
  def group_focus_within(@unused styles: Tailwind): Tailwind = this
  def group_hover(@unused styles: Tailwind): Tailwind = this
  def group_focus(@unused styles: Tailwind): Tailwind = this
  def group_focus_visible(@unused styles: Tailwind): Tailwind = this
  def group_active(@unused styles: Tailwind): Tailwind = this
  def group_enabled(@unused styles: Tailwind): Tailwind = this
  def group_disabled(@unused styles: Tailwind): Tailwind = this
  def group(@unused styles: Tailwind): Tailwind = this
  def peer_first(@unused styles: Tailwind): Tailwind = this
  def peer_last(@unused styles: Tailwind): Tailwind = this
  def peer_only(@unused styles: Tailwind): Tailwind = this
  def peer_odd(@unused styles: Tailwind): Tailwind = this
  def peer_even(@unused styles: Tailwind): Tailwind = this
  def peer_first_of_type(@unused styles: Tailwind): Tailwind = this
  def peer_last_of_type(@unused styles: Tailwind): Tailwind = this
  def peer_only_of_type(@unused styles: Tailwind): Tailwind = this
  def peer_visited(@unused styles: Tailwind): Tailwind = this
  def peer_target(@unused styles: Tailwind): Tailwind = this
  def peer_open(@unused styles: Tailwind): Tailwind = this
  def peer_default(@unused styles: Tailwind): Tailwind = this
  def peer_checked(@unused styles: Tailwind): Tailwind = this
  def peer_indeterminate(@unused styles: Tailwind): Tailwind = this
  def peer_placeholder_shown(@unused styles: Tailwind): Tailwind = this
  def peer_autofill(@unused styles: Tailwind): Tailwind = this
  def peer_optional(@unused styles: Tailwind): Tailwind = this
  def peer_required(@unused styles: Tailwind): Tailwind = this
  def peer_valid(@unused styles: Tailwind): Tailwind = this
  def peer_invalid(@unused styles: Tailwind): Tailwind = this
  def peer_in_range(@unused styles: Tailwind): Tailwind = this
  def peer_out_of_range(@unused styles: Tailwind): Tailwind = this
  def peer_read_only(@unused styles: Tailwind): Tailwind = this
  def peer_empty(@unused styles: Tailwind): Tailwind = this
  def peer_focus_within(@unused styles: Tailwind): Tailwind = this
  def peer_hover(@unused styles: Tailwind): Tailwind = this
  def peer_focus(@unused styles: Tailwind): Tailwind = this
  def peer_focus_visible(@unused styles: Tailwind): Tailwind = this
  def peer_active(@unused styles: Tailwind): Tailwind = this
  def peer_enabled(@unused styles: Tailwind): Tailwind = this
  def peer_disabled(@unused styles: Tailwind): Tailwind = this
  def peer(@unused styles: Tailwind): Tailwind = this
  def has(@unused styles: Tailwind): Tailwind = this
  def group_has(@unused styles: Tailwind): Tailwind = this
  def peer_has(@unused styles: Tailwind): Tailwind = this
  def aria_busy(@unused styles: Tailwind): Tailwind = this
  def aria_checked(@unused styles: Tailwind): Tailwind = this
  def aria_disabled(@unused styles: Tailwind): Tailwind = this
  def aria_expanded(@unused styles: Tailwind): Tailwind = this
  def aria_hidden(@unused styles: Tailwind): Tailwind = this
  def aria_pressed(@unused styles: Tailwind): Tailwind = this
  def aria_readonly(@unused styles: Tailwind): Tailwind = this
  def aria_required(@unused styles: Tailwind): Tailwind = this
  def aria_selected(@unused styles: Tailwind): Tailwind = this
  def aria(@unused styles: Tailwind): Tailwind = this
  def group_aria_busy(@unused styles: Tailwind): Tailwind = this
  def group_aria_checked(@unused styles: Tailwind): Tailwind = this
  def group_aria_disabled(@unused styles: Tailwind): Tailwind = this
  def group_aria_expanded(@unused styles: Tailwind): Tailwind = this
  def group_aria_hidden(@unused styles: Tailwind): Tailwind = this
  def group_aria_pressed(@unused styles: Tailwind): Tailwind = this
  def group_aria_readonly(@unused styles: Tailwind): Tailwind = this
  def group_aria_required(@unused styles: Tailwind): Tailwind = this
  def group_aria_selected(@unused styles: Tailwind): Tailwind = this
  def group_aria(@unused styles: Tailwind): Tailwind = this
  def peer_aria_busy(@unused styles: Tailwind): Tailwind = this
  def peer_aria_checked(@unused styles: Tailwind): Tailwind = this
  def peer_aria_disabled(@unused styles: Tailwind): Tailwind = this
  def peer_aria_expanded(@unused styles: Tailwind): Tailwind = this
  def peer_aria_hidden(@unused styles: Tailwind): Tailwind = this
  def peer_aria_pressed(@unused styles: Tailwind): Tailwind = this
  def peer_aria_readonly(@unused styles: Tailwind): Tailwind = this
  def peer_aria_required(@unused styles: Tailwind): Tailwind = this
  def peer_aria_selected(@unused styles: Tailwind): Tailwind = this
  def peer_aria(@unused styles: Tailwind): Tailwind = this
  def data(@unused styles: Tailwind): Tailwind = this
  def group_data(@unused styles: Tailwind): Tailwind = this
  def peer_data(@unused styles: Tailwind): Tailwind = this
  def supports(@unused styles: Tailwind): Tailwind = this
  def motion_safe(@unused styles: Tailwind): Tailwind = this
  def motion_reduce(@unused styles: Tailwind): Tailwind = this
  def contrast_more(@unused styles: Tailwind): Tailwind = this
  def contrast_less(@unused styles: Tailwind): Tailwind = this
  def max_sm(@unused styles: Tailwind): Tailwind = this
  def max_md(@unused styles: Tailwind): Tailwind = this
  def max_lg(@unused styles: Tailwind): Tailwind = this
  def max_xl(@unused styles: Tailwind): Tailwind = this
  def max_2xl(@unused styles: Tailwind): Tailwind = this
  def max(@unused styles: Tailwind): Tailwind = this
  def sm(@unused styles: Tailwind): Tailwind = this
  def md(@unused styles: Tailwind): Tailwind = this
  def lg(@unused styles: Tailwind): Tailwind = this
  def xl(@unused styles: Tailwind): Tailwind = this
  def _2xl(@unused styles: Tailwind): Tailwind = this
  def min(@unused styles: Tailwind): Tailwind = this
  def portrait(@unused styles: Tailwind): Tailwind = this
  def landscape(@unused styles: Tailwind): Tailwind = this
  def ltr(@unused styles: Tailwind): Tailwind = this
  def rtl(@unused styles: Tailwind): Tailwind = this
  def dark(@unused styles: Tailwind): Tailwind = this
  def forced_colors(@unused styles: Tailwind): Tailwind = this
  def print(@unused styles: Tailwind): Tailwind = this
  def bg_transparent$(@unused value: String): Tailwind = this
  def bg_current$(@unused value: String): Tailwind = this
  def bg_black$(@unused value: String): Tailwind = this
  def bg_white$(@unused value: String): Tailwind = this
  def bg_red_50$(@unused value: String): Tailwind = this
  def bg_red_100$(@unused value: String): Tailwind = this
  def bg_red_200$(@unused value: String): Tailwind = this
  def bg_red_300$(@unused value: String): Tailwind = this
  def bg_red_400$(@unused value: String): Tailwind = this
  def bg_red_500$(@unused value: String): Tailwind = this
  def bg_red_600$(@unused value: String): Tailwind = this
  def bg_red_700$(@unused value: String): Tailwind = this
  def bg_red_800$(@unused value: String): Tailwind = this
  def bg_red_900$(@unused value: String): Tailwind = this
  def bg_red_950$(@unused value: String): Tailwind = this
  def bg_primary$(@unused value: String): Tailwind = this
  def bg_secondary$(@unused value: String): Tailwind = this
  def text_transparent$(@unused value: String): Tailwind = this
  def text_current$(@unused value: String): Tailwind = this
  def text_black$(@unused value: String): Tailwind = this
  def text_white$(@unused value: String): Tailwind = this
  def text_red_50$(@unused value: String): Tailwind = this
  def text_red_100$(@unused value: String): Tailwind = this
  def text_red_200$(@unused value: String): Tailwind = this
  def text_red_300$(@unused value: String): Tailwind = this
  def text_red_400$(@unused value: String): Tailwind = this
  def text_red_500$(@unused value: String): Tailwind = this
  def text_red_600$(@unused value: String): Tailwind = this
  def text_red_700$(@unused value: String): Tailwind = this
  def text_red_800$(@unused value: String): Tailwind = this
  def text_red_900$(@unused value: String): Tailwind = this
  def text_red_950$(@unused value: String): Tailwind = this
  def text_primary$(@unused value: String): Tailwind = this
  def text_secondary$(@unused value: String): Tailwind = this
  /** {{{
    * .block {
    *   display: block;
    * }
    * }}}
    */
  def block: Tailwind = this
  /** {{{
    * .inline-block {
    *   display: inline-block;
    * }
    * }}}
    */
  def inline_block: Tailwind = this
  /** {{{
    * .inline {
    *   display: inline;
    * }
    * }}}
    */
  def inline: Tailwind = this
  /** {{{
    * .flex {
    *   display: flex;
    * }
    * }}}
    */
  def flex: Tailwind = this
  /** {{{
    * .inline-flex {
    *   display: inline-flex;
    * }
    * }}}
    */
  def inline_flex: Tailwind = this
  /** {{{
    * .table {
    *   display: table;
    * }
    * }}}
    */
  def table: Tailwind = this
  /** {{{
    * .inline-table {
    *   display: inline-table;
    * }
    * }}}
    */
  def inline_table: Tailwind = this
  /** {{{
    * .table-caption {
    *   display: table-caption;
    * }
    * }}}
    */
  def table_caption: Tailwind = this
  /** {{{
    * .table-cell {
    *   display: table-cell;
    * }
    * }}}
    */
  def table_cell: Tailwind = this
  /** {{{
    * .table-column {
    *   display: table-column;
    * }
    * }}}
    */
  def table_column: Tailwind = this
  /** {{{
    * .table-column-group {
    *   display: table-column-group;
    * }
    * }}}
    */
  def table_column_group: Tailwind = this
  /** {{{
    * .table-footer-group {
    *   display: table-footer-group;
    * }
    * }}}
    */
  def table_footer_group: Tailwind = this
  /** {{{
    * .table-header-group {
    *   display: table-header-group;
    * }
    * }}}
    */
  def table_header_group: Tailwind = this
  /** {{{
    * .table-row-group {
    *   display: table-row-group;
    * }
    * }}}
    */
  def table_row_group: Tailwind = this
  /** {{{
    * .table-row {
    *   display: table-row;
    * }
    * }}}
    */
  def table_row: Tailwind = this
  /** {{{
    * .flow-root {
    *   display: flow-root;
    * }
    * }}}
    */
  def flow_root: Tailwind = this
  /** {{{
    * .grid {
    *   display: grid;
    * }
    * }}}
    */
  def grid: Tailwind = this
  /** {{{
    * .inline-grid {
    *   display: inline-grid;
    * }
    * }}}
    */
  def inline_grid: Tailwind = this
  /** {{{
    * .contents {
    *   display: contents;
    * }
    * }}}
    */
  def contents: Tailwind = this
  /** {{{
    * .list-item {
    *   display: list-item;
    * }
    * }}}
    */
  def list_item: Tailwind = this
  /** {{{
    * .hidden {
    *   display: none;
    * }
    * }}}
    */
  def hidden: Tailwind = this
  /** {{{
    * .h-0 {
    *   height: 0;
    * }
    * }}}
    */
  def h_0: Tailwind = this
  /** {{{
    * .h-1 {
    *   height: .25rem;
    * }
    * }}}
    */
  def h_1: Tailwind = this
  /** {{{
    * .h-2 {
    *   height: .5rem;
    * }
    * }}}
    */
  def h_2: Tailwind = this
  /** {{{
    * .h-3 {
    *   height: .75rem;
    * }
    * }}}
    */
  def h_3: Tailwind = this
  /** {{{
    * .h-4 {
    *   height: 1rem;
    * }
    * }}}
    */
  def h_4: Tailwind = this
  /** {{{
    * .h-5 {
    *   height: 1.25rem;
    * }
    * }}}
    */
  def h_5: Tailwind = this
  /** {{{
    * .h-6 {
    *   height: 1.5rem;
    * }
    * }}}
    */
  def h_6: Tailwind = this
  /** {{{
    * .h-7 {
    *   height: 1.75rem;
    * }
    * }}}
    */
  def h_7: Tailwind = this
  /** {{{
    * .h-8 {
    *   height: 2rem;
    * }
    * }}}
    */
  def h_8: Tailwind = this
  /** {{{
    * .h-9 {
    *   height: 2.25rem;
    * }
    * }}}
    */
  def h_9: Tailwind = this
  /** {{{
    * .h-10 {
    *   height: 2.5rem;
    * }
    * }}}
    */
  def h_10: Tailwind = this
  /** {{{
    * .h-11 {
    *   height: 2.75rem;
    * }
    * }}}
    */
  def h_11: Tailwind = this
  /** {{{
    * .h-12 {
    *   height: 3rem;
    * }
    * }}}
    */
  def h_12: Tailwind = this
  /** {{{
    * .h-14 {
    *   height: 3.5rem;
    * }
    * }}}
    */
  def h_14: Tailwind = this
  /** {{{
    * .h-16 {
    *   height: 4rem;
    * }
    * }}}
    */
  def h_16: Tailwind = this
  /** {{{
    * .h-20 {
    *   height: 5rem;
    * }
    * }}}
    */
  def h_20: Tailwind = this
  /** {{{
    * .h-24 {
    *   height: 6rem;
    * }
    * }}}
    */
  def h_24: Tailwind = this
  /** {{{
    * .h-28 {
    *   height: 7rem;
    * }
    * }}}
    */
  def h_28: Tailwind = this
  /** {{{
    * .h-32 {
    *   height: 8rem;
    * }
    * }}}
    */
  def h_32: Tailwind = this
  /** {{{
    * .h-36 {
    *   height: 9rem;
    * }
    * }}}
    */
  def h_36: Tailwind = this
  /** {{{
    * .h-40 {
    *   height: 10rem;
    * }
    * }}}
    */
  def h_40: Tailwind = this
  /** {{{
    * .h-44 {
    *   height: 11rem;
    * }
    * }}}
    */
  def h_44: Tailwind = this
  /** {{{
    * .h-48 {
    *   height: 12rem;
    * }
    * }}}
    */
  def h_48: Tailwind = this
  /** {{{
    * .h-52 {
    *   height: 13rem;
    * }
    * }}}
    */
  def h_52: Tailwind = this
  /** {{{
    * .h-56 {
    *   height: 14rem;
    * }
    * }}}
    */
  def h_56: Tailwind = this
  /** {{{
    * .h-60 {
    *   height: 15rem;
    * }
    * }}}
    */
  def h_60: Tailwind = this
  /** {{{
    * .h-64 {
    *   height: 16rem;
    * }
    * }}}
    */
  def h_64: Tailwind = this
  /** {{{
    * .h-72 {
    *   height: 18rem;
    * }
    * }}}
    */
  def h_72: Tailwind = this
  /** {{{
    * .h-80 {
    *   height: 20rem;
    * }
    * }}}
    */
  def h_80: Tailwind = this
  /** {{{
    * .h-96 {
    *   height: 24rem;
    * }
    * }}}
    */
  def h_96: Tailwind = this
  /** {{{
    * .h-auto {
    *   height: auto;
    * }
    * }}}
    */
  def h_auto: Tailwind = this
  /** {{{
    * .h-px {
    *   height: 1px;
    * }
    * }}}
    */
  def h_px: Tailwind = this
  /** {{{
    * .h-0.5 {
    *   height: .125rem;
    * }
    * }}}
    */
  def h_0dot5: Tailwind = this
  /** {{{
    * .h-1.5 {
    *   height: .375rem;
    * }
    * }}}
    */
  def h_1dot5: Tailwind = this
  /** {{{
    * .h-2.5 {
    *   height: .625rem;
    * }
    * }}}
    */
  def h_2dot5: Tailwind = this
  /** {{{
    * .h-3.5 {
    *   height: .875rem;
    * }
    * }}}
    */
  def h_3dot5: Tailwind = this
  /** {{{
    * .h-1/2 {
    *   height: 50%;
    * }
    * }}}
    */
  def h_1per2: Tailwind = this
  /** {{{
    * .h-1/3 {
    *   height: 33.3333%;
    * }
    * }}}
    */
  def h_1per3: Tailwind = this
  /** {{{
    * .h-2/3 {
    *   height: 66.6667%;
    * }
    * }}}
    */
  def h_2per3: Tailwind = this
  /** {{{
    * .h-1/4 {
    *   height: 25%;
    * }
    * }}}
    */
  def h_1per4: Tailwind = this
  /** {{{
    * .h-2/4 {
    *   height: 50%;
    * }
    * }}}
    */
  def h_2per4: Tailwind = this
  /** {{{
    * .h-3/4 {
    *   height: 75%;
    * }
    * }}}
    */
  def h_3per4: Tailwind = this
  /** {{{
    * .h-1/5 {
    *   height: 20%;
    * }
    * }}}
    */
  def h_1per5: Tailwind = this
  /** {{{
    * .h-2/5 {
    *   height: 40%;
    * }
    * }}}
    */
  def h_2per5: Tailwind = this
  /** {{{
    * .h-3/5 {
    *   height: 60%;
    * }
    * }}}
    */
  def h_3per5: Tailwind = this
  /** {{{
    * .h-4/5 {
    *   height: 80%;
    * }
    * }}}
    */
  def h_4per5: Tailwind = this
  /** {{{
    * .h-1/6 {
    *   height: 16.6667%;
    * }
    * }}}
    */
  def h_1per6: Tailwind = this
  /** {{{
    * .h-2/6 {
    *   height: 33.3333%;
    * }
    * }}}
    */
  def h_2per6: Tailwind = this
  /** {{{
    * .h-3/6 {
    *   height: 50%;
    * }
    * }}}
    */
  def h_3per6: Tailwind = this
  /** {{{
    * .h-4/6 {
    *   height: 66.6667%;
    * }
    * }}}
    */
  def h_4per6: Tailwind = this
  /** {{{
    * .h-5/6 {
    *   height: 83.3333%;
    * }
    * }}}
    */
  def h_5per6: Tailwind = this
  /** {{{
    * .h-full {
    *   height: 100%;
    * }
    * }}}
    */
  def h_full: Tailwind = this
  /** {{{
    * .h-screen {
    *   height: 100vh;
    * }
    * }}}
    */
  def h_screen: Tailwind = this
  /** {{{
    * .h-svh {
    *   height: 100svh;
    * }
    * }}}
    */
  def h_svh: Tailwind = this
  /** {{{
    * .h-lvh {
    *   height: 100lvh;
    * }
    * }}}
    */
  def h_lvh: Tailwind = this
  /** {{{
    * .h-dvh {
    *   height: 100dvh;
    * }
    * }}}
    */
  def h_dvh: Tailwind = this
  /** {{{
    * .h-min {
    *   height: min-content;
    * }
    * }}}
    */
  def h_min: Tailwind = this
  /** {{{
    * .h-max {
    *   height: max-content;
    * }
    * }}}
    */
  def h_max: Tailwind = this
  /** {{{
    * .h-fit {
    *   height: fit-content;
    * }
    * }}}
    */
  def h_fit: Tailwind = this
  /** {{{
    * .w-0 {
    *   width: 0;
    * }
    * }}}
    */
  def w_0: Tailwind = this
  /** {{{
    * .w-1 {
    *   width: .25rem;
    * }
    * }}}
    */
  def w_1: Tailwind = this
  /** {{{
    * .w-2 {
    *   width: .5rem;
    * }
    * }}}
    */
  def w_2: Tailwind = this
  /** {{{
    * .w-3 {
    *   width: .75rem;
    * }
    * }}}
    */
  def w_3: Tailwind = this
  /** {{{
    * .w-4 {
    *   width: 1rem;
    * }
    * }}}
    */
  def w_4: Tailwind = this
  /** {{{
    * .w-5 {
    *   width: 1.25rem;
    * }
    * }}}
    */
  def w_5: Tailwind = this
  /** {{{
    * .w-6 {
    *   width: 1.5rem;
    * }
    * }}}
    */
  def w_6: Tailwind = this
  /** {{{
    * .w-7 {
    *   width: 1.75rem;
    * }
    * }}}
    */
  def w_7: Tailwind = this
  /** {{{
    * .w-8 {
    *   width: 2rem;
    * }
    * }}}
    */
  def w_8: Tailwind = this
  /** {{{
    * .w-9 {
    *   width: 2.25rem;
    * }
    * }}}
    */
  def w_9: Tailwind = this
  /** {{{
    * .w-10 {
    *   width: 2.5rem;
    * }
    * }}}
    */
  def w_10: Tailwind = this
  /** {{{
    * .w-11 {
    *   width: 2.75rem;
    * }
    * }}}
    */
  def w_11: Tailwind = this
  /** {{{
    * .w-12 {
    *   width: 3rem;
    * }
    * }}}
    */
  def w_12: Tailwind = this
  /** {{{
    * .w-14 {
    *   width: 3.5rem;
    * }
    * }}}
    */
  def w_14: Tailwind = this
  /** {{{
    * .w-16 {
    *   width: 4rem;
    * }
    * }}}
    */
  def w_16: Tailwind = this
  /** {{{
    * .w-20 {
    *   width: 5rem;
    * }
    * }}}
    */
  def w_20: Tailwind = this
  /** {{{
    * .w-24 {
    *   width: 6rem;
    * }
    * }}}
    */
  def w_24: Tailwind = this
  /** {{{
    * .w-28 {
    *   width: 7rem;
    * }
    * }}}
    */
  def w_28: Tailwind = this
  /** {{{
    * .w-32 {
    *   width: 8rem;
    * }
    * }}}
    */
  def w_32: Tailwind = this
  /** {{{
    * .w-36 {
    *   width: 9rem;
    * }
    * }}}
    */
  def w_36: Tailwind = this
  /** {{{
    * .w-40 {
    *   width: 10rem;
    * }
    * }}}
    */
  def w_40: Tailwind = this
  /** {{{
    * .w-44 {
    *   width: 11rem;
    * }
    * }}}
    */
  def w_44: Tailwind = this
  /** {{{
    * .w-48 {
    *   width: 12rem;
    * }
    * }}}
    */
  def w_48: Tailwind = this
  /** {{{
    * .w-52 {
    *   width: 13rem;
    * }
    * }}}
    */
  def w_52: Tailwind = this
  /** {{{
    * .w-56 {
    *   width: 14rem;
    * }
    * }}}
    */
  def w_56: Tailwind = this
  /** {{{
    * .w-60 {
    *   width: 15rem;
    * }
    * }}}
    */
  def w_60: Tailwind = this
  /** {{{
    * .w-64 {
    *   width: 16rem;
    * }
    * }}}
    */
  def w_64: Tailwind = this
  /** {{{
    * .w-72 {
    *   width: 18rem;
    * }
    * }}}
    */
  def w_72: Tailwind = this
  /** {{{
    * .w-80 {
    *   width: 20rem;
    * }
    * }}}
    */
  def w_80: Tailwind = this
  /** {{{
    * .w-96 {
    *   width: 24rem;
    * }
    * }}}
    */
  def w_96: Tailwind = this
  /** {{{
    * .w-auto {
    *   width: auto;
    * }
    * }}}
    */
  def w_auto: Tailwind = this
  /** {{{
    * .w-px {
    *   width: 1px;
    * }
    * }}}
    */
  def w_px: Tailwind = this
  /** {{{
    * .w-0.5 {
    *   width: .125rem;
    * }
    * }}}
    */
  def w_0dot5: Tailwind = this
  /** {{{
    * .w-1.5 {
    *   width: .375rem;
    * }
    * }}}
    */
  def w_1dot5: Tailwind = this
  /** {{{
    * .w-2.5 {
    *   width: .625rem;
    * }
    * }}}
    */
  def w_2dot5: Tailwind = this
  /** {{{
    * .w-3.5 {
    *   width: .875rem;
    * }
    * }}}
    */
  def w_3dot5: Tailwind = this
  /** {{{
    * .w-1/2 {
    *   width: 50%;
    * }
    * }}}
    */
  def w_1per2: Tailwind = this
  /** {{{
    * .w-1/3 {
    *   width: 33.3333%;
    * }
    * }}}
    */
  def w_1per3: Tailwind = this
  /** {{{
    * .w-2/3 {
    *   width: 66.6667%;
    * }
    * }}}
    */
  def w_2per3: Tailwind = this
  /** {{{
    * .w-1/4 {
    *   width: 25%;
    * }
    * }}}
    */
  def w_1per4: Tailwind = this
  /** {{{
    * .w-2/4 {
    *   width: 50%;
    * }
    * }}}
    */
  def w_2per4: Tailwind = this
  /** {{{
    * .w-3/4 {
    *   width: 75%;
    * }
    * }}}
    */
  def w_3per4: Tailwind = this
  /** {{{
    * .w-1/5 {
    *   width: 20%;
    * }
    * }}}
    */
  def w_1per5: Tailwind = this
  /** {{{
    * .w-2/5 {
    *   width: 40%;
    * }
    * }}}
    */
  def w_2per5: Tailwind = this
  /** {{{
    * .w-3/5 {
    *   width: 60%;
    * }
    * }}}
    */
  def w_3per5: Tailwind = this
  /** {{{
    * .w-4/5 {
    *   width: 80%;
    * }
    * }}}
    */
  def w_4per5: Tailwind = this
  /** {{{
    * .w-1/6 {
    *   width: 16.6667%;
    * }
    * }}}
    */
  def w_1per6: Tailwind = this
  /** {{{
    * .w-2/6 {
    *   width: 33.3333%;
    * }
    * }}}
    */
  def w_2per6: Tailwind = this
  /** {{{
    * .w-3/6 {
    *   width: 50%;
    * }
    * }}}
    */
  def w_3per6: Tailwind = this
  /** {{{
    * .w-4/6 {
    *   width: 66.6667%;
    * }
    * }}}
    */
  def w_4per6: Tailwind = this
  /** {{{
    * .w-5/6 {
    *   width: 83.3333%;
    * }
    * }}}
    */
  def w_5per6: Tailwind = this
  /** {{{
    * .w-1/12 {
    *   width: 8.33333%;
    * }
    * }}}
    */
  def w_1per12: Tailwind = this
  /** {{{
    * .w-2/12 {
    *   width: 16.6667%;
    * }
    * }}}
    */
  def w_2per12: Tailwind = this
  /** {{{
    * .w-3/12 {
    *   width: 25%;
    * }
    * }}}
    */
  def w_3per12: Tailwind = this
  /** {{{
    * .w-4/12 {
    *   width: 33.3333%;
    * }
    * }}}
    */
  def w_4per12: Tailwind = this
  /** {{{
    * .w-5/12 {
    *   width: 41.6667%;
    * }
    * }}}
    */
  def w_5per12: Tailwind = this
  /** {{{
    * .w-6/12 {
    *   width: 50%;
    * }
    * }}}
    */
  def w_6per12: Tailwind = this
  /** {{{
    * .w-7/12 {
    *   width: 58.3333%;
    * }
    * }}}
    */
  def w_7per12: Tailwind = this
  /** {{{
    * .w-8/12 {
    *   width: 66.6667%;
    * }
    * }}}
    */
  def w_8per12: Tailwind = this
  /** {{{
    * .w-9/12 {
    *   width: 75%;
    * }
    * }}}
    */
  def w_9per12: Tailwind = this
  /** {{{
    * .w-10/12 {
    *   width: 83.3333%;
    * }
    * }}}
    */
  def w_10per12: Tailwind = this
  /** {{{
    * .w-11/12 {
    *   width: 91.6667%;
    * }
    * }}}
    */
  def w_11per12: Tailwind = this
  /** {{{
    * .w-full {
    *   width: 100%;
    * }
    * }}}
    */
  def w_full: Tailwind = this
  /** {{{
    * .w-screen {
    *   width: 100vw;
    * }
    * }}}
    */
  def w_screen: Tailwind = this
  /** {{{
    * .w-svw {
    *   width: 100svw;
    * }
    * }}}
    */
  def w_svw: Tailwind = this
  /** {{{
    * .w-lvw {
    *   width: 100lvw;
    * }
    * }}}
    */
  def w_lvw: Tailwind = this
  /** {{{
    * .w-dvw {
    *   width: 100dvw;
    * }
    * }}}
    */
  def w_dvw: Tailwind = this
  /** {{{
    * .w-min {
    *   width: min-content;
    * }
    * }}}
    */
  def w_min: Tailwind = this
  /** {{{
    * .w-max {
    *   width: max-content;
    * }
    * }}}
    */
  def w_max: Tailwind = this
  /** {{{
    * .w-fit {
    *   width: fit-content;
    * }
    * }}}
    */
  def w_fit: Tailwind = this
  /** {{{
    * .items-start {
    *   align-items: flex-start;
    * }
    * }}}
    */
  def items_start: Tailwind = this
  /** {{{
    * .items-end {
    *   align-items: flex-end;
    * }
    * }}}
    */
  def items_end: Tailwind = this
  /** {{{
    * .items-center {
    *   align-items: center;
    * }
    * }}}
    */
  def items_center: Tailwind = this
  /** {{{
    * .items-baseline {
    *   align-items: baseline;
    * }
    * }}}
    */
  def items_baseline: Tailwind = this
  /** {{{
    * .items-stretch {
    *   align-items: stretch;
    * }
    * }}}
    */
  def items_stretch: Tailwind = this
  /** {{{
    * .justify-normal {
    *   justify-content: normal;
    * }
    * }}}
    */
  def justify_normal: Tailwind = this
  /** {{{
    * .justify-start {
    *   justify-content: flex-start;
    * }
    * }}}
    */
  def justify_start: Tailwind = this
  /** {{{
    * .justify-end {
    *   justify-content: flex-end;
    * }
    * }}}
    */
  def justify_end: Tailwind = this
  /** {{{
    * .justify-center {
    *   justify-content: center;
    * }
    * }}}
    */
  def justify_center: Tailwind = this
  /** {{{
    * .justify-between {
    *   justify-content: space-between;
    * }
    * }}}
    */
  def justify_between: Tailwind = this
  /** {{{
    * .justify-around {
    *   justify-content: space-around;
    * }
    * }}}
    */
  def justify_around: Tailwind = this
  /** {{{
    * .justify-evenly {
    *   justify-content: space-evenly;
    * }
    * }}}
    */
  def justify_evenly: Tailwind = this
  /** {{{
    * .justify-stretch {
    *   justify-content: stretch;
    * }
    * }}}
    */
  def justify_stretch: Tailwind = this
  /** {{{
    * .bg-transparent {
    *   background-color: #0000;
    * }
    * }}}
    */
  def bg_transparent: Tailwind = this
  /** {{{
    * .bg-current {
    *   background-color: currentColor;
    * }
    * }}}
    */
  def bg_current: Tailwind = this
  /** {{{
    * .bg-black {
    *   background-color: #000;
    * }
    * }}}
    */
  def bg_black: Tailwind = this
  /** {{{
    * .bg-white {
    *   background-color: #fff;
    * }
    * }}}
    */
  def bg_white: Tailwind = this
  /** {{{
    * .bg-red-50 {
    *   background-color: #fef2f2;
    * }
    * }}}
    */
  def bg_red_50: Tailwind = this
  /** {{{
    * .bg-red-100 {
    *   background-color: #fee2e2;
    * }
    * }}}
    */
  def bg_red_100: Tailwind = this
  /** {{{
    * .bg-red-200 {
    *   background-color: #fecaca;
    * }
    * }}}
    */
  def bg_red_200: Tailwind = this
  /** {{{
    * .bg-red-300 {
    *   background-color: #fca5a5;
    * }
    * }}}
    */
  def bg_red_300: Tailwind = this
  /** {{{
    * .bg-red-400 {
    *   background-color: #f87171;
    * }
    * }}}
    */
  def bg_red_400: Tailwind = this
  /** {{{
    * .bg-red-500 {
    *   background-color: #ef4444;
    * }
    * }}}
    */
  def bg_red_500: Tailwind = this
  /** {{{
    * .bg-red-600 {
    *   background-color: #dc2626;
    * }
    * }}}
    */
  def bg_red_600: Tailwind = this
  /** {{{
    * .bg-red-700 {
    *   background-color: #b91c1c;
    * }
    * }}}
    */
  def bg_red_700: Tailwind = this
  /** {{{
    * .bg-red-800 {
    *   background-color: #991b1b;
    * }
    * }}}
    */
  def bg_red_800: Tailwind = this
  /** {{{
    * .bg-red-900 {
    *   background-color: #7f1d1d;
    * }
    * }}}
    */
  def bg_red_900: Tailwind = this
  /** {{{
    * .bg-red-950 {
    *   background-color: #450a0a;
    * }
    * }}}
    */
  def bg_red_950: Tailwind = this
  /** {{{
    * .bg-primary {
    *   background-color: #de3423;
    * }
    * }}}
    */
  def bg_primary: Tailwind = this
  /** {{{
    * .bg-secondary {
    *   background-color: #380d09;
    * }
    * }}}
    */
  def bg_secondary: Tailwind = this
  /** {{{
    * .p-0 {
    *   padding: 0;
    * }
    * }}}
    */
  def p_0: Tailwind = this
  /** {{{
    * .p-1 {
    *   padding: .25rem;
    * }
    * }}}
    */
  def p_1: Tailwind = this
  /** {{{
    * .p-2 {
    *   padding: .5rem;
    * }
    * }}}
    */
  def p_2: Tailwind = this
  /** {{{
    * .p-3 {
    *   padding: .75rem;
    * }
    * }}}
    */
  def p_3: Tailwind = this
  /** {{{
    * .p-4 {
    *   padding: 1rem;
    * }
    * }}}
    */
  def p_4: Tailwind = this
  /** {{{
    * .p-5 {
    *   padding: 1.25rem;
    * }
    * }}}
    */
  def p_5: Tailwind = this
  /** {{{
    * .p-6 {
    *   padding: 1.5rem;
    * }
    * }}}
    */
  def p_6: Tailwind = this
  /** {{{
    * .p-7 {
    *   padding: 1.75rem;
    * }
    * }}}
    */
  def p_7: Tailwind = this
  /** {{{
    * .p-8 {
    *   padding: 2rem;
    * }
    * }}}
    */
  def p_8: Tailwind = this
  /** {{{
    * .p-9 {
    *   padding: 2.25rem;
    * }
    * }}}
    */
  def p_9: Tailwind = this
  /** {{{
    * .p-10 {
    *   padding: 2.5rem;
    * }
    * }}}
    */
  def p_10: Tailwind = this
  /** {{{
    * .p-11 {
    *   padding: 2.75rem;
    * }
    * }}}
    */
  def p_11: Tailwind = this
  /** {{{
    * .p-12 {
    *   padding: 3rem;
    * }
    * }}}
    */
  def p_12: Tailwind = this
  /** {{{
    * .p-14 {
    *   padding: 3.5rem;
    * }
    * }}}
    */
  def p_14: Tailwind = this
  /** {{{
    * .p-16 {
    *   padding: 4rem;
    * }
    * }}}
    */
  def p_16: Tailwind = this
  /** {{{
    * .p-20 {
    *   padding: 5rem;
    * }
    * }}}
    */
  def p_20: Tailwind = this
  /** {{{
    * .p-24 {
    *   padding: 6rem;
    * }
    * }}}
    */
  def p_24: Tailwind = this
  /** {{{
    * .p-28 {
    *   padding: 7rem;
    * }
    * }}}
    */
  def p_28: Tailwind = this
  /** {{{
    * .p-32 {
    *   padding: 8rem;
    * }
    * }}}
    */
  def p_32: Tailwind = this
  /** {{{
    * .p-36 {
    *   padding: 9rem;
    * }
    * }}}
    */
  def p_36: Tailwind = this
  /** {{{
    * .p-40 {
    *   padding: 10rem;
    * }
    * }}}
    */
  def p_40: Tailwind = this
  /** {{{
    * .p-44 {
    *   padding: 11rem;
    * }
    * }}}
    */
  def p_44: Tailwind = this
  /** {{{
    * .p-48 {
    *   padding: 12rem;
    * }
    * }}}
    */
  def p_48: Tailwind = this
  /** {{{
    * .p-52 {
    *   padding: 13rem;
    * }
    * }}}
    */
  def p_52: Tailwind = this
  /** {{{
    * .p-56 {
    *   padding: 14rem;
    * }
    * }}}
    */
  def p_56: Tailwind = this
  /** {{{
    * .p-60 {
    *   padding: 15rem;
    * }
    * }}}
    */
  def p_60: Tailwind = this
  /** {{{
    * .p-64 {
    *   padding: 16rem;
    * }
    * }}}
    */
  def p_64: Tailwind = this
  /** {{{
    * .p-72 {
    *   padding: 18rem;
    * }
    * }}}
    */
  def p_72: Tailwind = this
  /** {{{
    * .p-80 {
    *   padding: 20rem;
    * }
    * }}}
    */
  def p_80: Tailwind = this
  /** {{{
    * .p-96 {
    *   padding: 24rem;
    * }
    * }}}
    */
  def p_96: Tailwind = this
  /** {{{
    * .p-px {
    *   padding: 1px;
    * }
    * }}}
    */
  def p_px: Tailwind = this
  /** {{{
    * .p-0.5 {
    *   padding: .125rem;
    * }
    * }}}
    */
  def p_0dot5: Tailwind = this
  /** {{{
    * .p-1.5 {
    *   padding: .375rem;
    * }
    * }}}
    */
  def p_1dot5: Tailwind = this
  /** {{{
    * .p-2.5 {
    *   padding: .625rem;
    * }
    * }}}
    */
  def p_2dot5: Tailwind = this
  /** {{{
    * .p-3.5 {
    *   padding: .875rem;
    * }
    * }}}
    */
  def p_3dot5: Tailwind = this
  /** {{{
    * .px-0 {
    *   padding-left: 0;
    *   padding-right: 0;
    * }
    * }}}
    */
  def px_0: Tailwind = this
  /** {{{
    * .px-1 {
    *   padding-left: .25rem;
    *   padding-right: .25rem;
    * }
    * }}}
    */
  def px_1: Tailwind = this
  /** {{{
    * .px-2 {
    *   padding-left: .5rem;
    *   padding-right: .5rem;
    * }
    * }}}
    */
  def px_2: Tailwind = this
  /** {{{
    * .px-3 {
    *   padding-left: .75rem;
    *   padding-right: .75rem;
    * }
    * }}}
    */
  def px_3: Tailwind = this
  /** {{{
    * .px-4 {
    *   padding-left: 1rem;
    *   padding-right: 1rem;
    * }
    * }}}
    */
  def px_4: Tailwind = this
  /** {{{
    * .px-5 {
    *   padding-left: 1.25rem;
    *   padding-right: 1.25rem;
    * }
    * }}}
    */
  def px_5: Tailwind = this
  /** {{{
    * .px-6 {
    *   padding-left: 1.5rem;
    *   padding-right: 1.5rem;
    * }
    * }}}
    */
  def px_6: Tailwind = this
  /** {{{
    * .px-7 {
    *   padding-left: 1.75rem;
    *   padding-right: 1.75rem;
    * }
    * }}}
    */
  def px_7: Tailwind = this
  /** {{{
    * .px-8 {
    *   padding-left: 2rem;
    *   padding-right: 2rem;
    * }
    * }}}
    */
  def px_8: Tailwind = this
  /** {{{
    * .px-9 {
    *   padding-left: 2.25rem;
    *   padding-right: 2.25rem;
    * }
    * }}}
    */
  def px_9: Tailwind = this
  /** {{{
    * .px-10 {
    *   padding-left: 2.5rem;
    *   padding-right: 2.5rem;
    * }
    * }}}
    */
  def px_10: Tailwind = this
  /** {{{
    * .px-11 {
    *   padding-left: 2.75rem;
    *   padding-right: 2.75rem;
    * }
    * }}}
    */
  def px_11: Tailwind = this
  /** {{{
    * .px-12 {
    *   padding-left: 3rem;
    *   padding-right: 3rem;
    * }
    * }}}
    */
  def px_12: Tailwind = this
  /** {{{
    * .px-14 {
    *   padding-left: 3.5rem;
    *   padding-right: 3.5rem;
    * }
    * }}}
    */
  def px_14: Tailwind = this
  /** {{{
    * .px-16 {
    *   padding-left: 4rem;
    *   padding-right: 4rem;
    * }
    * }}}
    */
  def px_16: Tailwind = this
  /** {{{
    * .px-20 {
    *   padding-left: 5rem;
    *   padding-right: 5rem;
    * }
    * }}}
    */
  def px_20: Tailwind = this
  /** {{{
    * .px-24 {
    *   padding-left: 6rem;
    *   padding-right: 6rem;
    * }
    * }}}
    */
  def px_24: Tailwind = this
  /** {{{
    * .px-28 {
    *   padding-left: 7rem;
    *   padding-right: 7rem;
    * }
    * }}}
    */
  def px_28: Tailwind = this
  /** {{{
    * .px-32 {
    *   padding-left: 8rem;
    *   padding-right: 8rem;
    * }
    * }}}
    */
  def px_32: Tailwind = this
  /** {{{
    * .px-36 {
    *   padding-left: 9rem;
    *   padding-right: 9rem;
    * }
    * }}}
    */
  def px_36: Tailwind = this
  /** {{{
    * .px-40 {
    *   padding-left: 10rem;
    *   padding-right: 10rem;
    * }
    * }}}
    */
  def px_40: Tailwind = this
  /** {{{
    * .px-44 {
    *   padding-left: 11rem;
    *   padding-right: 11rem;
    * }
    * }}}
    */
  def px_44: Tailwind = this
  /** {{{
    * .px-48 {
    *   padding-left: 12rem;
    *   padding-right: 12rem;
    * }
    * }}}
    */
  def px_48: Tailwind = this
  /** {{{
    * .px-52 {
    *   padding-left: 13rem;
    *   padding-right: 13rem;
    * }
    * }}}
    */
  def px_52: Tailwind = this
  /** {{{
    * .px-56 {
    *   padding-left: 14rem;
    *   padding-right: 14rem;
    * }
    * }}}
    */
  def px_56: Tailwind = this
  /** {{{
    * .px-60 {
    *   padding-left: 15rem;
    *   padding-right: 15rem;
    * }
    * }}}
    */
  def px_60: Tailwind = this
  /** {{{
    * .px-64 {
    *   padding-left: 16rem;
    *   padding-right: 16rem;
    * }
    * }}}
    */
  def px_64: Tailwind = this
  /** {{{
    * .px-72 {
    *   padding-left: 18rem;
    *   padding-right: 18rem;
    * }
    * }}}
    */
  def px_72: Tailwind = this
  /** {{{
    * .px-80 {
    *   padding-left: 20rem;
    *   padding-right: 20rem;
    * }
    * }}}
    */
  def px_80: Tailwind = this
  /** {{{
    * .px-96 {
    *   padding-left: 24rem;
    *   padding-right: 24rem;
    * }
    * }}}
    */
  def px_96: Tailwind = this
  /** {{{
    * .px-px {
    *   padding-left: 1px;
    *   padding-right: 1px;
    * }
    * }}}
    */
  def px_px: Tailwind = this
  /** {{{
    * .px-0.5 {
    *   padding-left: .125rem;
    *   padding-right: .125rem;
    * }
    * }}}
    */
  def px_0dot5: Tailwind = this
  /** {{{
    * .px-1.5 {
    *   padding-left: .375rem;
    *   padding-right: .375rem;
    * }
    * }}}
    */
  def px_1dot5: Tailwind = this
  /** {{{
    * .px-2.5 {
    *   padding-left: .625rem;
    *   padding-right: .625rem;
    * }
    * }}}
    */
  def px_2dot5: Tailwind = this
  /** {{{
    * .px-3.5 {
    *   padding-left: .875rem;
    *   padding-right: .875rem;
    * }
    * }}}
    */
  def px_3dot5: Tailwind = this
  /** {{{
    * .py-0 {
    *   padding-top: 0;
    *   padding-bottom: 0;
    * }
    * }}}
    */
  def py_0: Tailwind = this
  /** {{{
    * .py-1 {
    *   padding-top: .25rem;
    *   padding-bottom: .25rem;
    * }
    * }}}
    */
  def py_1: Tailwind = this
  /** {{{
    * .py-2 {
    *   padding-top: .5rem;
    *   padding-bottom: .5rem;
    * }
    * }}}
    */
  def py_2: Tailwind = this
  /** {{{
    * .py-3 {
    *   padding-top: .75rem;
    *   padding-bottom: .75rem;
    * }
    * }}}
    */
  def py_3: Tailwind = this
  /** {{{
    * .py-4 {
    *   padding-top: 1rem;
    *   padding-bottom: 1rem;
    * }
    * }}}
    */
  def py_4: Tailwind = this
  /** {{{
    * .py-5 {
    *   padding-top: 1.25rem;
    *   padding-bottom: 1.25rem;
    * }
    * }}}
    */
  def py_5: Tailwind = this
  /** {{{
    * .py-6 {
    *   padding-top: 1.5rem;
    *   padding-bottom: 1.5rem;
    * }
    * }}}
    */
  def py_6: Tailwind = this
  /** {{{
    * .py-7 {
    *   padding-top: 1.75rem;
    *   padding-bottom: 1.75rem;
    * }
    * }}}
    */
  def py_7: Tailwind = this
  /** {{{
    * .py-8 {
    *   padding-top: 2rem;
    *   padding-bottom: 2rem;
    * }
    * }}}
    */
  def py_8: Tailwind = this
  /** {{{
    * .py-9 {
    *   padding-top: 2.25rem;
    *   padding-bottom: 2.25rem;
    * }
    * }}}
    */
  def py_9: Tailwind = this
  /** {{{
    * .py-10 {
    *   padding-top: 2.5rem;
    *   padding-bottom: 2.5rem;
    * }
    * }}}
    */
  def py_10: Tailwind = this
  /** {{{
    * .py-11 {
    *   padding-top: 2.75rem;
    *   padding-bottom: 2.75rem;
    * }
    * }}}
    */
  def py_11: Tailwind = this
  /** {{{
    * .py-12 {
    *   padding-top: 3rem;
    *   padding-bottom: 3rem;
    * }
    * }}}
    */
  def py_12: Tailwind = this
  /** {{{
    * .py-14 {
    *   padding-top: 3.5rem;
    *   padding-bottom: 3.5rem;
    * }
    * }}}
    */
  def py_14: Tailwind = this
  /** {{{
    * .py-16 {
    *   padding-top: 4rem;
    *   padding-bottom: 4rem;
    * }
    * }}}
    */
  def py_16: Tailwind = this
  /** {{{
    * .py-20 {
    *   padding-top: 5rem;
    *   padding-bottom: 5rem;
    * }
    * }}}
    */
  def py_20: Tailwind = this
  /** {{{
    * .py-24 {
    *   padding-top: 6rem;
    *   padding-bottom: 6rem;
    * }
    * }}}
    */
  def py_24: Tailwind = this
  /** {{{
    * .py-28 {
    *   padding-top: 7rem;
    *   padding-bottom: 7rem;
    * }
    * }}}
    */
  def py_28: Tailwind = this
  /** {{{
    * .py-32 {
    *   padding-top: 8rem;
    *   padding-bottom: 8rem;
    * }
    * }}}
    */
  def py_32: Tailwind = this
  /** {{{
    * .py-36 {
    *   padding-top: 9rem;
    *   padding-bottom: 9rem;
    * }
    * }}}
    */
  def py_36: Tailwind = this
  /** {{{
    * .py-40 {
    *   padding-top: 10rem;
    *   padding-bottom: 10rem;
    * }
    * }}}
    */
  def py_40: Tailwind = this
  /** {{{
    * .py-44 {
    *   padding-top: 11rem;
    *   padding-bottom: 11rem;
    * }
    * }}}
    */
  def py_44: Tailwind = this
  /** {{{
    * .py-48 {
    *   padding-top: 12rem;
    *   padding-bottom: 12rem;
    * }
    * }}}
    */
  def py_48: Tailwind = this
  /** {{{
    * .py-52 {
    *   padding-top: 13rem;
    *   padding-bottom: 13rem;
    * }
    * }}}
    */
  def py_52: Tailwind = this
  /** {{{
    * .py-56 {
    *   padding-top: 14rem;
    *   padding-bottom: 14rem;
    * }
    * }}}
    */
  def py_56: Tailwind = this
  /** {{{
    * .py-60 {
    *   padding-top: 15rem;
    *   padding-bottom: 15rem;
    * }
    * }}}
    */
  def py_60: Tailwind = this
  /** {{{
    * .py-64 {
    *   padding-top: 16rem;
    *   padding-bottom: 16rem;
    * }
    * }}}
    */
  def py_64: Tailwind = this
  /** {{{
    * .py-72 {
    *   padding-top: 18rem;
    *   padding-bottom: 18rem;
    * }
    * }}}
    */
  def py_72: Tailwind = this
  /** {{{
    * .py-80 {
    *   padding-top: 20rem;
    *   padding-bottom: 20rem;
    * }
    * }}}
    */
  def py_80: Tailwind = this
  /** {{{
    * .py-96 {
    *   padding-top: 24rem;
    *   padding-bottom: 24rem;
    * }
    * }}}
    */
  def py_96: Tailwind = this
  /** {{{
    * .py-px {
    *   padding-top: 1px;
    *   padding-bottom: 1px;
    * }
    * }}}
    */
  def py_px: Tailwind = this
  /** {{{
    * .py-0.5 {
    *   padding-top: .125rem;
    *   padding-bottom: .125rem;
    * }
    * }}}
    */
  def py_0dot5: Tailwind = this
  /** {{{
    * .py-1.5 {
    *   padding-top: .375rem;
    *   padding-bottom: .375rem;
    * }
    * }}}
    */
  def py_1dot5: Tailwind = this
  /** {{{
    * .py-2.5 {
    *   padding-top: .625rem;
    *   padding-bottom: .625rem;
    * }
    * }}}
    */
  def py_2dot5: Tailwind = this
  /** {{{
    * .py-3.5 {
    *   padding-top: .875rem;
    *   padding-bottom: .875rem;
    * }
    * }}}
    */
  def py_3dot5: Tailwind = this
  /** {{{
    * .ps-0 {
    *   padding-inline-start: 0;
    * }
    * }}}
    */
  def ps_0: Tailwind = this
  /** {{{
    * .ps-1 {
    *   padding-inline-start: .25rem;
    * }
    * }}}
    */
  def ps_1: Tailwind = this
  /** {{{
    * .ps-2 {
    *   padding-inline-start: .5rem;
    * }
    * }}}
    */
  def ps_2: Tailwind = this
  /** {{{
    * .ps-3 {
    *   padding-inline-start: .75rem;
    * }
    * }}}
    */
  def ps_3: Tailwind = this
  /** {{{
    * .ps-4 {
    *   padding-inline-start: 1rem;
    * }
    * }}}
    */
  def ps_4: Tailwind = this
  /** {{{
    * .ps-5 {
    *   padding-inline-start: 1.25rem;
    * }
    * }}}
    */
  def ps_5: Tailwind = this
  /** {{{
    * .ps-6 {
    *   padding-inline-start: 1.5rem;
    * }
    * }}}
    */
  def ps_6: Tailwind = this
  /** {{{
    * .ps-7 {
    *   padding-inline-start: 1.75rem;
    * }
    * }}}
    */
  def ps_7: Tailwind = this
  /** {{{
    * .ps-8 {
    *   padding-inline-start: 2rem;
    * }
    * }}}
    */
  def ps_8: Tailwind = this
  /** {{{
    * .ps-9 {
    *   padding-inline-start: 2.25rem;
    * }
    * }}}
    */
  def ps_9: Tailwind = this
  /** {{{
    * .ps-10 {
    *   padding-inline-start: 2.5rem;
    * }
    * }}}
    */
  def ps_10: Tailwind = this
  /** {{{
    * .ps-11 {
    *   padding-inline-start: 2.75rem;
    * }
    * }}}
    */
  def ps_11: Tailwind = this
  /** {{{
    * .ps-12 {
    *   padding-inline-start: 3rem;
    * }
    * }}}
    */
  def ps_12: Tailwind = this
  /** {{{
    * .ps-14 {
    *   padding-inline-start: 3.5rem;
    * }
    * }}}
    */
  def ps_14: Tailwind = this
  /** {{{
    * .ps-16 {
    *   padding-inline-start: 4rem;
    * }
    * }}}
    */
  def ps_16: Tailwind = this
  /** {{{
    * .ps-20 {
    *   padding-inline-start: 5rem;
    * }
    * }}}
    */
  def ps_20: Tailwind = this
  /** {{{
    * .ps-24 {
    *   padding-inline-start: 6rem;
    * }
    * }}}
    */
  def ps_24: Tailwind = this
  /** {{{
    * .ps-28 {
    *   padding-inline-start: 7rem;
    * }
    * }}}
    */
  def ps_28: Tailwind = this
  /** {{{
    * .ps-32 {
    *   padding-inline-start: 8rem;
    * }
    * }}}
    */
  def ps_32: Tailwind = this
  /** {{{
    * .ps-36 {
    *   padding-inline-start: 9rem;
    * }
    * }}}
    */
  def ps_36: Tailwind = this
  /** {{{
    * .ps-40 {
    *   padding-inline-start: 10rem;
    * }
    * }}}
    */
  def ps_40: Tailwind = this
  /** {{{
    * .ps-44 {
    *   padding-inline-start: 11rem;
    * }
    * }}}
    */
  def ps_44: Tailwind = this
  /** {{{
    * .ps-48 {
    *   padding-inline-start: 12rem;
    * }
    * }}}
    */
  def ps_48: Tailwind = this
  /** {{{
    * .ps-52 {
    *   padding-inline-start: 13rem;
    * }
    * }}}
    */
  def ps_52: Tailwind = this
  /** {{{
    * .ps-56 {
    *   padding-inline-start: 14rem;
    * }
    * }}}
    */
  def ps_56: Tailwind = this
  /** {{{
    * .ps-60 {
    *   padding-inline-start: 15rem;
    * }
    * }}}
    */
  def ps_60: Tailwind = this
  /** {{{
    * .ps-64 {
    *   padding-inline-start: 16rem;
    * }
    * }}}
    */
  def ps_64: Tailwind = this
  /** {{{
    * .ps-72 {
    *   padding-inline-start: 18rem;
    * }
    * }}}
    */
  def ps_72: Tailwind = this
  /** {{{
    * .ps-80 {
    *   padding-inline-start: 20rem;
    * }
    * }}}
    */
  def ps_80: Tailwind = this
  /** {{{
    * .ps-96 {
    *   padding-inline-start: 24rem;
    * }
    * }}}
    */
  def ps_96: Tailwind = this
  /** {{{
    * .ps-px {
    *   padding-inline-start: 1px;
    * }
    * }}}
    */
  def ps_px: Tailwind = this
  /** {{{
    * .ps-0.5 {
    *   padding-inline-start: .125rem;
    * }
    * }}}
    */
  def ps_0dot5: Tailwind = this
  /** {{{
    * .ps-1.5 {
    *   padding-inline-start: .375rem;
    * }
    * }}}
    */
  def ps_1dot5: Tailwind = this
  /** {{{
    * .ps-2.5 {
    *   padding-inline-start: .625rem;
    * }
    * }}}
    */
  def ps_2dot5: Tailwind = this
  /** {{{
    * .ps-3.5 {
    *   padding-inline-start: .875rem;
    * }
    * }}}
    */
  def ps_3dot5: Tailwind = this
  /** {{{
    * .pe-0 {
    *   padding-inline-end: 0;
    * }
    * }}}
    */
  def pe_0: Tailwind = this
  /** {{{
    * .pe-1 {
    *   padding-inline-end: .25rem;
    * }
    * }}}
    */
  def pe_1: Tailwind = this
  /** {{{
    * .pe-2 {
    *   padding-inline-end: .5rem;
    * }
    * }}}
    */
  def pe_2: Tailwind = this
  /** {{{
    * .pe-3 {
    *   padding-inline-end: .75rem;
    * }
    * }}}
    */
  def pe_3: Tailwind = this
  /** {{{
    * .pe-4 {
    *   padding-inline-end: 1rem;
    * }
    * }}}
    */
  def pe_4: Tailwind = this
  /** {{{
    * .pe-5 {
    *   padding-inline-end: 1.25rem;
    * }
    * }}}
    */
  def pe_5: Tailwind = this
  /** {{{
    * .pe-6 {
    *   padding-inline-end: 1.5rem;
    * }
    * }}}
    */
  def pe_6: Tailwind = this
  /** {{{
    * .pe-7 {
    *   padding-inline-end: 1.75rem;
    * }
    * }}}
    */
  def pe_7: Tailwind = this
  /** {{{
    * .pe-8 {
    *   padding-inline-end: 2rem;
    * }
    * }}}
    */
  def pe_8: Tailwind = this
  /** {{{
    * .pe-9 {
    *   padding-inline-end: 2.25rem;
    * }
    * }}}
    */
  def pe_9: Tailwind = this
  /** {{{
    * .pe-10 {
    *   padding-inline-end: 2.5rem;
    * }
    * }}}
    */
  def pe_10: Tailwind = this
  /** {{{
    * .pe-11 {
    *   padding-inline-end: 2.75rem;
    * }
    * }}}
    */
  def pe_11: Tailwind = this
  /** {{{
    * .pe-12 {
    *   padding-inline-end: 3rem;
    * }
    * }}}
    */
  def pe_12: Tailwind = this
  /** {{{
    * .pe-14 {
    *   padding-inline-end: 3.5rem;
    * }
    * }}}
    */
  def pe_14: Tailwind = this
  /** {{{
    * .pe-16 {
    *   padding-inline-end: 4rem;
    * }
    * }}}
    */
  def pe_16: Tailwind = this
  /** {{{
    * .pe-20 {
    *   padding-inline-end: 5rem;
    * }
    * }}}
    */
  def pe_20: Tailwind = this
  /** {{{
    * .pe-24 {
    *   padding-inline-end: 6rem;
    * }
    * }}}
    */
  def pe_24: Tailwind = this
  /** {{{
    * .pe-28 {
    *   padding-inline-end: 7rem;
    * }
    * }}}
    */
  def pe_28: Tailwind = this
  /** {{{
    * .pe-32 {
    *   padding-inline-end: 8rem;
    * }
    * }}}
    */
  def pe_32: Tailwind = this
  /** {{{
    * .pe-36 {
    *   padding-inline-end: 9rem;
    * }
    * }}}
    */
  def pe_36: Tailwind = this
  /** {{{
    * .pe-40 {
    *   padding-inline-end: 10rem;
    * }
    * }}}
    */
  def pe_40: Tailwind = this
  /** {{{
    * .pe-44 {
    *   padding-inline-end: 11rem;
    * }
    * }}}
    */
  def pe_44: Tailwind = this
  /** {{{
    * .pe-48 {
    *   padding-inline-end: 12rem;
    * }
    * }}}
    */
  def pe_48: Tailwind = this
  /** {{{
    * .pe-52 {
    *   padding-inline-end: 13rem;
    * }
    * }}}
    */
  def pe_52: Tailwind = this
  /** {{{
    * .pe-56 {
    *   padding-inline-end: 14rem;
    * }
    * }}}
    */
  def pe_56: Tailwind = this
  /** {{{
    * .pe-60 {
    *   padding-inline-end: 15rem;
    * }
    * }}}
    */
  def pe_60: Tailwind = this
  /** {{{
    * .pe-64 {
    *   padding-inline-end: 16rem;
    * }
    * }}}
    */
  def pe_64: Tailwind = this
  /** {{{
    * .pe-72 {
    *   padding-inline-end: 18rem;
    * }
    * }}}
    */
  def pe_72: Tailwind = this
  /** {{{
    * .pe-80 {
    *   padding-inline-end: 20rem;
    * }
    * }}}
    */
  def pe_80: Tailwind = this
  /** {{{
    * .pe-96 {
    *   padding-inline-end: 24rem;
    * }
    * }}}
    */
  def pe_96: Tailwind = this
  /** {{{
    * .pe-px {
    *   padding-inline-end: 1px;
    * }
    * }}}
    */
  def pe_px: Tailwind = this
  /** {{{
    * .pe-0.5 {
    *   padding-inline-end: .125rem;
    * }
    * }}}
    */
  def pe_0dot5: Tailwind = this
  /** {{{
    * .pe-1.5 {
    *   padding-inline-end: .375rem;
    * }
    * }}}
    */
  def pe_1dot5: Tailwind = this
  /** {{{
    * .pe-2.5 {
    *   padding-inline-end: .625rem;
    * }
    * }}}
    */
  def pe_2dot5: Tailwind = this
  /** {{{
    * .pe-3.5 {
    *   padding-inline-end: .875rem;
    * }
    * }}}
    */
  def pe_3dot5: Tailwind = this
  /** {{{
    * .pt-0 {
    *   padding-top: 0;
    * }
    * }}}
    */
  def pt_0: Tailwind = this
  /** {{{
    * .pt-1 {
    *   padding-top: .25rem;
    * }
    * }}}
    */
  def pt_1: Tailwind = this
  /** {{{
    * .pt-2 {
    *   padding-top: .5rem;
    * }
    * }}}
    */
  def pt_2: Tailwind = this
  /** {{{
    * .pt-3 {
    *   padding-top: .75rem;
    * }
    * }}}
    */
  def pt_3: Tailwind = this
  /** {{{
    * .pt-4 {
    *   padding-top: 1rem;
    * }
    * }}}
    */
  def pt_4: Tailwind = this
  /** {{{
    * .pt-5 {
    *   padding-top: 1.25rem;
    * }
    * }}}
    */
  def pt_5: Tailwind = this
  /** {{{
    * .pt-6 {
    *   padding-top: 1.5rem;
    * }
    * }}}
    */
  def pt_6: Tailwind = this
  /** {{{
    * .pt-7 {
    *   padding-top: 1.75rem;
    * }
    * }}}
    */
  def pt_7: Tailwind = this
  /** {{{
    * .pt-8 {
    *   padding-top: 2rem;
    * }
    * }}}
    */
  def pt_8: Tailwind = this
  /** {{{
    * .pt-9 {
    *   padding-top: 2.25rem;
    * }
    * }}}
    */
  def pt_9: Tailwind = this
  /** {{{
    * .pt-10 {
    *   padding-top: 2.5rem;
    * }
    * }}}
    */
  def pt_10: Tailwind = this
  /** {{{
    * .pt-11 {
    *   padding-top: 2.75rem;
    * }
    * }}}
    */
  def pt_11: Tailwind = this
  /** {{{
    * .pt-12 {
    *   padding-top: 3rem;
    * }
    * }}}
    */
  def pt_12: Tailwind = this
  /** {{{
    * .pt-14 {
    *   padding-top: 3.5rem;
    * }
    * }}}
    */
  def pt_14: Tailwind = this
  /** {{{
    * .pt-16 {
    *   padding-top: 4rem;
    * }
    * }}}
    */
  def pt_16: Tailwind = this
  /** {{{
    * .pt-20 {
    *   padding-top: 5rem;
    * }
    * }}}
    */
  def pt_20: Tailwind = this
  /** {{{
    * .pt-24 {
    *   padding-top: 6rem;
    * }
    * }}}
    */
  def pt_24: Tailwind = this
  /** {{{
    * .pt-28 {
    *   padding-top: 7rem;
    * }
    * }}}
    */
  def pt_28: Tailwind = this
  /** {{{
    * .pt-32 {
    *   padding-top: 8rem;
    * }
    * }}}
    */
  def pt_32: Tailwind = this
  /** {{{
    * .pt-36 {
    *   padding-top: 9rem;
    * }
    * }}}
    */
  def pt_36: Tailwind = this
  /** {{{
    * .pt-40 {
    *   padding-top: 10rem;
    * }
    * }}}
    */
  def pt_40: Tailwind = this
  /** {{{
    * .pt-44 {
    *   padding-top: 11rem;
    * }
    * }}}
    */
  def pt_44: Tailwind = this
  /** {{{
    * .pt-48 {
    *   padding-top: 12rem;
    * }
    * }}}
    */
  def pt_48: Tailwind = this
  /** {{{
    * .pt-52 {
    *   padding-top: 13rem;
    * }
    * }}}
    */
  def pt_52: Tailwind = this
  /** {{{
    * .pt-56 {
    *   padding-top: 14rem;
    * }
    * }}}
    */
  def pt_56: Tailwind = this
  /** {{{
    * .pt-60 {
    *   padding-top: 15rem;
    * }
    * }}}
    */
  def pt_60: Tailwind = this
  /** {{{
    * .pt-64 {
    *   padding-top: 16rem;
    * }
    * }}}
    */
  def pt_64: Tailwind = this
  /** {{{
    * .pt-72 {
    *   padding-top: 18rem;
    * }
    * }}}
    */
  def pt_72: Tailwind = this
  /** {{{
    * .pt-80 {
    *   padding-top: 20rem;
    * }
    * }}}
    */
  def pt_80: Tailwind = this
  /** {{{
    * .pt-96 {
    *   padding-top: 24rem;
    * }
    * }}}
    */
  def pt_96: Tailwind = this
  /** {{{
    * .pt-px {
    *   padding-top: 1px;
    * }
    * }}}
    */
  def pt_px: Tailwind = this
  /** {{{
    * .pt-0.5 {
    *   padding-top: .125rem;
    * }
    * }}}
    */
  def pt_0dot5: Tailwind = this
  /** {{{
    * .pt-1.5 {
    *   padding-top: .375rem;
    * }
    * }}}
    */
  def pt_1dot5: Tailwind = this
  /** {{{
    * .pt-2.5 {
    *   padding-top: .625rem;
    * }
    * }}}
    */
  def pt_2dot5: Tailwind = this
  /** {{{
    * .pt-3.5 {
    *   padding-top: .875rem;
    * }
    * }}}
    */
  def pt_3dot5: Tailwind = this
  /** {{{
    * .pr-0 {
    *   padding-right: 0;
    * }
    * }}}
    */
  def pr_0: Tailwind = this
  /** {{{
    * .pr-1 {
    *   padding-right: .25rem;
    * }
    * }}}
    */
  def pr_1: Tailwind = this
  /** {{{
    * .pr-2 {
    *   padding-right: .5rem;
    * }
    * }}}
    */
  def pr_2: Tailwind = this
  /** {{{
    * .pr-3 {
    *   padding-right: .75rem;
    * }
    * }}}
    */
  def pr_3: Tailwind = this
  /** {{{
    * .pr-4 {
    *   padding-right: 1rem;
    * }
    * }}}
    */
  def pr_4: Tailwind = this
  /** {{{
    * .pr-5 {
    *   padding-right: 1.25rem;
    * }
    * }}}
    */
  def pr_5: Tailwind = this
  /** {{{
    * .pr-6 {
    *   padding-right: 1.5rem;
    * }
    * }}}
    */
  def pr_6: Tailwind = this
  /** {{{
    * .pr-7 {
    *   padding-right: 1.75rem;
    * }
    * }}}
    */
  def pr_7: Tailwind = this
  /** {{{
    * .pr-8 {
    *   padding-right: 2rem;
    * }
    * }}}
    */
  def pr_8: Tailwind = this
  /** {{{
    * .pr-9 {
    *   padding-right: 2.25rem;
    * }
    * }}}
    */
  def pr_9: Tailwind = this
  /** {{{
    * .pr-10 {
    *   padding-right: 2.5rem;
    * }
    * }}}
    */
  def pr_10: Tailwind = this
  /** {{{
    * .pr-11 {
    *   padding-right: 2.75rem;
    * }
    * }}}
    */
  def pr_11: Tailwind = this
  /** {{{
    * .pr-12 {
    *   padding-right: 3rem;
    * }
    * }}}
    */
  def pr_12: Tailwind = this
  /** {{{
    * .pr-14 {
    *   padding-right: 3.5rem;
    * }
    * }}}
    */
  def pr_14: Tailwind = this
  /** {{{
    * .pr-16 {
    *   padding-right: 4rem;
    * }
    * }}}
    */
  def pr_16: Tailwind = this
  /** {{{
    * .pr-20 {
    *   padding-right: 5rem;
    * }
    * }}}
    */
  def pr_20: Tailwind = this
  /** {{{
    * .pr-24 {
    *   padding-right: 6rem;
    * }
    * }}}
    */
  def pr_24: Tailwind = this
  /** {{{
    * .pr-28 {
    *   padding-right: 7rem;
    * }
    * }}}
    */
  def pr_28: Tailwind = this
  /** {{{
    * .pr-32 {
    *   padding-right: 8rem;
    * }
    * }}}
    */
  def pr_32: Tailwind = this
  /** {{{
    * .pr-36 {
    *   padding-right: 9rem;
    * }
    * }}}
    */
  def pr_36: Tailwind = this
  /** {{{
    * .pr-40 {
    *   padding-right: 10rem;
    * }
    * }}}
    */
  def pr_40: Tailwind = this
  /** {{{
    * .pr-44 {
    *   padding-right: 11rem;
    * }
    * }}}
    */
  def pr_44: Tailwind = this
  /** {{{
    * .pr-48 {
    *   padding-right: 12rem;
    * }
    * }}}
    */
  def pr_48: Tailwind = this
  /** {{{
    * .pr-52 {
    *   padding-right: 13rem;
    * }
    * }}}
    */
  def pr_52: Tailwind = this
  /** {{{
    * .pr-56 {
    *   padding-right: 14rem;
    * }
    * }}}
    */
  def pr_56: Tailwind = this
  /** {{{
    * .pr-60 {
    *   padding-right: 15rem;
    * }
    * }}}
    */
  def pr_60: Tailwind = this
  /** {{{
    * .pr-64 {
    *   padding-right: 16rem;
    * }
    * }}}
    */
  def pr_64: Tailwind = this
  /** {{{
    * .pr-72 {
    *   padding-right: 18rem;
    * }
    * }}}
    */
  def pr_72: Tailwind = this
  /** {{{
    * .pr-80 {
    *   padding-right: 20rem;
    * }
    * }}}
    */
  def pr_80: Tailwind = this
  /** {{{
    * .pr-96 {
    *   padding-right: 24rem;
    * }
    * }}}
    */
  def pr_96: Tailwind = this
  /** {{{
    * .pr-px {
    *   padding-right: 1px;
    * }
    * }}}
    */
  def pr_px: Tailwind = this
  /** {{{
    * .pr-0.5 {
    *   padding-right: .125rem;
    * }
    * }}}
    */
  def pr_0dot5: Tailwind = this
  /** {{{
    * .pr-1.5 {
    *   padding-right: .375rem;
    * }
    * }}}
    */
  def pr_1dot5: Tailwind = this
  /** {{{
    * .pr-2.5 {
    *   padding-right: .625rem;
    * }
    * }}}
    */
  def pr_2dot5: Tailwind = this
  /** {{{
    * .pr-3.5 {
    *   padding-right: .875rem;
    * }
    * }}}
    */
  def pr_3dot5: Tailwind = this
  /** {{{
    * .pb-0 {
    *   padding-bottom: 0;
    * }
    * }}}
    */
  def pb_0: Tailwind = this
  /** {{{
    * .pb-1 {
    *   padding-bottom: .25rem;
    * }
    * }}}
    */
  def pb_1: Tailwind = this
  /** {{{
    * .pb-2 {
    *   padding-bottom: .5rem;
    * }
    * }}}
    */
  def pb_2: Tailwind = this
  /** {{{
    * .pb-3 {
    *   padding-bottom: .75rem;
    * }
    * }}}
    */
  def pb_3: Tailwind = this
  /** {{{
    * .pb-4 {
    *   padding-bottom: 1rem;
    * }
    * }}}
    */
  def pb_4: Tailwind = this
  /** {{{
    * .pb-5 {
    *   padding-bottom: 1.25rem;
    * }
    * }}}
    */
  def pb_5: Tailwind = this
  /** {{{
    * .pb-6 {
    *   padding-bottom: 1.5rem;
    * }
    * }}}
    */
  def pb_6: Tailwind = this
  /** {{{
    * .pb-7 {
    *   padding-bottom: 1.75rem;
    * }
    * }}}
    */
  def pb_7: Tailwind = this
  /** {{{
    * .pb-8 {
    *   padding-bottom: 2rem;
    * }
    * }}}
    */
  def pb_8: Tailwind = this
  /** {{{
    * .pb-9 {
    *   padding-bottom: 2.25rem;
    * }
    * }}}
    */
  def pb_9: Tailwind = this
  /** {{{
    * .pb-10 {
    *   padding-bottom: 2.5rem;
    * }
    * }}}
    */
  def pb_10: Tailwind = this
  /** {{{
    * .pb-11 {
    *   padding-bottom: 2.75rem;
    * }
    * }}}
    */
  def pb_11: Tailwind = this
  /** {{{
    * .pb-12 {
    *   padding-bottom: 3rem;
    * }
    * }}}
    */
  def pb_12: Tailwind = this
  /** {{{
    * .pb-14 {
    *   padding-bottom: 3.5rem;
    * }
    * }}}
    */
  def pb_14: Tailwind = this
  /** {{{
    * .pb-16 {
    *   padding-bottom: 4rem;
    * }
    * }}}
    */
  def pb_16: Tailwind = this
  /** {{{
    * .pb-20 {
    *   padding-bottom: 5rem;
    * }
    * }}}
    */
  def pb_20: Tailwind = this
  /** {{{
    * .pb-24 {
    *   padding-bottom: 6rem;
    * }
    * }}}
    */
  def pb_24: Tailwind = this
  /** {{{
    * .pb-28 {
    *   padding-bottom: 7rem;
    * }
    * }}}
    */
  def pb_28: Tailwind = this
  /** {{{
    * .pb-32 {
    *   padding-bottom: 8rem;
    * }
    * }}}
    */
  def pb_32: Tailwind = this
  /** {{{
    * .pb-36 {
    *   padding-bottom: 9rem;
    * }
    * }}}
    */
  def pb_36: Tailwind = this
  /** {{{
    * .pb-40 {
    *   padding-bottom: 10rem;
    * }
    * }}}
    */
  def pb_40: Tailwind = this
  /** {{{
    * .pb-44 {
    *   padding-bottom: 11rem;
    * }
    * }}}
    */
  def pb_44: Tailwind = this
  /** {{{
    * .pb-48 {
    *   padding-bottom: 12rem;
    * }
    * }}}
    */
  def pb_48: Tailwind = this
  /** {{{
    * .pb-52 {
    *   padding-bottom: 13rem;
    * }
    * }}}
    */
  def pb_52: Tailwind = this
  /** {{{
    * .pb-56 {
    *   padding-bottom: 14rem;
    * }
    * }}}
    */
  def pb_56: Tailwind = this
  /** {{{
    * .pb-60 {
    *   padding-bottom: 15rem;
    * }
    * }}}
    */
  def pb_60: Tailwind = this
  /** {{{
    * .pb-64 {
    *   padding-bottom: 16rem;
    * }
    * }}}
    */
  def pb_64: Tailwind = this
  /** {{{
    * .pb-72 {
    *   padding-bottom: 18rem;
    * }
    * }}}
    */
  def pb_72: Tailwind = this
  /** {{{
    * .pb-80 {
    *   padding-bottom: 20rem;
    * }
    * }}}
    */
  def pb_80: Tailwind = this
  /** {{{
    * .pb-96 {
    *   padding-bottom: 24rem;
    * }
    * }}}
    */
  def pb_96: Tailwind = this
  /** {{{
    * .pb-px {
    *   padding-bottom: 1px;
    * }
    * }}}
    */
  def pb_px: Tailwind = this
  /** {{{
    * .pb-0.5 {
    *   padding-bottom: .125rem;
    * }
    * }}}
    */
  def pb_0dot5: Tailwind = this
  /** {{{
    * .pb-1.5 {
    *   padding-bottom: .375rem;
    * }
    * }}}
    */
  def pb_1dot5: Tailwind = this
  /** {{{
    * .pb-2.5 {
    *   padding-bottom: .625rem;
    * }
    * }}}
    */
  def pb_2dot5: Tailwind = this
  /** {{{
    * .pb-3.5 {
    *   padding-bottom: .875rem;
    * }
    * }}}
    */
  def pb_3dot5: Tailwind = this
  /** {{{
    * .pl-0 {
    *   padding-left: 0;
    * }
    * }}}
    */
  def pl_0: Tailwind = this
  /** {{{
    * .pl-1 {
    *   padding-left: .25rem;
    * }
    * }}}
    */
  def pl_1: Tailwind = this
  /** {{{
    * .pl-2 {
    *   padding-left: .5rem;
    * }
    * }}}
    */
  def pl_2: Tailwind = this
  /** {{{
    * .pl-3 {
    *   padding-left: .75rem;
    * }
    * }}}
    */
  def pl_3: Tailwind = this
  /** {{{
    * .pl-4 {
    *   padding-left: 1rem;
    * }
    * }}}
    */
  def pl_4: Tailwind = this
  /** {{{
    * .pl-5 {
    *   padding-left: 1.25rem;
    * }
    * }}}
    */
  def pl_5: Tailwind = this
  /** {{{
    * .pl-6 {
    *   padding-left: 1.5rem;
    * }
    * }}}
    */
  def pl_6: Tailwind = this
  /** {{{
    * .pl-7 {
    *   padding-left: 1.75rem;
    * }
    * }}}
    */
  def pl_7: Tailwind = this
  /** {{{
    * .pl-8 {
    *   padding-left: 2rem;
    * }
    * }}}
    */
  def pl_8: Tailwind = this
  /** {{{
    * .pl-9 {
    *   padding-left: 2.25rem;
    * }
    * }}}
    */
  def pl_9: Tailwind = this
  /** {{{
    * .pl-10 {
    *   padding-left: 2.5rem;
    * }
    * }}}
    */
  def pl_10: Tailwind = this
  /** {{{
    * .pl-11 {
    *   padding-left: 2.75rem;
    * }
    * }}}
    */
  def pl_11: Tailwind = this
  /** {{{
    * .pl-12 {
    *   padding-left: 3rem;
    * }
    * }}}
    */
  def pl_12: Tailwind = this
  /** {{{
    * .pl-14 {
    *   padding-left: 3.5rem;
    * }
    * }}}
    */
  def pl_14: Tailwind = this
  /** {{{
    * .pl-16 {
    *   padding-left: 4rem;
    * }
    * }}}
    */
  def pl_16: Tailwind = this
  /** {{{
    * .pl-20 {
    *   padding-left: 5rem;
    * }
    * }}}
    */
  def pl_20: Tailwind = this
  /** {{{
    * .pl-24 {
    *   padding-left: 6rem;
    * }
    * }}}
    */
  def pl_24: Tailwind = this
  /** {{{
    * .pl-28 {
    *   padding-left: 7rem;
    * }
    * }}}
    */
  def pl_28: Tailwind = this
  /** {{{
    * .pl-32 {
    *   padding-left: 8rem;
    * }
    * }}}
    */
  def pl_32: Tailwind = this
  /** {{{
    * .pl-36 {
    *   padding-left: 9rem;
    * }
    * }}}
    */
  def pl_36: Tailwind = this
  /** {{{
    * .pl-40 {
    *   padding-left: 10rem;
    * }
    * }}}
    */
  def pl_40: Tailwind = this
  /** {{{
    * .pl-44 {
    *   padding-left: 11rem;
    * }
    * }}}
    */
  def pl_44: Tailwind = this
  /** {{{
    * .pl-48 {
    *   padding-left: 12rem;
    * }
    * }}}
    */
  def pl_48: Tailwind = this
  /** {{{
    * .pl-52 {
    *   padding-left: 13rem;
    * }
    * }}}
    */
  def pl_52: Tailwind = this
  /** {{{
    * .pl-56 {
    *   padding-left: 14rem;
    * }
    * }}}
    */
  def pl_56: Tailwind = this
  /** {{{
    * .pl-60 {
    *   padding-left: 15rem;
    * }
    * }}}
    */
  def pl_60: Tailwind = this
  /** {{{
    * .pl-64 {
    *   padding-left: 16rem;
    * }
    * }}}
    */
  def pl_64: Tailwind = this
  /** {{{
    * .pl-72 {
    *   padding-left: 18rem;
    * }
    * }}}
    */
  def pl_72: Tailwind = this
  /** {{{
    * .pl-80 {
    *   padding-left: 20rem;
    * }
    * }}}
    */
  def pl_80: Tailwind = this
  /** {{{
    * .pl-96 {
    *   padding-left: 24rem;
    * }
    * }}}
    */
  def pl_96: Tailwind = this
  /** {{{
    * .pl-px {
    *   padding-left: 1px;
    * }
    * }}}
    */
  def pl_px: Tailwind = this
  /** {{{
    * .pl-0.5 {
    *   padding-left: .125rem;
    * }
    * }}}
    */
  def pl_0dot5: Tailwind = this
  /** {{{
    * .pl-1.5 {
    *   padding-left: .375rem;
    * }
    * }}}
    */
  def pl_1dot5: Tailwind = this
  /** {{{
    * .pl-2.5 {
    *   padding-left: .625rem;
    * }
    * }}}
    */
  def pl_2dot5: Tailwind = this
  /** {{{
    * .pl-3.5 {
    *   padding-left: .875rem;
    * }
    * }}}
    */
  def pl_3dot5: Tailwind = this
  /** {{{
    * .text-transparent {
    *   color: #0000;
    * }
    * }}}
    */
  def text_transparent: Tailwind = this
  /** {{{
    * .text-current {
    *   color: currentColor;
    * }
    * }}}
    */
  def text_current: Tailwind = this
  /** {{{
    * .text-black {
    *   color: #000;
    * }
    * }}}
    */
  def text_black: Tailwind = this
  /** {{{
    * .text-white {
    *   color: #fff;
    * }
    * }}}
    */
  def text_white: Tailwind = this
  /** {{{
    * .text-red-50 {
    *   color: #fef2f2;
    * }
    * }}}
    */
  def text_red_50: Tailwind = this
  /** {{{
    * .text-red-100 {
    *   color: #fee2e2;
    * }
    * }}}
    */
  def text_red_100: Tailwind = this
  /** {{{
    * .text-red-200 {
    *   color: #fecaca;
    * }
    * }}}
    */
  def text_red_200: Tailwind = this
  /** {{{
    * .text-red-300 {
    *   color: #fca5a5;
    * }
    * }}}
    */
  def text_red_300: Tailwind = this
  /** {{{
    * .text-red-400 {
    *   color: #f87171;
    * }
    * }}}
    */
  def text_red_400: Tailwind = this
  /** {{{
    * .text-red-500 {
    *   color: #ef4444;
    * }
    * }}}
    */
  def text_red_500: Tailwind = this
  /** {{{
    * .text-red-600 {
    *   color: #dc2626;
    * }
    * }}}
    */
  def text_red_600: Tailwind = this
  /** {{{
    * .text-red-700 {
    *   color: #b91c1c;
    * }
    * }}}
    */
  def text_red_700: Tailwind = this
  /** {{{
    * .text-red-800 {
    *   color: #991b1b;
    * }
    * }}}
    */
  def text_red_800: Tailwind = this
  /** {{{
    * .text-red-900 {
    *   color: #7f1d1d;
    * }
    * }}}
    */
  def text_red_900: Tailwind = this
  /** {{{
    * .text-red-950 {
    *   color: #450a0a;
    * }
    * }}}
    */
  def text_red_950: Tailwind = this
  /** {{{
    * .text-primary {
    *   color: #de3423;
    * }
    * }}}
    */
  def text_primary: Tailwind = this
  /** {{{
    * .text-secondary {
    *   color: #380d09;
    * }
    * }}}
    */
  def text_secondary: Tailwind = this
  def block_(value: String): Tailwind = this
  def inline_block_(value: String): Tailwind = this
  def inline_(value: String): Tailwind = this
  def flex_(value: String): Tailwind = this
  def inline_flex_(value: String): Tailwind = this
  def table_(value: String): Tailwind = this
  def inline_table_(value: String): Tailwind = this
  def table_caption_(value: String): Tailwind = this
  def table_cell_(value: String): Tailwind = this
  def table_column_(value: String): Tailwind = this
  def table_column_group_(value: String): Tailwind = this
  def table_footer_group_(value: String): Tailwind = this
  def table_header_group_(value: String): Tailwind = this
  def table_row_group_(value: String): Tailwind = this
  def table_row_(value: String): Tailwind = this
  def flow_root_(value: String): Tailwind = this
  def grid_(value: String): Tailwind = this
  def inline_grid_(value: String): Tailwind = this
  def contents_(value: String): Tailwind = this
  def list_item_(value: String): Tailwind = this
  def hidden_(value: String): Tailwind = this
  def h_(value: String): Tailwind = this
  def w_(value: String): Tailwind = this
  def items_start_(value: String): Tailwind = this
  def items_end_(value: String): Tailwind = this
  def items_center_(value: String): Tailwind = this
  def items_baseline_(value: String): Tailwind = this
  def items_stretch_(value: String): Tailwind = this
  def justify_normal_(value: String): Tailwind = this
  def justify_start_(value: String): Tailwind = this
  def justify_end_(value: String): Tailwind = this
  def justify_center_(value: String): Tailwind = this
  def justify_between_(value: String): Tailwind = this
  def justify_around_(value: String): Tailwind = this
  def justify_evenly_(value: String): Tailwind = this
  def justify_stretch_(value: String): Tailwind = this
  def bg_(value: String): Tailwind = this
  def p_(value: String): Tailwind = this
  def px_(value: String): Tailwind = this
  def py_(value: String): Tailwind = this
  def ps_(value: String): Tailwind = this
  def pe_(value: String): Tailwind = this
  def pt_(value: String): Tailwind = this
  def pr_(value: String): Tailwind = this
  def pb_(value: String): Tailwind = this
  def pl_(value: String): Tailwind = this
  def text_(value: String): Tailwind = this
  def important(@unused styles: Tailwind): Tailwind = this
  def raw(@unused classString: String): Tailwind = this
  def variant(selector: String, styles: Tailwind): Tailwind = this
}
