package main.scala.Person


case class CaseClassPerson(first: String, last: String) {

}

object CaseClassPerson {
  def apply(fullName: String): CaseClassPerson = {
    val name = fullName.split("")
    new CaseClassPerson(name(0), name(1))
  }
}
