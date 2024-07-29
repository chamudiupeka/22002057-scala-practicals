package practical6

object InventoryManager {

   case class Product(id: Int, name: String, quantity: Int, price: Double)

   val inventory1: Map[Int, Product] = Map(
    101 -> Product(101, "Laptop", 10, 1500.0),
    102 -> Product(102, "Mouse", 50, 25.0),
    103 -> Product(103, "Keyboard", 30, 75.0)
  )

  val inventory2: Map[Int, Product] = Map(
    102 -> Product(102, "Mouse", 20, 30.0),
    104 -> Product(104, "Monitor", 15, 300.0),
    105 -> Product(105, "Printer", 5, 200.0)
  )

  // I. Retrieve all product names from inventory1
  def getAllProductNames(inventory: Map[Int, Product]): List[String] = {
    inventory.values.map(_.name).toList
  }

  // II. Calculate the total value of all products in inventory1
  def calculateTotalValue(inventory: Map[Int, Product]): Double = {
    inventory.values.map(p => p.quantity * p.price).sum
  }

  // III. Check if inventory1 is empty
  def isInventoryEmpty(inventory: Map[Int, Product]): Boolean = {
    inventory.isEmpty
  }

  // IV. Merge inventory1 and inventory2
  def mergeInventories(inventory1: Map[Int, Product], inventory2: Map[Int, Product]): Map[Int, Product] = {
    inventory2.foldLeft(inventory1) {
      case (mergedInventory, (id, product2)) =>
        mergedInventory.get(id) match {
          case Some(product1) =>
            mergedInventory + (id -> product1.copy(
              quantity = product1.quantity + product2.quantity,
              price = math.max(product1.price, product2.price)
            ))
          case None =>
            mergedInventory + (id -> product2)
        }
    }
  }

  // V. Check if a product with a specific ID exists and print its details
  def checkProductById(inventory: Map[Int, Product], productId: Int): Unit = {
    inventory.get(productId) match {
      case Some(product) =>
        println(s"Product ID: ${product.id}, Name: ${product.name}, Quantity: ${product.quantity}, Price: ${product.price}")
      case None =>
        println(s"Product with ID $productId does not exist.")
    }
  }

  def main(args: Array[String]): Unit = {
    // I. Retrieve all product names from inventory1
    println("Product Names in Inventory 1:")
    getAllProductNames(inventory1).foreach(println)

    // II. Calculate the total value of all products in inventory1
    val totalValue = calculateTotalValue(inventory1)
    println(s"\nTotal Value of Inventory 1: $$${totalValue}")

    // III. Check if inventory1 is empty
    val isEmpty = isInventoryEmpty(inventory1)
    println(s"\nIs Inventory 1 Empty? $isEmpty")

    // IV. Merge inventory1 and inventory2
    val mergedInventory = mergeInventories(inventory1, inventory2)
    println("\nMerged Inventory:")
    mergedInventory.values.foreach(println)

    // V. Check if product ID 102 exists and print its details
    println("\nChecking Product with ID 102:")
    checkProductById(inventory1, 102)
  }
}

