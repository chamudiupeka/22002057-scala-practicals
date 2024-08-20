import scala.io.StdIn.readLine

object InterestCalculator {

  def calculateInterest(deposit: Double): Double = {
    deposit  match {
      case amount if amount <= 20000    => amount * 0.02
      case amount if amount <= 200000   => amount * 0.04
      case amount if amount <= 2000000  => amount * 0.035
      case amount if amount >  2000000  => amount * 0.065
    }
  }

  def main(args: Array[String]): Unit = {
    while (true) {
      println("Enter the deposit amount or type 'exit' to quit:")
      val input = readLine()

      if (input.toLowerCase == "exit") {
        println("Program terminated.")
        return
      }

      try {
        val deposit = input.toDouble
        val interest = calculateInterest(deposit)
        println(s"Interest for deposit of Rs. $deposit : Rs. $interest")
      } catch {
        case _: NumberFormatException =>
          println("Invalid input. Please enter a valid number or 'exit' to quit.")
      }
    }
  }
}
