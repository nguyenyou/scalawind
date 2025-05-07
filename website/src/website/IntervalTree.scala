import scala.annotation.tailrec

case class OffsetRange(from: Int, to: Int):
  override def toString: String = s"[$from-$to]"

trait IntervalTree[T]:
  def resolve(offset: Int): List[T]

private enum Tree:
  case Split(point: Int, left: Tree, right: Tree, in: List[OffsetRange])
  case Leaf(span: OffsetRange)
  case Empty

object IntervalTree:
  def construct[T](mp: Map[OffsetRange, T]): IntervalTree[T] =

    enum WorkType:
      case Process(work: List[OffsetRange])
      case Fuse(centerPoint: Int, overlapping: List[OffsetRange])

    @tailrec
    def splitTR(
        workStack: List[WorkType],
        stack: List[Tree]
    ): Option[Tree] =
      workStack match
        case Nil => stack.headOption
        case WorkType.Fuse(centerPoint, overlapping) :: rest =>
          splitTR(
            rest,
            Tree.Split(
              centerPoint,
              stack.tail.head,
              stack.head,
              overlapping
            ) +: stack.drop(2)
          )
        case WorkType.Process(sortedSpans) :: rest =>
          if sortedSpans.size == 1 then
            splitTR(rest, Tree.Leaf(sortedSpans.head) +: stack)
          else if sortedSpans.size == 0 then splitTR(rest, Tree.Empty +: stack)
          else
            val start = sortedSpans.head.from
            val end = sortedSpans.last.to
            val centerPoint = (start + end) / 2
            val toTheLeft = List.newBuilder[OffsetRange]
            val toTheRight = List.newBuilder[OffsetRange]
            val overlapping = List.newBuilder[OffsetRange]

            sortedSpans.foreach { span =>
              if span.to < centerPoint then toTheLeft += span
              else if span.from > centerPoint then toTheRight += span
              else overlapping += span
            }

            splitTR(
              WorkType.Process(toTheLeft.result()) ::
                WorkType.Process(toTheRight.result()) ::
                WorkType.Fuse(centerPoint, overlapping.result()) ::
                rest,
              stack
            )
      end match
    end splitTR

    val sorted =
      mp.keys.toList.sortBy(_.from)

    val data =
      splitTR(List(WorkType.Process(sorted)), Nil).getOrElse(Tree.Empty)

    Impl(data, mp)
  end construct

  private class Impl[T](tree: Tree, mp: Map[OffsetRange, T])
      extends IntervalTree[T]:
    override def resolve(offset: Int): List[T] =
      import Tree.*
      @tailrec
      def go(t: Tree, result: List[OffsetRange]): List[OffsetRange] =
        t match
          case Split(point, left, right, in) =>
            if offset == point then in ++ result
            else if offset > point then
              go(right, in.filter(_.to >= offset) ++ result)
            else if offset < point then
              go(left, in.filter(_.from <= offset) ++ result)
            else result
          case Leaf(span) =>
            if span.from > offset || span.to < offset
            then result
            else span :: result
          case Empty => result

      go(tree, Nil).flatMap(mp.get)
    end resolve
  end Impl

end IntervalTree
