import scala.util.Random

class SmokeSensor extends HazardSensors {
  var batteryPercentage = 100
  override def isTriggered: Boolean = { drainBattery ; Random.nextInt(100)+1<=10 }

  override def getLocation: String = "2nd Floor"

  override def getSensorType: String = "Smoke Sensor"

  override def getBatteryPercentage: Double = batteryPercentage
  private def drainBattery: Int = batteryPercentage - 20
}
