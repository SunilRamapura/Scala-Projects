import scala.io.StdIn.*
object Exercise1 {

  def main(args:Array[String]): Unit = {

    println("Enter the height(even Num): ")
    var size = readInt()

    for (row <- 0 until size * 2) {
      val spaces = Math.abs(size - row)

      print(" " * spaces)

      if (row < size) {
        val slashes = size - spaces
        print("\\" * slashes)
        print(" " * 2 * spaces)
        println("/" * slashes)
      } else {
        val slashes = row - size + 1
        print("/" * slashes)
        print(" " * 2 * spaces)
        println("\\" * slashes)
      }
    }
    }
  }
