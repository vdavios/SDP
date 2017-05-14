package main.scala.Counter


class Counter(value: Int) {
  def inc = new Counter(value+1)
  def dec = new Counter(value-1)

  def adjust(adder: Adder): Counter = {
    new Counter(adder.add(value))
  }

}
