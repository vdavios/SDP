package Factory

class ConcreteCreator extends Creator{
  override def create(pr: Any): Product = new ConcreteProduct(pr)

}
