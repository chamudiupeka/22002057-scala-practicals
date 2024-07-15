package practical5

import scala.collection.mutable
import scala.io.StdIn.readLine

case class Book(title: String, author: String, isbn: String)

object Second {

  val library: mutable.Set[Book] = mutable.Set(
    Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"),
    Book("1984", "George Orwell", "9780451524935"),
    Book("To Kill a Mockingbird", "Harper Lee", "9780061120084")
  )

  def main(args: Array[String]): Unit = {
    var continue = true

    while (continue) {
      println(
        "\nLibrary Management System:\n1. Display Collection\n2. Add Book\n3. Remove Book\n4. Check Book by ISBN\n5. Search Book by Title\n6. Display Books by Author\n7. Exit"
      )
      val choice = readLine("Enter your choice: ")

      choice match {
        case "1" => displayCollection()
        case "2" => addBook()
        case "3" => removeBook()
        case "4" => checkBookByISBN()
        case "5" => searchBookByTitle()
        case "6" => displayBooksByAuthor()
        case "7" => continue = false
        case _ => println("Invalid choice. Please try again.")
      }
    }
  }

  def displayCollection(): Unit = {
    if (library.isEmpty) {
      println("The library is currently empty.")
    } else {
      println("Current Library Collection:")
      library.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
    }
  }

  def addBook(): Unit = {
    val title = readLine("Enter book title: ")
    val author = readLine("Enter book author: ")
    val isbn = readLine("Enter book ISBN: ")
    val book = Book(title, author, isbn)

    if (library.contains(book)) {
      println("This book is already in the library.")
    } else {
      library += book
      println("Book added successfully.")
    }
  }

  def removeBook(): Unit = {
    val isbn = readLine("Enter ISBN of the book to remove: ")
    val bookToRemove = library.find(_.isbn == isbn)

    bookToRemove match {
      case Some(book) =>
        library -= book
        println("Book removed successfully.")
      case None =>
        println("Book not found in the library.")
    }
  }

  def checkBookByISBN(): Unit = {
    val isbn = readLine("Enter ISBN of the book to check: ")
    val bookExists = library.exists(_.isbn == isbn)

    if (bookExists) {
      println("The book is in the library.")
    } else {
      println("The book is not in the library.")
    }
  }

  def searchBookByTitle(): Unit = {
    val title = readLine("Enter title of the book to search: ")
    val book = library.find(_.title.equalsIgnoreCase(title))

    book match {
      case Some(b) =>
        println(s"Book found: Title: ${b.title}, Author: ${b.author}, ISBN: ${b.isbn}")
      case None =>
        println("Book not found.")
    }
  }

  def displayBooksByAuthor(): Unit = {
    val author = readLine("Enter author to display their books: ")
    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))

    if (booksByAuthor.isEmpty) {
      println("No books found by this author.")
    } else {
      println(s"Books by $author:")
      booksByAuthor.foreach(book => println(s"Title: ${book.title}, ISBN: ${book.isbn}"))
    }
  }


}
