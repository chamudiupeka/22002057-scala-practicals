package practical10

class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator must be non-zero")

  // Greatest Common Divisor to simplify the rational number
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  // Method to negate the rational number
  def neg: Rational = new Rational(-numer, denom)

  // Method to calculate the greatest common divisor
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  // Override toString method to print the rational number in a/b form
  override def toString: String = s"$numer/$denom"
}

// Usage example
object RationalTest {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)  // Create a Rational number 3/4
    println(s"Original: $x")    // Output: Original: 3/4

    val y = x.neg               // Negate the rational number
    println(s"Negated: $y")     // Output: Negated: -3/4
  }
}

