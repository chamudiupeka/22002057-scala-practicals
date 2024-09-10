package practical10

object LetterCounter {

  def countLetterOccurrences(words: List[String]): Int = {
    // Step 1: Use map to transform each word into its length
    val lengths = words.map(_.length)

    // Step 2: Use reduce to sum up all the lengths
    val totalLetters = lengths.reduce(_ + _)

    // Return the total count of letter occurrences
    totalLetters
  }

  def main(args: Array[String]): Unit = {
    // Example input
    val words = List("apple", "banana", "cherry", "date")

    // Calculate the total count of letter occurrences
    val totalCount = countLetterOccurrences(words)

    // Print the result
    println(s"Total count of letter occurrences: $totalCount")
  }
}
