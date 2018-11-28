package squants.cats.instances

import squants.Dimension
import squants.radio._

object radio {
  implicit val irradianceDimension: Dimension[Irradiance] = Irradiance
  implicit val radianceDimension: Dimension[Radiance] = Radiance
  implicit val radiantIntensityDimension: Dimension[RadiantIntensity] = RadiantIntensity
  implicit val spectralIntensityDimension: Dimension[SpectralIntensity] = SpectralIntensity
  implicit val spectralIrradianceDimension: Dimension[SpectralIrradiance] = SpectralIrradiance
  implicit val spectralPowerDimension: Dimension[SpectralPower] = SpectralPower
}
