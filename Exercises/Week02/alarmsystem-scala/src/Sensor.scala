trait Sensor  {
  def isTriggered: Boolean

  def getLocation: String

  def getSensorType: String

  //Removed getBatteryPercentage because it violates Liskov Substitution Principle
}

abstract case class HazardSensors() extends Sensor {def getBatteryPercentage: Double }
abstract case class SecuritySensors() extends Sensor






