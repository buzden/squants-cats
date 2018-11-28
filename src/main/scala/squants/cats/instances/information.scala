package squants.cats.instances

import squants.Dimension
import squants.information.{DataRate, Information}

object information {
  implicit val dataRateDimension: Dimension[DataRate] = DataRate
  implicit val informationDimension: Dimension[Information] = Information
}
