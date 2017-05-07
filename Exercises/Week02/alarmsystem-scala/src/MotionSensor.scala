import scala.util.Random

class MotionSensor extends SecuritySensors{

  def isTriggered: Boolean = Random.nextInt(100) + 1 <= 5

  def getLocation: String = "Vault Room"

  def getSensorType: String = "Motion Sensor"

}
