package squants.cats

import org.scalacheck.Arbitrary.arbitrary
import org.scalacheck.{Arbitrary, Cogen, Gen}
import squants.{Dimension, Quantity}

package object commons {
  private[commons] def dimension[Q <: Quantity[Q]](implicit d: Dimension[Q]): Dimension[Q] = d

  implicit def arbitraryQ[Q <: Quantity[Q]: Dimension]: Arbitrary[Q] = Arbitrary {
    val unitsOfDimension = dimension.units.toSeq
    for {
      unit <- Gen oneOf unitsOfDimension
      value <- arbitrary[Double]
    } yield unit(value)
  }

  implicit def cogenForQ[Q <: Quantity[Q]: Dimension]: Cogen[Q] = Cogen { q =>
    q.to(dimension.primaryUnit).toLong
  }
}
