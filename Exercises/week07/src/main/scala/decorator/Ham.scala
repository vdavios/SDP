package decorator

class Ham(val pizza: Pizza) extends PizzaDec(pizza) {
  override def getDesc: String = {
    super.getDesc + space + getClass.getSimpleName + " (18.12)"
  }

  override def getPrice: Double = {
    super.getPrice + 18.12
  }
}
