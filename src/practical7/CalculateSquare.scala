package practical7

import scala.io.StdIn.readLine

object CalculateSquare {
  def calculateSquare(nums: List[Int]): List[Int] = {
    nums.map(num => num * num)
  }

  def main(args: Array[String]): Unit = {
    println("Enter a list of integers separated by spaces:")
    val input = readLine()
    val inputList = input.split(" ").map(_.toInt).toList
    val output = calculateSquare(inputList)
    println("Squares of the input numbers: " + output.mkString(", "))
  }
}
