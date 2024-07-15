package practical4


object InventoryManagement {
  def main(args: Array[String]): Unit = {
    var itemNames: Array[String] = Array("Apples", "Bananas", "Oranges")
    var itemQuantities: Array[Int] = Array(10, 5, 8)

    def displayInventory(): Unit = {
      println("Inventory:")
      for (i <- itemNames.indices) {
        println(s"${itemNames(i)}: ${itemQuantities(i)}")
      }
    }

    def restockItem(itemName: String, quantity: Int): Unit = {
      val index = itemNames.indexOf(itemName)
      if (index >= 0) {
        itemQuantities(index) += quantity
        println(s"Restocked $quantity of $itemName.")
      } else {
        println(s"Item '$itemName' does not exist in inventory.")
      }
    }

    def sellItem(itemName: String, quantity: Int): Unit = {
      val index = itemNames.indexOf(itemName)
      if (index >= 0) {
        if (itemQuantities(index) >= quantity) {
          itemQuantities(index) -= quantity
          println(s"Sold $quantity of $itemName.")
        } else {
          println(s"Not enough $itemName in inventory to sell $quantity.")
        }
      } else {
        println(s"Item '$itemName' does not exist in inventory.")
      }
    }


      displayInventory()

      restockItem("Apples", 5)
      restockItem("Grapes", 10)

      sellItem("Bananas", 2)
      sellItem("Oranges", 10)
      sellItem("Pineapples", 1)

      displayInventory()


  }
}