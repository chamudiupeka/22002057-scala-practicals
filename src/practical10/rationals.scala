package practical10

class Fraction(n: Int, d: Int) {
  require(d != 0, "Denominator must be non-zero")

  // Simplify the fraction
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  // Method to subtract two fractions
  def -(that: Fraction): Fraction = {
    new Fraction(
      this.numer * that.denom - that.numer * this.denom,
      this.denom * that.denom
    )
  }

  // Method to calculate the greatest common divisor
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  // Override toString method to print the fraction in a/b form
  override def toString: String = s"$numer/$denom"
}

// Usage example
object FractionTest {
  def main(args: Array[String]): Unit = {
    val x = new Fraction(3, 4) // x = 3/4
    val y = new Fraction(5, 8) // y = 5/8
    val z = new Fraction(2, 7) // z = 2/7

    // Calculate y - z
    val result = y - z

    // Print the result
    println(s"Result of y - z: $result") // Output: Result of y - z: 11/56
  }
}
