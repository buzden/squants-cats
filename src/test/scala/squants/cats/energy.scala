package squants.cats

import squants.cats.commons.QuantitySpec
import squants.cats.instances._
import squants.cats.instances.energy._
import squants.energy._

class EnergySpec extends QuantitySpec[Energy]
class EnergyDensitySpec extends QuantitySpec[EnergyDensity]
class MolarEnergySpec extends QuantitySpec[MolarEnergy]
class PowerSpec extends QuantitySpec[Power]
class PowerDensitySpec extends QuantitySpec[PowerDensity]
class PowerRampSpec extends QuantitySpec[PowerRamp]
class SpecificEnergySpec extends QuantitySpec[SpecificEnergy]
