package practical3

object SumOfEvenNumbers {
  def main(args: Array[String]): Unit = {

    def sumOfEvenNumbers(numbers: List[Int]): Int = {
      numbers.filter(_ % 2 == 0).sum
    }

    val numbers = List(1, 2, 3, 4, 5, 6)
    val sumEven = sumOfEvenNumbers(numbers)
    println(sumEven)

  }
}