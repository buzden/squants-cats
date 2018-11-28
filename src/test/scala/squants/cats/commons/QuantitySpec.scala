package squants.cats.commons

import cats.Order
import cats.instances.option._
import cats.kernel.CommutativeGroup
import cats.kernel.laws.discipline.{CommutativeGroupTests, OrderTests}
import org.scalacheck.Arbitrary._
import org.specs2.{ScalaCheck, Specification}
import org.typelevel.discipline.specs2.Discipline
import squants.{Dimension, Quantity}

abstract class QuantitySpec[Q <: Quantity[Q]: Order:CommutativeGroup](implicit val dimension: Dimension[Q])
    extends Specification with ScalaCheck with Discipline { def is = s2"""
  $orderingLaws
  $groupLaws
  """

  private def orderingLaws = checkAll(dimension.name, OrderTests[Q].order)
  private def groupLaws = checkAll(dimension.name, CommutativeGroupTests[Q].commutativeGroup)
}
