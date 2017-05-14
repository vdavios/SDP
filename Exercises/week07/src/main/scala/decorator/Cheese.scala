package decorator

class Cheese(val pizza: Pizza) extends PizzaDec(pizza) {
  override def getDesc: String ={

    super.getDesc + space + getClass.getSimpleName + " (20.72)"
  }

  override def getPrice: Double = {

    super.getPrice + 20.72
  }
}
