package practical8

object NumberCategorizer {

  def main(args: Array[String]): Unit = {

    if (args.length != 1) {
      println("Please provide exactly one integer as input.")
      sys.exit(1)
    }

    val input = args(0).toInt

    // Define lambda functions for pattern matching
    val isMultipleOfThree = (n: Int) => n % 3 == 0
    val isMultipleOfFive = (n: Int) => n % 5 == 0

    // Pattern matching to categorize the input number
    val message = (input match {
      case n if isMultipleOfThree(n) && isMultipleOfFive(n) => "Multiple of Both Three and Five"
      case n if isMultipleOfThree(n) => "Multiple of Three"
      case n if isMultipleOfFive(n) => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    })

    // Print the corresponding message
    println(message)
  }
}

