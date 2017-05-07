import java.io.FileInputStream
import java.util.Properties

import scala.collection.mutable.ListBuffer

class SensorContainer private() {


  private var hazardSensors = new ListBuffer[Sensor]
  private var securitySensors = new ListBuffer[Sensor]
  private var fireSensor : FireSensor = null
  private var smokeSensor : SmokeSensor = null
  private var motionSensor: MotionSensor =null
  private var props : Properties = null

  props = new Properties
  try {
    props.load(new FileInputStream(
    "alarmsystem-scala/src/bean.properties"))

    val fireSensorClass: String = props.getProperty("fireSensor.class")
    val smokeSensorClass: String = props.getProperty("smokeSensor.class")
    val motionSensorClass: String = props.getProperty("motionSensor.class")

    fireSensor = Class.forName(fireSensorClass).newInstance.
      asInstanceOf[FireSensor]

    smokeSensor = Class.forName(smokeSensorClass).newInstance.
      asInstanceOf[SmokeSensor]
    hazardSensors += fireSensor
    hazardSensors += smokeSensor

    motionSensor = Class.forName(motionSensorClass).newInstance().asInstanceOf[MotionSensor]
    securitySensors += motionSensor
    } catch {
        case ex: Exception => {
        System.err.println("Failed to create factory methods")
        ex.printStackTrace
      }
    }

  def getHazardSensors : ListBuffer[Sensor] = hazardSensors
  def getSecuritySensors: ListBuffer[Sensor] = securitySensors

}

object SensorContainer {
  private val instance : SensorContainer = new SensorContainer
  def getInstance : SensorContainer = instance
}
