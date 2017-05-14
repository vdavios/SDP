package decorator

class SimplyVegPizza extends Pizza {
  def getDesc: String = {
    getClass.getSimpleName + " (" + getPrice + " )"
  }

  def getPrice: Double = {
    230.0
  }
}
