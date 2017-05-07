import scala.collection.mutable.ListBuffer

class EmergencyController (private val triggeredSensors : ListBuffer[Sensor]) {
  private var called = false

  for(triggeredSensor <- triggeredSensors) {
    triggeredSensor match {
      case sensor: HazardSensors =>
        actionsForHazardSensors(sensor)
        called = true
      case sensor : SecuritySensors => emergencyPlanTwo(sensor)
    }
  }
  
  private def actionsForHazardSensors(sensor: HazardSensors) = {
    if(!called) { println("A " + sensor.getSensorType + "  was triggered at " + sensor.getLocation +
      ". Calling the fire department and the owner")
      called = true
    } else println("A " + sensor.getSensorType + "  was triggered at " + sensor.getLocation +
    ". We ve already taken the appropriate measures. Everything is under control")
  }


  private def emergencyPlanTwo(sensor: SecuritySensors) = println("A " + sensor.getSensorType + " was triggered at "
    + sensor.getLocation + ". Calling the police station and the owner. Property is locked and cameras are recording!")
  println()



}


