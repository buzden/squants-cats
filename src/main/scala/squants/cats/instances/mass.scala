package squants.cats.instances

import squants.Dimension
import squants.mass._

object mass {
  implicit val areaDensityDimension: Dimension[AreaDensity] = AreaDensity
  implicit val chemicalAmountDimension: Dimension[ChemicalAmount] = ChemicalAmount
  implicit val densityDimension: Dimension[Density] = Density
  implicit val massDimension: Dimension[Mass] = Mass
  implicit val momentOfInertiaDimension: Dimension[MomentOfInertia] = MomentOfInertia
}
