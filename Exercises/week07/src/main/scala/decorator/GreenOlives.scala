package decorator

class GreenOlives(val pizza: Pizza) extends PizzaDec(pizza) {
  override def getDesc: String = {
    super.getDesc + space + getClass.getSimpleName + " (5.47)"
  }

  override def getPrice: Double = {
    super.getPrice + 5.47
  }
}
