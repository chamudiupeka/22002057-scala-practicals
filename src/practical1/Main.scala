package practical1
object Main {
  def main(args: Array[String]): Unit = {
    //Area of a Disk
    def areaOfDisk(r: Double): Double = math.Pi * r * r

    println("Area : " + areaOfDisk(5))

    //Celsius to Fahrenheit
    def convertToFahrenheit(c: Double): Double = (c * 1.8) + 32

    println("Fahrenheit : " + convertToFahrenheit(35))

    //Volume of Sphere
    def volumeOfSphere(r: Double): Double = (4 / 3) * math.Pi * r * r * r

    println("Volume of Sphere : " + volumeOfSphere(5))


    //Wholesale cost of books
    def bookPrice(x: Int): Double =
    {
      val coverPrice = 24.95
      val discount = 0.4
      val shippingCost = if (x <= 50) x * 3.0 else 3.0 * 50 + (x- 50) * 0.75
      (coverPrice * (1 - discount) + shippingCost) * x
    }

    println("Book Price : " + bookPrice(60))

    //Running Time

    def runningTime(d: Double, p: Double): Double = d/ p
    val easyPace = 8.0
    val tempoPace = 7.0
    val totalRunningTime = runningTime(2, easyPace) + runningTime(3, tempoPace) + runningTime(2, easyPace)
    println("Total Running Time : " + totalRunningTime)
    // ticket





  }

}

