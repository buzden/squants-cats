package squants.cats.instances

import squants.Dimension
import squants.photo._

object photo {
  implicit val illuminanceDimension: Dimension[Illuminance] = Illuminance
  implicit val luminanceDimension: Dimension[Luminance] = Luminance
  implicit val luminousEnergyDimension: Dimension[LuminousEnergy] = LuminousEnergy
  implicit val luminousExposureDimension: Dimension[LuminousExposure] = LuminousExposure
  implicit val luminousFluxDimension: Dimension[LuminousFlux] = LuminousFlux
  implicit val luminousIntensityDimension: Dimension[LuminousIntensity] = LuminousIntensity
}
