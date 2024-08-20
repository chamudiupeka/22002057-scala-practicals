package practical9

object nameFormatter {


  def toUpper(input: String): String = input.toUpperCase


  def toLower(input: String): String = input.toLowerCase


  def formatNames(name: String)(format: String => String): String = format(name)

  def main(args: Array[String]): Unit = {

    val benny = formatNames("Benny")(toUpper)
    val niroshan = formatNames("Niroshan")(name => {
      val firstTwo = name.substring(0, 2).toUpperCase
      val remaining = name.substring(2).toLowerCase
      firstTwo + remaining
    })
    val saman = formatNames("Saman")(toLower)
    val kumara = formatNames("Kumara")(name => {
      val firstLetter = name.substring(0, 1).toUpperCase
      val middlePart = name.substring(1, name.length - 1).toLowerCase
      val lastLetter = name.substring(name.length - 1).toUpperCase
      firstLetter + middlePart + lastLetter
    })


    println(benny)
    println(niroshan)
    println(saman)
    println(kumara)
  }
}

