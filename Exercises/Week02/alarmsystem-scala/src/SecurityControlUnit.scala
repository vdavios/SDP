import java.time.LocalTime
import scala.collection.mutable.ListBuffer


class SecurityControlUnit(sensors : ListBuffer[Sensor]) extends ControlUnit(sensors) {


  private val now = LocalTime.now()

  def timeCheck = {if (now.isBefore(LocalTime.of(22,0)) || now.isBefore(LocalTime.of(6,0)))
    super.pollSensors() else println("Security Sensors are not activated during day time") }

}
