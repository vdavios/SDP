package main.scala.Film

/**
  * Created by vasileiosdavios on 5/14/17.
  */
case class DirectorCaseClass(firstName: String, lastName: String, yearOfBirth: Int) {
  def name: String = firstName + "" + lastName
  def older(d1: Director, d2: Director): Director =
    if(d1.yearOfBirth > d2.yearOfBirth) d1 else d2
}
