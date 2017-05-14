package main.scala.Counter


case class caseClassCounter(value: Int = 0) {
  def inc = caseClassCounter(value+1)
  def dec = caseClassCounter(value-1)
}
