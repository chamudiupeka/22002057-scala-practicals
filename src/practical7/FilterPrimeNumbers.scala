package practical7

import scala.io.StdIn.readLine

object FilterPrimeNumbers {

  def isPrime(num: Int): Boolean = {
    if (num <= 1) {
      false
    } else {
      !(2 until num).exists(n => num % n == 0)
    }
  }


  def filterPrime(nums: List[Int]): List[Int] = {
    nums.filter(num => isPrime(num))
  }

  def main(args: Array[String]): Unit = {
    println("Enter a list of integers separated by spaces:")
    val input = readLine()
    val inputList = input.split(" ").map(_.toInt).toList
    val output = filterPrime(inputList)
    println("Prime numbers in the input list: " + output.mkString(", "))
  }
}

