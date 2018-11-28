package squants.cats.instances

import squants.Dimension
import squants.motion._

object motion {
  implicit val accelerationDimension: Dimension[Acceleration] = Acceleration
  implicit val angularAccelerationDimension: Dimension[AngularAcceleration] = AngularAcceleration
  implicit val angularVelocityDimension: Dimension[AngularVelocity] = AngularVelocity
  implicit val forceDimension: Dimension[Force] = Force
  implicit val jerkDimension: Dimension[Jerk] = Jerk
  implicit val massFlowDimension: Dimension[MassFlow] = MassFlow
  implicit val momentumDimension: Dimension[Momentum] = Momentum
  implicit val pressureDimension: Dimension[Pressure] = Pressure
  implicit val pressureChangeDimension: Dimension[PressureChange] = PressureChange
  implicit val torqueDimension: Dimension[Torque] = Torque
  implicit val velocityDimension: Dimension[Velocity] = Velocity
  implicit val volumeFlowDimension: Dimension[VolumeFlow] = VolumeFlow
  implicit val yankDimension: Dimension[Yank] = Yank
}
