import scala.io.StdIn.*
object VarX {
  def main(args: Array[String]): Unit = {
    println(("dmuk".charAt(1)-2).toChar)
    var myList = List.range(1,101)
    myList.foreach(println)
    var y = List.fill(3)(5)
    println(myList.head)
    println(myList.reverse)

  }
}