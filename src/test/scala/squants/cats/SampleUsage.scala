package squants.cats

import cats.instances.list._
import cats.syntax.foldable._
import org.scalacheck.Prop.forAll
import org.specs2.{ScalaCheck, Specification}
import squants.Time
import squants.cats.commons._
import squants.cats.instances._
import squants.cats.instances.time._

class SampleUsage extends Specification with ScalaCheck { def is = s2"""
  Sample squants-cats usage
    combining the whole list $combineAllList
  """

  private def combineAllList = forAll { t: List[Time] =>
    val _ = t.combineAll
    true
  }
}
