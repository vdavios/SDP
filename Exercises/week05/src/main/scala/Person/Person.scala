package main.scala.Person

class Person(first: String, last: String) {

}

object Person {
  def apply(fullName: String): Person = {
    val name = fullName.split("")
    new Person(name(0), name(1))
  }
}
