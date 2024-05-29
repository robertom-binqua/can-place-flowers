package org.binqua.examples.canplaceflowers

import scala.annotation.tailrec

object Solution {
  private sealed trait State
  private case object Finished extends State
  private case object ZeroZeroBefore extends State
  private case object OneBefore extends State
  private case object Started extends State
  private case object StartedWithZero extends State
  private case object ZeroBefore extends State

  def canPlaceFlowers(flowerbed: Array[Int], n: Int): Boolean =
    moveToAnotherPot(flowerbed.toList, n, Started)

  @tailrec private def moveToAnotherPot(
      flowerbed: List[Int],
      seedLeft: Int,
      state: State
  ): Boolean =
    if (seedLeft == 0)
      true
    else
      flowerbed match {
        case ::(head, Nil) =>
          val newSeedLeft = (head, state) match {
            case (0, ZeroBefore | ZeroZeroBefore | Started | StartedWithZero) => seedLeft - 1
            case _                                                            => seedLeft
          }
          moveToAnotherPot(Nil, newSeedLeft, state = Finished)
        case ::(head, left) =>
          (head, state) match {
            case (0, Started) =>
              moveToAnotherPot(left, seedLeft, state = StartedWithZero)
            case (0, StartedWithZero) =>
              moveToAnotherPot(left, seedLeft - 1, state = ZeroBefore)
            case (0, ZeroBefore) =>
              moveToAnotherPot(left, seedLeft, state = ZeroZeroBefore)
            case (0, ZeroZeroBefore) =>
              moveToAnotherPot(left, seedLeft - 1, state = ZeroBefore)
            case (0, OneBefore) =>
              moveToAnotherPot(left, seedLeft, state = ZeroBefore)
            case (1, _) =>
              moveToAnotherPot(left, seedLeft, state = OneBefore)
            case _ => throw new IllegalStateException("I was not expecting this")
          }
        case Nil => seedLeft == 0
      }
}
