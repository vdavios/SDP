
object NumberPersonalities  {

  val limit = 100

  def main(args: Array[String]): Unit ={
    for(i <- 1 to limit) {
     println(s"$i  ${if (isPrime(i)) "p, " else "c, "}" +
       s"${if(isHappy(i))"h, "else "u"}")


    }

  }

  def isPrime(n: Int): Boolean = {
    if(n == 1){
      return false
    }
   for(i <- 2 until n-1; if n%i ==0){
     return false
   }
    true
  }

  def isHappy(n: Int): Boolean = {
    var found = false
    var k = n
    var result = 0
    while(k>0) {
      result+=math.pow(k%10, 2).toInt
      k/=10
      if(result!=1 && result!=4 && k==0){
        k = result
        result = 0
      }
    }
    if(result == 1) found =  true

    if(result == 4) found = false
    found

  }



}
