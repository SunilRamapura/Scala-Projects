import scala.io.StdIn.*
import scala.collection.mutable.ListBuffer

object SecondScalaCode {

  def main(args: Array[String]): Unit = {

    var uni = "   DMUK    "

    uni = uni.trim.concat(" is located in Almaty")
    println(uni)

    if(uni.contains("Almaty"))
      println("Yes, iT IS...")

    var newString = uni.substring(8,15)
    println(newString)

    var words = uni.split(" ")
    println(words(0))
    println(words(1))

    var myList: List[Any] = List("DMUK","KIMEP","NAZARBAYEV")

    var myShoppingList = ListBuffer[String]()
    myShoppingList.addOne("Bread")
    myShoppingList.addOne("Milk")
    myShoppingList += ("Cake")
    myShoppingList += ("Honey", "Flour")
    myShoppingList.append("Water","Tea")

    myShoppingList.foreach(println)
    myList.foreach(println)

    var i=1
    for (items <- myShoppingList) {
      println("The " + i + " item is " + items)
      i += 1
    }

    myShoppingList.remove(3)
    myShoppingList.foreach(println)

    myShoppingList(3) = "New Item"
    myShoppingList.foreach(println)


    println(myShoppingList)

    if(myList.isEmpty)
      println("The list is empty...")
    else
      println(myList)

    //insert(),remove(),append(), pop()

  }
}
