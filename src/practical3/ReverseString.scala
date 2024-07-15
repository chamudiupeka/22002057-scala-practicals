package practical3

object ReverseString {
  def main(args: Array[String]): Unit = {

    val str = "Scala"

    def reverseString(s: String): String = {
      if (s.isEmpty) ""
      else reverseString(s.tail) + s.head
    }

    val reversedStr = reverseString(str)
    println(reversedStr)
      
  }
}
