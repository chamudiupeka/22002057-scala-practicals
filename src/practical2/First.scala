package practical2

object First {
  def main(args: Array[String]): Unit = {
    var i,j,k=2
    val m, n = 5
    val f = 12.0f
    val g = 4.0f
    val c = "x"

    val E1 = k+12*m
    val E2= m/j
    val E3= n%j
    val E4= m/j*j
    val E5= f+10*5+g
    i+= 1
    val E6= i*n

    println("k+12*m = "+E1)
    println("m/j = "+E2)
    println("n%j = "+E3)
    println("m/j*j = "+E4)
    println("f+10*5+g = "+E5)
    println("++i*n = "+E6)

  }
}