package squants.cats.commons

import cats.Order
import cats.instances.option._
import cats.kernel.CommutativeGroup
import cats.kernel.laws.discipline.{CommutativeGroupTests, OrderTests}
import org.scalacheck.Arbitrary._
import org.scalacheck.{Arbitrary, Cogen, Gen}
import org.specs2.{ScalaCheck, Specification}
import org.typelevel.discipline.specs2.Discipline
import squants.{Dimension, Quantity}

abstract class QuantitySpec[Q <: Quantity[Q]: Order:CommutativeGroup](val dimension: Dimension[Q])
    extends Specification with ScalaCheck with Discipline { def is = s2"""
  $orderingLaws
  $groupLaws
  """

  implicit val arbitraryQ: Arbitrary[Q] = Arbitrary {
    val unitsOfDimension = dimension.units.toSeq
    for {
      unit <- Gen oneOf unitsOfDimension
      value <- arbitrary[Double]
    } yield unit(value)
  }
  implicit val cogenForQ: Cogen[Q] = Cogen(q => q.value.toLong + q.unit.symbol.##)

  private def orderingLaws = checkAll(dimension.name, OrderTests[Q].order)
  private def groupLaws = checkAll(dimension.name, CommutativeGroupTests[Q].commutativeGroup)
}
