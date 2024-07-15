package practical4


  object PatternMatching  {
    def main(args: Array[String]): Unit = {
      println("Please enter an integer:")
      val input = scala.io.StdIn.readLine()

        try {
          val number =  input.toInt
          number match {
            case x if x <= 0 => println("Negative/Zero is input")
            case x if x % 2 == 0 => println("Even number is given")
            case _ => println("Odd number is given")
          }
        } catch {
          case _: NumberFormatException => println("Please provide a valid integer.")
        }
      }
    }





