package practical6

import scala.io.StdIn.readLine

object StudentRecordsManager {


  def getStudentInfo(): (String, Int, Int, Double, Char) = {

    def calculateGrade(marks: Int, totalMarks: Int): (Double, Char) = {
      val percentage = (marks.toDouble / totalMarks) * 100
      val grade = percentage match {
        case p if p >= 90 => 'A'
        case p if p >= 75 => 'B'
        case p if p >= 50 => 'C'
        case _ => 'D'
      }
      (percentage, grade)
    }

    val (name, marks, totalMarks) = getStudentInfoWithRetry()
    val (percentage, grade) = calculateGrade(marks, totalMarks)
    (name, marks, totalMarks, percentage, grade)
  }


  def printStudentRecord(studentRecord: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = studentRecord
    println(s"Name: $name")
    println(s"Marks: $marks")
    println(s"Total Possible Marks: $totalMarks")
    println(s"Percentage: $percentage%")
    println(s"Grade: $grade")
  }


  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty"))
    } else if (marks < 0 || totalMarks < 0) {
      (false, Some("Marks and total possible marks must be positive integers"))
    } else if (marks > totalMarks) {
      (false, Some("Marks cannot exceed total possible marks"))
    } else {
      (true, None)
    }
  }


  def getStudentInfoWithRetry(): (String, Int, Int) = {
    var isValid = false
    var name = ""
    var marks = 0
    var totalMarks = 0

    while (!isValid) {
      println("Enter student name:")
      name = readLine()
      println("Enter marks:")
      marks = readLine().toInt
      println("Enter total possible marks:")
      totalMarks = readLine().toInt

      val (valid, errorMessage) = validateInput(name, marks, totalMarks)
      if (valid) {
        isValid = true
      } else {
        println(s"Invalid input: ${errorMessage.get}")
      }
    }

    (name, marks, totalMarks)
  }

  def main(args: Array[String]): Unit = {
    val studentRecord = getStudentInfo()
    printStudentRecord(studentRecord)
  }
}
