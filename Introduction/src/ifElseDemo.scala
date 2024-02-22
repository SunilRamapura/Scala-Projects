import java.net.PasswordAuthentication
import scala.io.StdIn.*
object ifElseDemo {
  def main(args:Array[String]): Unit={
    while(true){

    println("Enter the Marks: ")
    var marks:Int = readInt()

    if (marks>=0 && marks<=39) {
      println("You have failed........")
      println("------------------------")
      println("Please retake the exam")
    }
    else if (marks>=40 && marks<=100) {
      println("You have passed......")
      if(marks<=59)
        println("Class: Second Class")
      else if(marks<=79)
        println("Class: First Class")
      else
        println("Class: Distinction")
    }
    else
      println("You have entered invalid marks. Please enter (0-100)")
    }
  }
}
