package squants.cats.instances

import squants.Dimension
import squants.energy._

object energy {
  implicit val energyDimension: Dimension[Energy] = Energy
  implicit val energyDensityDimension: Dimension[EnergyDensity] = EnergyDensity
  implicit val molarEnergyDimension: Dimension[MolarEnergy] = MolarEnergy
  implicit val powerDimension: Dimension[Power] = Power
  implicit val powerDensityDimension: Dimension[PowerDensity] = PowerDensity
  implicit val powerRampDimension: Dimension[PowerRamp] = PowerRamp
  implicit val specificEnergyDimension: Dimension[SpecificEnergy] = SpecificEnergy
}
