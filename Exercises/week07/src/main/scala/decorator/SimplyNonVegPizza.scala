package decorator

class SimplyNonVegPizza extends Pizza {
  override def getDesc: String = {
    getClass.getSimpleName + " (" + getPrice + " )"
  }

  override def getPrice: Double = 350.0

}
