object Third {

  def main(args: Array[String]): Unit = {
    val normalRate = 250
    val otRate = 85
    val taxRate = 0.12
    val normalHours = 40
    val otHours = 30

    val grossSalary = (normalHours * normalRate) + (otHours * otRate)
    val tax = grossSalary * taxRate
    val netSalary = grossSalary - tax


    println(f"The take-home salary is Rs.$netSalary%.2f")


  }




}
