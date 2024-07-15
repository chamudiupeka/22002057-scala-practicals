package practical4

object FormatName {
  def main(args: Array[String]): Unit = {
    //uppercase
    def toUpper(name: String): String = name.toUpperCase

    // lowercase
    def toLower(name: String): String = name.toLowerCase


    def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)


      // Test inputs
      val names = List("Benny", "Niroshan", "Saman", "Kumara")


      names.foreach { name =>name match {
          case "Benny" => println(formatNames(name)(toUpper))
          case "Niroshan" => println(formatNames(name)(name => {
            val formatted = new StringBuilder(name)
            formatted(0) = Character.toUpperCase(formatted(0))
            formatted(1) = Character.toUpperCase(formatted(1))
            formatted.toString()
          }))
          case "Saman" => println(formatNames(name)(toUpper))
          case "Kumara" => println(formatNames(name)(name => {
            val formatted = new StringBuilder(name)
            formatted(0) = Character.toUpperCase(formatted(0))
            formatted(formatted.length - 1) = Character.toUpperCase(formatted(formatted.length - 1))
            formatted.toString()
          }))
          case _ => println(name)
        }
      }
    }



}
