package scalawind

import scala.quoted.*

object cls {
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

  def first_letter(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"first_letter:$cls").mkString(" ")
    addClasses(classes)
  }
  def first_line(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"first_line:$cls").mkString(" ")
    addClasses(classes)
  }
  def marker(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"marker:$cls").mkString(" ")
    addClasses(classes)
  }
  def selection(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"selection:$cls").mkString(" ")
    addClasses(classes)
  }
  def file(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"file:$cls").mkString(" ")
    addClasses(classes)
  }
  def placeholder(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"placeholder:$cls").mkString(" ")
    addClasses(classes)
  }
  def backdrop(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"backdrop:$cls").mkString(" ")
    addClasses(classes)
  }
  def before(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"before:$cls").mkString(" ")
    addClasses(classes)
  }
  def after(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"after:$cls").mkString(" ")
    addClasses(classes)
  }
  def first(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"first:$cls").mkString(" ")
    addClasses(classes)
  }
  def last(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"last:$cls").mkString(" ")
    addClasses(classes)
  }
  def only(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"only:$cls").mkString(" ")
    addClasses(classes)
  }
  def odd(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"odd:$cls").mkString(" ")
    addClasses(classes)
  }
  def even(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"even:$cls").mkString(" ")
    addClasses(classes)
  }
  def first_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"first_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def last_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"last_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def only_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"only_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def visited(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"visited:$cls").mkString(" ")
    addClasses(classes)
  }
  def target(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"target:$cls").mkString(" ")
    addClasses(classes)
  }
  def open(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"open:$cls").mkString(" ")
    addClasses(classes)
  }
  def default(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"default:$cls").mkString(" ")
    addClasses(classes)
  }
  def checked(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"checked:$cls").mkString(" ")
    addClasses(classes)
  }
  def indeterminate(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"indeterminate:$cls").mkString(" ")
    addClasses(classes)
  }
  def placeholder_shown(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"placeholder_shown:$cls").mkString(" ")
    addClasses(classes)
  }
  def autofill(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"autofill:$cls").mkString(" ")
    addClasses(classes)
  }
  def optional(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"optional:$cls").mkString(" ")
    addClasses(classes)
  }
  def required(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"required:$cls").mkString(" ")
    addClasses(classes)
  }
  def valid(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"valid:$cls").mkString(" ")
    addClasses(classes)
  }
  def invalid(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"invalid:$cls").mkString(" ")
    addClasses(classes)
  }
  def in_range(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"in_range:$cls").mkString(" ")
    addClasses(classes)
  }
  def out_of_range(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"out_of_range:$cls").mkString(" ")
    addClasses(classes)
  }
  def read_only(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"read_only:$cls").mkString(" ")
    addClasses(classes)
  }
  def empty(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"empty:$cls").mkString(" ")
    addClasses(classes)
  }
  def focus_within(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"focus_within:$cls").mkString(" ")
    addClasses(classes)
  }
  def hover(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"hover:$cls").mkString(" ")
    addClasses(classes)
  }
  def focus(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"focus:$cls").mkString(" ")
    addClasses(classes)
  }
  def focus_visible(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"focus_visible:$cls").mkString(" ")
    addClasses(classes)
  }
  def active(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"active:$cls").mkString(" ")
    addClasses(classes)
  }
  def enabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"enabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def disabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"disabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_first(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_first:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_last(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_last:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_only(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_only:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_odd(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_odd:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_even(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_even:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_first_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_first_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_last_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_last_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_only_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_only_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_visited(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_visited:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_target(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_target:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_open(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_open:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_default(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_default:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_checked(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_checked:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_indeterminate(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_indeterminate:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_placeholder_shown(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_placeholder_shown:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_autofill(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_autofill:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_optional(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_optional:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_required(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_required:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_valid(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_valid:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_invalid(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_invalid:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_in_range(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_in_range:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_out_of_range(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_out_of_range:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_read_only(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_read_only:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_empty(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_empty:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_focus_within(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_focus_within:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_hover(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_hover:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_focus(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_focus:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_focus_visible(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_focus_visible:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_active(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_active:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_enabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_enabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_disabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_disabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def group(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_first(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_first:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_last(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_last:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_only(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_only:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_odd(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_odd:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_even(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_even:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_first_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_first_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_last_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_last_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_only_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_only_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_visited(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_visited:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_target(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_target:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_open(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_open:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_default(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_default:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_checked(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_checked:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_indeterminate(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_indeterminate:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_placeholder_shown(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_placeholder_shown:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_autofill(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_autofill:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_optional(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_optional:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_required(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_required:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_valid(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_valid:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_invalid(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_invalid:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_in_range(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_in_range:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_out_of_range(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_out_of_range:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_read_only(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_read_only:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_empty(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_empty:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_focus_within(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_focus_within:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_hover(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_hover:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_focus(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_focus:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_focus_visible(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_focus_visible:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_active(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_active:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_enabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_enabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_disabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_disabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer:$cls").mkString(" ")
    addClasses(classes)
  }
  def has(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"has:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_has(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_has:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_has(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_has:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_busy(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_busy:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_checked(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_checked:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_disabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_disabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_expanded(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_expanded:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_hidden(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_hidden:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_pressed(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_pressed:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_readonly(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_readonly:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_required(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_required:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_selected(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_selected:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_busy(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_busy:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_checked(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_checked:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_disabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_disabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_expanded(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_expanded:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_hidden(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_hidden:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_pressed(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_pressed:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_readonly(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_readonly:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_required(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_required:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_selected(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_selected:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_busy(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_busy:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_checked(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_checked:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_disabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_disabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_expanded(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_expanded:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_hidden(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_hidden:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_pressed(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_pressed:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_readonly(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_readonly:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_required(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_required:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_selected(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_selected:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria:$cls").mkString(" ")
    addClasses(classes)
  }
  def data(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"data:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_data(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_data:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_data(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_data:$cls").mkString(" ")
    addClasses(classes)
  }
  def supports(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"supports:$cls").mkString(" ")
    addClasses(classes)
  }
  def motion_safe(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"motion_safe:$cls").mkString(" ")
    addClasses(classes)
  }
  def motion_reduce(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"motion_reduce:$cls").mkString(" ")
    addClasses(classes)
  }
  def contrast_more(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"contrast_more:$cls").mkString(" ")
    addClasses(classes)
  }
  def contrast_less(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"contrast_less:$cls").mkString(" ")
    addClasses(classes)
  }
  def max_sm(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"max_sm:$cls").mkString(" ")
    addClasses(classes)
  }
  def max_md(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"max_md:$cls").mkString(" ")
    addClasses(classes)
  }
  def max_lg(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"max_lg:$cls").mkString(" ")
    addClasses(classes)
  }
  def max_xl(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"max_xl:$cls").mkString(" ")
    addClasses(classes)
  }
  def max_2xl(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"max_2xl:$cls").mkString(" ")
    addClasses(classes)
  }
  def max(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"max:$cls").mkString(" ")
    addClasses(classes)
  }
  def sm(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"sm:$cls").mkString(" ")
    addClasses(classes)
  }
  def md(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"md:$cls").mkString(" ")
    addClasses(classes)
  }
  def lg(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"lg:$cls").mkString(" ")
    addClasses(classes)
  }
  def xl(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"xl:$cls").mkString(" ")
    addClasses(classes)
  }
  def _2xl(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"_2xl:$cls").mkString(" ")
    addClasses(classes)
  }
  def min(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"min:$cls").mkString(" ")
    addClasses(classes)
  }
  def portrait(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"portrait:$cls").mkString(" ")
    addClasses(classes)
  }
  def landscape(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"landscape:$cls").mkString(" ")
    addClasses(classes)
  }
  def ltr(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"ltr:$cls").mkString(" ")
    addClasses(classes)
  }
  def rtl(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"rtl:$cls").mkString(" ")
    addClasses(classes)
  }
  def dark(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"dark:$cls").mkString(" ")
    addClasses(classes)
  }
  def forced_colors(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"forced_colors:$cls").mkString(" ")
    addClasses(classes)
  }
  def print(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"print:$cls").mkString(" ")
    addClasses(classes)
  }
  def important(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"important:$cls").mkString(" ")
    addClasses(classes)
  }

  override def toString: String = style
}

given Conversion[SwStyle, String] with
  def apply(swStyle: SwStyle): String = swStyle.style

extension (swStyle: SwStyle)
  def flex: SwStyle = swStyle.addClass(cls.flex)
  def bg_black: SwStyle = swStyle.addClass(cls.bg_black)
  def bg_white: SwStyle = swStyle.addClass(cls.bg_white)
  def text_white: SwStyle = swStyle.addClass(cls.text_white)
  def text_black: SwStyle = swStyle.addClass(cls.text_black)

object tw {
  def apply(): SwStyle = SwStyle()

  def flex: SwStyle = SwStyle().addClass(cls.flex)
  def bg_black: SwStyle = SwStyle().addClass(cls.bg_black)
  def bg_white: SwStyle = SwStyle().addClass(cls.bg_white)
  def text_white: SwStyle = SwStyle().addClass(cls.text_white)
  def text_black: SwStyle = SwStyle().addClass(cls.text_black)

  def first_letter(styles: SwStyle): SwStyle = SwStyle().first_letter(styles)
  def first_line(styles: SwStyle): SwStyle = SwStyle().first_line(styles)
  def marker(styles: SwStyle): SwStyle = SwStyle().marker(styles)
  def selection(styles: SwStyle): SwStyle = SwStyle().selection(styles)
  def file(styles: SwStyle): SwStyle = SwStyle().file(styles)
  def placeholder(styles: SwStyle): SwStyle = SwStyle().placeholder(styles)
  def backdrop(styles: SwStyle): SwStyle = SwStyle().backdrop(styles)
  def before(styles: SwStyle): SwStyle = SwStyle().before(styles)
  def after(styles: SwStyle): SwStyle = SwStyle().after(styles)
  def first(styles: SwStyle): SwStyle = SwStyle().first(styles)
  def last(styles: SwStyle): SwStyle = SwStyle().last(styles)
  def only(styles: SwStyle): SwStyle = SwStyle().only(styles)
  def odd(styles: SwStyle): SwStyle = SwStyle().odd(styles)
  def even(styles: SwStyle): SwStyle = SwStyle().even(styles)
  def first_of_type(styles: SwStyle): SwStyle = SwStyle().first_of_type(styles)
  def last_of_type(styles: SwStyle): SwStyle = SwStyle().last_of_type(styles)
  def only_of_type(styles: SwStyle): SwStyle = SwStyle().only_of_type(styles)
  def visited(styles: SwStyle): SwStyle = SwStyle().visited(styles)
  def target(styles: SwStyle): SwStyle = SwStyle().target(styles)
  def open(styles: SwStyle): SwStyle = SwStyle().open(styles)
  def default(styles: SwStyle): SwStyle = SwStyle().default(styles)
  def checked(styles: SwStyle): SwStyle = SwStyle().checked(styles)
  def indeterminate(styles: SwStyle): SwStyle = SwStyle().indeterminate(styles)
  def placeholder_shown(styles: SwStyle): SwStyle = SwStyle().placeholder_shown(styles)
  def autofill(styles: SwStyle): SwStyle = SwStyle().autofill(styles)
  def optional(styles: SwStyle): SwStyle = SwStyle().optional(styles)
  def required(styles: SwStyle): SwStyle = SwStyle().required(styles)
  def valid(styles: SwStyle): SwStyle = SwStyle().valid(styles)
  def invalid(styles: SwStyle): SwStyle = SwStyle().invalid(styles)
  def in_range(styles: SwStyle): SwStyle = SwStyle().in_range(styles)
  def out_of_range(styles: SwStyle): SwStyle = SwStyle().out_of_range(styles)
  def read_only(styles: SwStyle): SwStyle = SwStyle().read_only(styles)
  def empty(styles: SwStyle): SwStyle = SwStyle().empty(styles)
  def focus_within(styles: SwStyle): SwStyle = SwStyle().focus_within(styles)
  def hover(styles: SwStyle): SwStyle = SwStyle().hover(styles)
  def focus(styles: SwStyle): SwStyle = SwStyle().focus(styles)
  def focus_visible(styles: SwStyle): SwStyle = SwStyle().focus_visible(styles)
  def active(styles: SwStyle): SwStyle = SwStyle().active(styles)
  def enabled(styles: SwStyle): SwStyle = SwStyle().enabled(styles)
  def disabled(styles: SwStyle): SwStyle = SwStyle().disabled(styles)
  def group_first(styles: SwStyle): SwStyle = SwStyle().group_first(styles)
  def group_last(styles: SwStyle): SwStyle = SwStyle().group_last(styles)
  def group_only(styles: SwStyle): SwStyle = SwStyle().group_only(styles)
  def group_odd(styles: SwStyle): SwStyle = SwStyle().group_odd(styles)
  def group_even(styles: SwStyle): SwStyle = SwStyle().group_even(styles)
  def group_first_of_type(styles: SwStyle): SwStyle = SwStyle().group_first_of_type(styles)
  def group_last_of_type(styles: SwStyle): SwStyle = SwStyle().group_last_of_type(styles)
  def group_only_of_type(styles: SwStyle): SwStyle = SwStyle().group_only_of_type(styles)
  def group_visited(styles: SwStyle): SwStyle = SwStyle().group_visited(styles)
  def group_target(styles: SwStyle): SwStyle = SwStyle().group_target(styles)
  def group_open(styles: SwStyle): SwStyle = SwStyle().group_open(styles)
  def group_default(styles: SwStyle): SwStyle = SwStyle().group_default(styles)
  def group_checked(styles: SwStyle): SwStyle = SwStyle().group_checked(styles)
  def group_indeterminate(styles: SwStyle): SwStyle = SwStyle().group_indeterminate(styles)
  def group_placeholder_shown(styles: SwStyle): SwStyle = SwStyle().group_placeholder_shown(styles)
  def group_autofill(styles: SwStyle): SwStyle = SwStyle().group_autofill(styles)
  def group_optional(styles: SwStyle): SwStyle = SwStyle().group_optional(styles)
  def group_required(styles: SwStyle): SwStyle = SwStyle().group_required(styles)
  def group_valid(styles: SwStyle): SwStyle = SwStyle().group_valid(styles)
  def group_invalid(styles: SwStyle): SwStyle = SwStyle().group_invalid(styles)
  def group_in_range(styles: SwStyle): SwStyle = SwStyle().group_in_range(styles)
  def group_out_of_range(styles: SwStyle): SwStyle = SwStyle().group_out_of_range(styles)
  def group_read_only(styles: SwStyle): SwStyle = SwStyle().group_read_only(styles)
  def group_empty(styles: SwStyle): SwStyle = SwStyle().group_empty(styles)
  def group_focus_within(styles: SwStyle): SwStyle = SwStyle().group_focus_within(styles)
  def group_hover(styles: SwStyle): SwStyle = SwStyle().group_hover(styles)
  def group_focus(styles: SwStyle): SwStyle = SwStyle().group_focus(styles)
  def group_focus_visible(styles: SwStyle): SwStyle = SwStyle().group_focus_visible(styles)
  def group_active(styles: SwStyle): SwStyle = SwStyle().group_active(styles)
  def group_enabled(styles: SwStyle): SwStyle = SwStyle().group_enabled(styles)
  def group_disabled(styles: SwStyle): SwStyle = SwStyle().group_disabled(styles)
  def group(styles: SwStyle): SwStyle = SwStyle().group(styles)
  def peer_first(styles: SwStyle): SwStyle = SwStyle().peer_first(styles)
  def peer_last(styles: SwStyle): SwStyle = SwStyle().peer_last(styles)
  def peer_only(styles: SwStyle): SwStyle = SwStyle().peer_only(styles)
  def peer_odd(styles: SwStyle): SwStyle = SwStyle().peer_odd(styles)
  def peer_even(styles: SwStyle): SwStyle = SwStyle().peer_even(styles)
  def peer_first_of_type(styles: SwStyle): SwStyle = SwStyle().peer_first_of_type(styles)
  def peer_last_of_type(styles: SwStyle): SwStyle = SwStyle().peer_last_of_type(styles)
  def peer_only_of_type(styles: SwStyle): SwStyle = SwStyle().peer_only_of_type(styles)
  def peer_visited(styles: SwStyle): SwStyle = SwStyle().peer_visited(styles)
  def peer_target(styles: SwStyle): SwStyle = SwStyle().peer_target(styles)
  def peer_open(styles: SwStyle): SwStyle = SwStyle().peer_open(styles)
  def peer_default(styles: SwStyle): SwStyle = SwStyle().peer_default(styles)
  def peer_checked(styles: SwStyle): SwStyle = SwStyle().peer_checked(styles)
  def peer_indeterminate(styles: SwStyle): SwStyle = SwStyle().peer_indeterminate(styles)
  def peer_placeholder_shown(styles: SwStyle): SwStyle = SwStyle().peer_placeholder_shown(styles)
  def peer_autofill(styles: SwStyle): SwStyle = SwStyle().peer_autofill(styles)
  def peer_optional(styles: SwStyle): SwStyle = SwStyle().peer_optional(styles)
  def peer_required(styles: SwStyle): SwStyle = SwStyle().peer_required(styles)
  def peer_valid(styles: SwStyle): SwStyle = SwStyle().peer_valid(styles)
  def peer_invalid(styles: SwStyle): SwStyle = SwStyle().peer_invalid(styles)
  def peer_in_range(styles: SwStyle): SwStyle = SwStyle().peer_in_range(styles)
  def peer_out_of_range(styles: SwStyle): SwStyle = SwStyle().peer_out_of_range(styles)
  def peer_read_only(styles: SwStyle): SwStyle = SwStyle().peer_read_only(styles)
  def peer_empty(styles: SwStyle): SwStyle = SwStyle().peer_empty(styles)
  def peer_focus_within(styles: SwStyle): SwStyle = SwStyle().peer_focus_within(styles)
  def peer_hover(styles: SwStyle): SwStyle = SwStyle().peer_hover(styles)
  def peer_focus(styles: SwStyle): SwStyle = SwStyle().peer_focus(styles)
  def peer_focus_visible(styles: SwStyle): SwStyle = SwStyle().peer_focus_visible(styles)
  def peer_active(styles: SwStyle): SwStyle = SwStyle().peer_active(styles)
  def peer_enabled(styles: SwStyle): SwStyle = SwStyle().peer_enabled(styles)
  def peer_disabled(styles: SwStyle): SwStyle = SwStyle().peer_disabled(styles)
  def peer(styles: SwStyle): SwStyle = SwStyle().peer(styles)
  def has(styles: SwStyle): SwStyle = SwStyle().has(styles)
  def group_has(styles: SwStyle): SwStyle = SwStyle().group_has(styles)
  def peer_has(styles: SwStyle): SwStyle = SwStyle().peer_has(styles)
  def aria_busy(styles: SwStyle): SwStyle = SwStyle().aria_busy(styles)
  def aria_checked(styles: SwStyle): SwStyle = SwStyle().aria_checked(styles)
  def aria_disabled(styles: SwStyle): SwStyle = SwStyle().aria_disabled(styles)
  def aria_expanded(styles: SwStyle): SwStyle = SwStyle().aria_expanded(styles)
  def aria_hidden(styles: SwStyle): SwStyle = SwStyle().aria_hidden(styles)
  def aria_pressed(styles: SwStyle): SwStyle = SwStyle().aria_pressed(styles)
  def aria_readonly(styles: SwStyle): SwStyle = SwStyle().aria_readonly(styles)
  def aria_required(styles: SwStyle): SwStyle = SwStyle().aria_required(styles)
  def aria_selected(styles: SwStyle): SwStyle = SwStyle().aria_selected(styles)
  def aria(styles: SwStyle): SwStyle = SwStyle().aria(styles)
  def group_aria_busy(styles: SwStyle): SwStyle = SwStyle().group_aria_busy(styles)
  def group_aria_checked(styles: SwStyle): SwStyle = SwStyle().group_aria_checked(styles)
  def group_aria_disabled(styles: SwStyle): SwStyle = SwStyle().group_aria_disabled(styles)
  def group_aria_expanded(styles: SwStyle): SwStyle = SwStyle().group_aria_expanded(styles)
  def group_aria_hidden(styles: SwStyle): SwStyle = SwStyle().group_aria_hidden(styles)
  def group_aria_pressed(styles: SwStyle): SwStyle = SwStyle().group_aria_pressed(styles)
  def group_aria_readonly(styles: SwStyle): SwStyle = SwStyle().group_aria_readonly(styles)
  def group_aria_required(styles: SwStyle): SwStyle = SwStyle().group_aria_required(styles)
  def group_aria_selected(styles: SwStyle): SwStyle = SwStyle().group_aria_selected(styles)
  def group_aria(styles: SwStyle): SwStyle = SwStyle().group_aria(styles)
  def peer_aria_busy(styles: SwStyle): SwStyle = SwStyle().peer_aria_busy(styles)
  def peer_aria_checked(styles: SwStyle): SwStyle = SwStyle().peer_aria_checked(styles)
  def peer_aria_disabled(styles: SwStyle): SwStyle = SwStyle().peer_aria_disabled(styles)
  def peer_aria_expanded(styles: SwStyle): SwStyle = SwStyle().peer_aria_expanded(styles)
  def peer_aria_hidden(styles: SwStyle): SwStyle = SwStyle().peer_aria_hidden(styles)
  def peer_aria_pressed(styles: SwStyle): SwStyle = SwStyle().peer_aria_pressed(styles)
  def peer_aria_readonly(styles: SwStyle): SwStyle = SwStyle().peer_aria_readonly(styles)
  def peer_aria_required(styles: SwStyle): SwStyle = SwStyle().peer_aria_required(styles)
  def peer_aria_selected(styles: SwStyle): SwStyle = SwStyle().peer_aria_selected(styles)
  def peer_aria(styles: SwStyle): SwStyle = SwStyle().peer_aria(styles)
  def data(styles: SwStyle): SwStyle = SwStyle().data(styles)
  def group_data(styles: SwStyle): SwStyle = SwStyle().group_data(styles)
  def peer_data(styles: SwStyle): SwStyle = SwStyle().peer_data(styles)
  def supports(styles: SwStyle): SwStyle = SwStyle().supports(styles)
  def motion_safe(styles: SwStyle): SwStyle = SwStyle().motion_safe(styles)
  def motion_reduce(styles: SwStyle): SwStyle = SwStyle().motion_reduce(styles)
  def contrast_more(styles: SwStyle): SwStyle = SwStyle().contrast_more(styles)
  def contrast_less(styles: SwStyle): SwStyle = SwStyle().contrast_less(styles)
  def max_sm(styles: SwStyle): SwStyle = SwStyle().max_sm(styles)
  def max_md(styles: SwStyle): SwStyle = SwStyle().max_md(styles)
  def max_lg(styles: SwStyle): SwStyle = SwStyle().max_lg(styles)
  def max_xl(styles: SwStyle): SwStyle = SwStyle().max_xl(styles)
  def max_2xl(styles: SwStyle): SwStyle = SwStyle().max_2xl(styles)
  def max(styles: SwStyle): SwStyle = SwStyle().max(styles)
  def sm(styles: SwStyle): SwStyle = SwStyle().sm(styles)
  def md(styles: SwStyle): SwStyle = SwStyle().md(styles)
  def lg(styles: SwStyle): SwStyle = SwStyle().lg(styles)
  def xl(styles: SwStyle): SwStyle = SwStyle().xl(styles)
  def _2xl(styles: SwStyle): SwStyle = SwStyle()._2xl(styles)
  def min(styles: SwStyle): SwStyle = SwStyle().min(styles)
  def portrait(styles: SwStyle): SwStyle = SwStyle().portrait(styles)
  def landscape(styles: SwStyle): SwStyle = SwStyle().landscape(styles)
  def ltr(styles: SwStyle): SwStyle = SwStyle().ltr(styles)
  def rtl(styles: SwStyle): SwStyle = SwStyle().rtl(styles)
  def dark(styles: SwStyle): SwStyle = SwStyle().dark(styles)
  def forced_colors(styles: SwStyle): SwStyle = SwStyle().forced_colors(styles)
  def print(styles: SwStyle): SwStyle = SwStyle().print(styles)
  def important(styles: SwStyle): SwStyle = SwStyle().important(styles)
}

inline def sw(inline styles: SwStyle): String =
  ${ swImpl('styles) }

private def swImpl(stylesExpr: Expr[SwStyle])(using Quotes): Expr[String] = {
  import quotes.reflect.*

  def extractClassNames(term: Term): List[String] = term match {
    case Apply(Select(inner, "first_letter"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"first_letter:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "first_line"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"first_line:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "marker"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"marker:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "selection"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"selection:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "file"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"file:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "placeholder"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"placeholder:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "backdrop"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"backdrop:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "before"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"before:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "after"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"after:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "first"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"first:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "last"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"last:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "only"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"only:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "odd"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"odd:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "even"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"even:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "first_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"first_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "last_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"last_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "only_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"only_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "visited"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"visited:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "target"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"target:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "open"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"open:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "default"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"default:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "checked"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"checked:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "indeterminate"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"indeterminate:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "placeholder_shown"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"placeholder_shown:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "autofill"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"autofill:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "optional"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"optional:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "required"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"required:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "valid"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"valid:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "invalid"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"invalid:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "in_range"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"in_range:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "out_of_range"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"out_of_range:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "read_only"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"read_only:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "empty"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"empty:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "focus_within"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"focus_within:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "hover"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"hover:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "focus"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"focus:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "focus_visible"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"focus_visible:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "active"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"active:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "enabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"enabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "disabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"disabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_first"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_first:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_last"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_last:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_only"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_only:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_odd"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_odd:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_even"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_even:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_first_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_first_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_last_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_last_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_only_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_only_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_visited"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_visited:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_target"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_target:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_open"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_open:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_default"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_default:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_checked"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_checked:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_indeterminate"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_indeterminate:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_placeholder_shown"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_placeholder_shown:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_autofill"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_autofill:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_optional"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_optional:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_required"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_required:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_valid"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_valid:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_invalid"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_invalid:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_in_range"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_in_range:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_out_of_range"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_out_of_range:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_read_only"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_read_only:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_empty"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_empty:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_focus_within"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_focus_within:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_hover"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_hover:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_focus"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_focus:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_focus_visible"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_focus_visible:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_active"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_active:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_enabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_enabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_disabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_disabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_first"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_first:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_last"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_last:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_only"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_only:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_odd"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_odd:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_even"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_even:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_first_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_first_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_last_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_last_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_only_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_only_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_visited"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_visited:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_target"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_target:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_open"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_open:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_default"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_default:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_checked"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_checked:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_indeterminate"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_indeterminate:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_placeholder_shown"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_placeholder_shown:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_autofill"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_autofill:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_optional"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_optional:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_required"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_required:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_valid"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_valid:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_invalid"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_invalid:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_in_range"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_in_range:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_out_of_range"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_out_of_range:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_read_only"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_read_only:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_empty"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_empty:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_focus_within"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_focus_within:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_hover"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_hover:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_focus"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_focus:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_focus_visible"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_focus_visible:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_active"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_active:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_enabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_enabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_disabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_disabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "has"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"has:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_has"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_has:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_has"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_has:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_busy"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_busy:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_checked"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_checked:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_disabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_disabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_expanded"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_expanded:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_hidden"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_hidden:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_pressed"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_pressed:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_readonly"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_readonly:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_required"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_required:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_selected"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_selected:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_busy"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_busy:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_checked"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_checked:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_disabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_disabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_expanded"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_expanded:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_hidden"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_hidden:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_pressed"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_pressed:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_readonly"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_readonly:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_required"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_required:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_selected"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_selected:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_busy"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_busy:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_checked"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_checked:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_disabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_disabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_expanded"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_expanded:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_hidden"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_hidden:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_pressed"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_pressed:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_readonly"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_readonly:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_required"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_required:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_selected"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_selected:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "data"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"data:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_data"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_data:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_data"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_data:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "supports"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"supports:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "motion_safe"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"motion_safe:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "motion_reduce"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"motion_reduce:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "contrast_more"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"contrast_more:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "contrast_less"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"contrast_less:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "max_sm"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"max_sm:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "max_md"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"max_md:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "max_lg"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"max_lg:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "max_xl"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"max_xl:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "max_2xl"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"max_2xl:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "max"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"max:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "sm"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"sm:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "md"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"md:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "lg"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"lg:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "xl"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"xl:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "_2xl"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"_2xl:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "min"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"min:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "portrait"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"portrait:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "landscape"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"landscape:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "ltr"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"ltr:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "rtl"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"rtl:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "dark"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"dark:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "forced_colors"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"forced_colors:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "print"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"print:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "important"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"important:$cls")
      extractClassNames(inner) ++ classes
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
  report.info(s"Compiled: $combinedClasses")
  Expr(combinedClasses)
}
