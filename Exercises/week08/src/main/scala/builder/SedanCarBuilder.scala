package builder

//TODO

object SedanCarBuilder extends CarBuilder {
  private val sedanCar = new Car("SEDAN")
  override def buildBodyStyle: Unit = sedanCar.setBodyStyle(
    """
      |External dimensions: overall length (inches): 202.9
      |overall width (inches): 76.2, overall height (inches): 60.7
      |wheelbase (inches): 65.5 and curb to curb turning circle (feet): 39.5
    """.stripMargin)

  override def buildPower: Unit = sedanCar.setPower(
    "285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm"
  )

  override def buildEngine: Unit = sedanCar.setEngine(
    "3.5L Duramax V 6 DOHC"
  )

  override def buildBreaks: Unit = sedanCar.setBreaks(
    "Four-wheel disc brakes: two ventilated, Electronic brake distribution"
  )

  override def buildSeats: Unit = sedanCar.setSeats(
    "Front seat centre armrest. Rear seat centre armrest. Split-folding rear seats"
  )

  override def buildWindows: Unit = sedanCar.setWindows(
    "Laminated side windows. Fixed rear window with defroster"
  )

  override def buildFuelType: Unit = sedanCar.setFuelType(
    "Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range"
  )

  override def getCar: Car = sedanCar
}
