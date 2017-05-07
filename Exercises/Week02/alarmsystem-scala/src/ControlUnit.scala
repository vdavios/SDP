import scala.collection.mutable.ListBuffer

class ControlUnit(val sensors: ListBuffer[Sensor]) {
  val triggeredSensors = new ListBuffer[Sensor]()
  def pollSensors() {

    for (sensor <- sensors) {
      if (sensor.isTriggered) {
        addTriggeredSensor(sensor)
      }
      else {
        System.out.println("Polled " + sensor.getSensorType + " at " + sensor.getLocation + " successfully")
        println()
      }
    }
    if(triggeredSensors.nonEmpty) new EmergencyController(triggeredSensors)
  }

  def addTriggeredSensor(triggeredSensor : Sensor) : ListBuffer[Sensor] = triggeredSensors += triggeredSensor
}

object ControlUnit
