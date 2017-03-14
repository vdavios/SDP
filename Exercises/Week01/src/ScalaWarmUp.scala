
object ScalaWarmUp extends App{

  object ScalaWarmUp extends App {

    //val num = readLine("Give me an integer please \n")
    //println(s"the number you gave me is $num")

    // val num =  readLine("Give me an integer please \n").toInt
    // println(s"${if(num >= 100) "That's a big number" else "That's a small number";}")

    var num = -2

    do{
      num = readLine("Give me a number \n").toInt
      println(s"you gave me $num. The square of that number is ${num * num}")
    }while(num!=0)

    for(i <- 1 to 25)
    // println(s"Our number is $i and it has a square of ${i * i} and a cube of ${i * i * i}")
      println("our number is "+i+" and it has a square of "+i*i+ "and a cube of "+ i* i * i )
  }
}
