import scala.collection.generic.BitOperations

object Forth {
  def main(args: Array[String]): Unit = {
    val basePrice = 15
    val baseAttendance = 120
    val priceStep = 5
    val attendanceChange = 20
    val fixedCost = 500


    def attendance(ticketPrice: Int): Int = baseAttendance + (basePrice - ticketPrice) / priceStep * attendanceChange

    def revenue(ticketPrice: Int): Int = ticketPrice * attendance(ticketPrice)

    def cost(ticketPrice: Int): Int = fixedCost + attendance(ticketPrice)

    def profit(ticketPrice: Int): Int = revenue(ticketPrice) - cost(ticketPrice)

    print(profit(5), profit(10), profit(15), profit(20))


  }

}
