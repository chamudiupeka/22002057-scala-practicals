package practical9

object classifyNumbers {

  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Provide exactly one integer.")
      return
    }

    try {
      val input = args(0).toInt


      val result = input match {
        case x if x <= 0 => () => "Negative/Zero is input"
        case x if x % 2 == 0 => () => "Even number is given"
        case _ => () => "Odd number is given"
      }


      println(result())
    } catch {
      case _: NumberFormatException => println("Enter a valid integer.")
    }
  }
}
