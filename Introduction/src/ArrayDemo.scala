import scala.io.StdIn.*
object ArrayDemo {

  def main(args: Array[String]): Unit = {

    //println("Enter the size of the Array: ")
    //var size = readInt()
    var myArray = Array[Int](10,20,30,40,50)
    var myArray1 = Array[Int](56,89,87,45,56)
    try{
      print(myArray(20))
      var myArray2 = myArray.concat(myArray1)
      myArray2.foreach(println)
    }
    catch
    {
      case e: ArrayIndexOutOfBoundsException => println("Index Out of bounds.. Invalid Index")
    }
    println("Testing................")
    /*
    //get the array input using for loop
    println(f"Enter the $size values: ")
    for i <- 0 until size do
      myArray(i) = readInt()
    //print the array elements using for loop
    println("Array Elements:")
    for item<-myArray do
      println(f"Item value = $item")

    var i = 0
    while (i<size){
      println(f"Item value = ${myArray(i)}")
      i += 1
    }*/
  }

}
