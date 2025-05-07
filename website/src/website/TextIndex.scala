import scala.collection.SortedMap

/** Datastructure that helps managing (line, column) to (offset) mapping for a
  * given text.
  */
case class TextIndex private (lines: SortedMap[Int, OffsetRange], text: String):
  private val lookupLineByOffset: IntervalTree[Int] =
    IntervalTree.construct(lines.toMap.map(_.swap))

  /** Find offset for given line and column */
  def posLookup(line: Int, col: Int): Option[Int] =
    lines.get(line).map { range =>
      range.from + col
    }

  /** Find range for given line */
  def lineSpan(line: Int): Option[OffsetRange] =
    lines.get(line)

  /** For a given offset, find the line it's on */
  def lineOf(offset: Int): Option[OffsetRange] =
    val candidates = lookupLineByOffset.resolve(offset)
    candidates.headOption.flatMap(lines.get)
end TextIndex

object TextIndex:
  def construct(text: String): TextIndex =
    val m =
      text.linesWithSeparators.zipWithIndex.foldLeft(
        0 -> List.empty[OffsetRange]
      ) { case ((offset, spans), (line, lineIdx)) =>
        val length = line.length - line.count(c => c == '\n')

        ((offset + line.length), OffsetRange(offset, offset + length) :: spans)
      }

    TextIndex(
      SortedMap(
        m._2.reverse.zipWithIndex.map(_.swap)*
      ),
      text
    )
  end construct
end TextIndex
