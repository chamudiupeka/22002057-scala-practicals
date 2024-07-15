package practical3

object Average {
  def main(args: Array[String]): Unit = {

    def average(num1: Int, num2: Int): Double = {
      val mean = (num1 + num2) / 2.0
      BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    }

    val num1 = 10
    val num2 = 20
    val mean = average(num1, num2)
    println(mean)

  }
}