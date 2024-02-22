import scala.io.StdIn.*
object whileDemo {

  def main(args:Array[String]): Unit = {

    //Generate and display the area of circle with radius 1-100
    //area of circle = pi *  radius * radius
    val PI = 3.1419
    /*
    //Count based while loop
    var i:Int = 1
    var areaOfCircle:Double = 0
    while (i<=100) //condition
      {
        areaOfCircle = PI * i * i //statements
        println(f"The area of the circle with radius $i is $areaOfCircle%.2f")
        i = i + 1 //updation
      }
      */

    /*
    //flag-based while loop
    var exitFlag:Boolean = false
    var i = 1
    while (!exitFlag)
      {
        var areaofCircle = PI * i * i
        println(f"The area of the circle with radius $i is $areaofCircle%.2f")
        i = i + 1
        println("------------ Do you wish to continue(Y/N) with the next value---------")
        var input = readChar()
        exitFlag = {
          if input=='Y' || input=='y' then false
          else true
        }
        }
    */

    /*
    //while loop based on the data length
    val numberArray: Array[Int] = Array(10, 20, 30, 40, 50, 78, 98, 123)
    var index = 0
    while (index < numberArray.length) {
      var areaofCircle = PI * numberArray(index) * numberArray(index)
      println(f"The area of the circle with radius ${numberArray(index)} is $areaofCircle%.2f")
      index = index + 1
    }
    */

    /*
    //for loop example
    var areaofCircle: Double = 0
    for i <- numberArray
      do
        areaofCircle = PI * i * i
        println(f"The area of the circle with radius $i is $areaofCircle%.2f")

    var i: Int = 1
    while {
      var areaofCircle = PI * i * i
      println(f"The area of the circle with radius $i is $areaofCircle%.2f")
      i = i + 1
      i<10
    } do() */

      // ask the user = number of rows (4), number of columns(8)

    println("Enter the number of rows: ")
    var rows = readInt //3
    println("Enter the number of Columns: ")
    var cols = readInt //8
    var i = 1
    while(i<=rows)
      {
        var j = 1
        while(j<=cols)
          {
            print("*")
            j += 1
          }
        println()
        i += 1
      }

  }
}
