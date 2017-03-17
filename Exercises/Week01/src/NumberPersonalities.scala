
object NumberPersonalities  {

  val limit = 100

  def main(args: Array[String]): Unit ={
    for(i <- 1 to limit) {
     println(s"$i  ${if (isPrime(i)) "p, " else "c, "}" +
       s"${if(isHappy(i))"h, "else "u, "}" +
       s"${if(isTriangular(i))"t, "else "not t, "}" +
       s"${if(isSquare(i))"s, "else "not s, "}" +
       s"${if(isSmug(i))"smug, "else "not smug, "}" +
       s"${if(isHonest(i))"ht, "else "dish, "}" +
       s"${if(isPronic(i))"pr, "else "not pr, "}" +
       s"${if(isPerfect(i))"perfect, "else "not perfect, "}" +
       s"${if(isDeficient(i))"def, "else "not def, "}" +
       s"${if(isAbundant(i))"abundant."else "not abundant."}")


    }

  }
  def isPrime(n: Int): Boolean = {
    if(n == 1){
      return false
    }
   for(i <- 2 until n-1; if n%i ==0) {
     return false
   }
    true
  }
  def isHappy(n: Int): Boolean = {
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
    if(result == 1) return true

    false

  }
  def isTriangular(n: Int): Boolean = {
    var k = n
    var subtract = 1
    while(k>0) {
      k-=subtract
      subtract+=1
    }
    if(k == 0)return true

    false
  }

  def isSquare(n: Int): Boolean = {

    var k = n
    var subtract = 1
    while (k>0){
      k-=subtract
      subtract+=2
    }
    if(k == 0) return true

    false
  }


  def isSmug(n: Int): Boolean = {

    var remainder = 1
    var square = 0
    var num = 1
    while(remainder >square){
      square = num * num
      remainder = n - square
      num+=1
    }

    if(remainder == 0) return false
    isSquare(remainder)

  }

  def isHonest(n: Int): Boolean = {
    var k = 1
    while(n/k > k){
      k+=1
    }
    if(n/k == k) return n == k * k
     true
  }
  def isPronic (n: Int): Boolean = {
    var k = 1
    while(n> k * (k + 1)){
      k+=1
    }
     n == k * (k +1)
  }

  def sumOfPositiveDivisorOf(n :Int ): Int  = {
    var i = 2
    var sum = 1
    while(i < n){
      if(n/i * i == n)
        sum+=n/i
      i+=1
    }
    sum
  }

  def isDeficient(n: Int): Boolean = {
    n > sumOfPositiveDivisorOf(n)
  }
  def isPerfect(n: Int): Boolean = {
    n == sumOfPositiveDivisorOf(n)
  }

  def isAbundant(n: Int): Boolean = {
    n < sumOfPositiveDivisorOf(n)
  }


}
