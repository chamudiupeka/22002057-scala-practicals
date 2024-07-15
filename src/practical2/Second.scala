package practical2

object Second {
  def main(args: Array[String]): Unit = {
    var a = 2
    var b = 3
    var c = 4
    val d = 5
    val k = 4.3f
    var g = 0.0f

    b -= 1
    println(b * a + c * d)

    println(a)
    a += 1

    println(-2 * (g - k) + c)

    println(c)
   

    c += 1
    println(c * a)
    a += 1

  }

}
