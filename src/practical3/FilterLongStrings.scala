package practical3

object FilterLongStrings {
  def main(args: Array[String]): Unit = {

    def LongStrings(strings: List[String]): List[String] = {
      strings.filter(_.length > 5)
    }

    val strings = List("book", "pen", "pencil", "laptop", "laboratory", "student")

    val filteredStrings = LongStrings(strings)
    println(filteredStrings)

  }
}


