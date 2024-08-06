import scala.io.StdIn.readLine

object FilterEvenNumbers {
  def filterEvenNumbers(nums: List[Int]): List[Int] = {
    nums.filter(_ % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    println("Enter a list of integers separated by spaces:")
    val input = readLine()
    val inputList = input.split(" ").map(_.toInt).toList
    val output = filterEvenNumbers(inputList)
    println("Even numbers in the list: " + output.mkString(", "))
  }
}
