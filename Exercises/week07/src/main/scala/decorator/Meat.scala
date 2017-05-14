package decorator

class Meat(val pizza: Pizza) extends PizzaDec(pizza) {
  override def getDesc: String = {
    super.getDesc + space + getClass.getSimpleName + " (14.25)"
  }

  override def getPrice: Double = {
    super.getPrice + 14.25
  }
}
