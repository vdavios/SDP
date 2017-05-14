package decorator

class Spinach(val pizza: Pizza) extends PizzaDec(pizza) {
  override def getDesc: String = {
    super.getDesc + space + getClass.getSimpleName + " (7.92)"
  }

  override def getPrice: Double = {
    super.getPrice + 7.92
  }
}
