import scala.util.Random

class FireSensor extends HazardSensors {
  var batteryPercentage = 100
  override def isTriggered: Boolean ={drainBattery ; Random.nextInt(100)+1<=5}

  override def getLocation: String = "1st floor"

  override def getSensorType: String = "Fire Sensor"

  override def getBatteryPercentage: Double = batteryPercentage
  private def drainBattery:Int = batteryPercentage - 10
}
