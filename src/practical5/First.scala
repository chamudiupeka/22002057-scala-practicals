package practical5

import scala.io.StdIn.readLine

object First {
  def main(args: Array[String]): Unit = {
    val productList = getProductList()
    printProductList(productList)
    println(s"Total number of products: ${getTotalProducts(productList)}")
  }


  def getProductList(): List[String] = {

  var products = List[String]()
    var input =""

    println("Enter product names (type 'done' to finish):")
    do {
      input = readLine()
      if (input != "done") {
        products = products :+ input
      }
    } while (input != "done")

    products
  }

  def printProductList(products: List[String]): Unit = {
    products.zipWithIndex.foreach { case (product, index) =>
      println(s"${index + 1}. $product")
    }
  }

  def getTotalProducts(products: List[String]): Int = {
    products.length}

}