package squants.cats

import cats.kernel.CommutativeGroup
import cats.{Order, Show}
import squants.{Dimension, Quantity}

package object instances {
  implicit def orderForQ[Q <: Quantity[Q]: Dimension]: Order[Q] = Order.fromOrdering

  implicit def showForQ[Q <: Quantity[Q]: Dimension]: Show[Q] = Show.fromToString

  implicit def groupForQ[Q <: Quantity[Q]: Dimension]: CommutativeGroup[Q] = new CommutativeGroup[Q] {
    override def combine(x: Q, y: Q): Q = x + y
    override def empty: Q = implicitly[Dimension[Q]].primaryUnit(0)
    override def inverse(a: Q): Q = -a
  }
}
