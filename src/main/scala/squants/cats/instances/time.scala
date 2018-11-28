package squants.cats.instances

import squants.Dimension
import squants.time.{Frequency, Time}

object time {
  implicit val frequencyDimension: Dimension[Frequency] = Frequency
  implicit val timeDimension: Dimension[Time] = Time
}
