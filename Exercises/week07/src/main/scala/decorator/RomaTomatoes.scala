package decorator

class RomaTomatoes(val pizza: Pizza) extends PizzaDec(pizza = ) {
  override def getDesc: String = {
    super.getDesc + space + getClass.getSimpleName + " (5.20)"
  }

  override def getPrice: Double = {
    super.getPrice + 5.20
  }
}
