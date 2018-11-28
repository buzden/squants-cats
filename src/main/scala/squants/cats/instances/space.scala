package squants.cats.instances

import squants.Dimension
import squants.space._

object space {
  implicit val angleDimension: Dimension[Angle] = Angle
  implicit val areaDimension: Dimension[Area] = Area
  implicit val lengthDimension: Dimension[Length] = Length
  implicit val solidAngleDimension: Dimension[SolidAngle] = SolidAngle
  implicit val volumeDimension: Dimension[Volume] = Volume
}
