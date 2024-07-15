package practical5

object Third {

  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readLine("Enter the number of Fibonacci numbers to print: ").toInt
    printFibonacciNumbers(n)
  }

  def fibonacci(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }

  def printFibonacciNumbers(n: Int): Unit = {
    for (i <- 0 until n) {
      println(fibonacci(i))
    }
  }

}
