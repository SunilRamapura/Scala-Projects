import scala.math.sqrt

object blockDemo {

  def main(args:Array[String]): Unit = {
    val x = 10
    val x0 = 5
    val y = 20
    val y0 = 10
    val distance:Double = {
      val dx = x - x0
      val dy = y - y0
      sqrt(dx*dx + dy*dy)
    }
    println("Distance = " + distance)
  }

}
