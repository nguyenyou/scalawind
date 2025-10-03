package io.github.nguyenyou.tailwind

class Tailwind(style: String = "") {
  def addClasses(classNames: String): Tailwind = Tailwind(s"$style $classNames".trim)
  def addClass(className: String): Tailwind = addClasses(className)
  override def toString: String = style

  // Classes
  def flex: Tailwind = addClass("flex")
  def bg_black: Tailwind = addClass("bg-black")
  def bg_white: Tailwind = addClass("bg-white")
}

val tw = Tailwind()
