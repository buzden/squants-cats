package squants.cats.instances

import squants.Dimension
import squants.electro._

object electro {
  implicit val areaElectricChargeDensityDimension: Dimension[AreaElectricChargeDensity] = AreaElectricChargeDensity
  implicit val capacitanceDimension: Dimension[Capacitance] = Capacitance
  implicit val conductivityDimension: Dimension[Conductivity] = Conductivity
  implicit val electricChargeDimension: Dimension[ElectricCharge] = ElectricCharge
  implicit val electricChargeDensityDimension: Dimension[ElectricChargeDensity] = ElectricChargeDensity
  implicit val electricChargeMassRatioDimension: Dimension[ElectricChargeMassRatio] = ElectricChargeMassRatio
  implicit val electricCurrentDimension: Dimension[ElectricCurrent] = ElectricCurrent
  implicit val electricCurrentDensityDimension: Dimension[ElectricCurrentDensity] = ElectricCurrentDensity
  implicit val electricFieldStrengthDimension: Dimension[ElectricFieldStrength] = ElectricFieldStrength
  implicit val electricPotentialDimension: Dimension[ElectricPotential] = ElectricPotential
  implicit val electricalConductanceDimension: Dimension[ElectricalConductance] = ElectricalConductance
  implicit val electricalResistanceDimension: Dimension[ElectricalResistance] = ElectricalResistance
  implicit val inductanceDimension: Dimension[Inductance] = Inductance
  implicit val linearElectricChargeDensityDimension: Dimension[LinearElectricChargeDensity] = LinearElectricChargeDensity
  implicit val magneticFieldStrengthDimension: Dimension[MagneticFieldStrength] = MagneticFieldStrength
  implicit val magneticFluxDimension: Dimension[MagneticFlux] = MagneticFlux
  implicit val magneticFluxDensityDimension: Dimension[MagneticFluxDensity] = MagneticFluxDensity
  implicit val permeabilityDimension: Dimension[Permeability] = Permeability
  implicit val permittivityDimension: Dimension[Permittivity] = Permittivity
  implicit val resistivityDimension: Dimension[Resistivity] = Resistivity
}
