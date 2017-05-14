package decorator


class PizzaDec(pizza: Pizza) extends Pizza{
  val space = ", "

  override def getDesc: String = pizza.getDesc

  override def getPrice: Double = pizza.getPrice

}
