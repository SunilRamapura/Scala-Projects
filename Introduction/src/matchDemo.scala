import scala.io.StdIn.*
object matchDemo {

  def main(args:Array[String]): Unit = {
    while (true)
      {
        var pi = 3.14564646
        println(f"$pi%6.2f")
        var mychar = 60L
        println("-----Standard Calculator-----")
        println("Menu: 1.Add\t 2.Sub\t 3.Div\t 4.Mul\t 5/6.Exit")
        println("Enter your choice: ")
        var choice:Int = readInt
        choice match
          case 1 =>
            println("Enter number1: ")
            var num1 = readFloat()
            println("Enter number2: ")
            var num2 = readFloat()
            println("Sum = " + (num1+num2))
          case 2=>
            println("Enter number1: ")
            var num1 = readFloat()
            println("Enter number2: ")
            var num2 = readFloat()
            var result = num1-num2
            println(s"Difference = $result")
          case 3 =>
            println("Enter number1: ")
            var num1 = readFloat()
            println("Enter number2: ")
            var num2 = readFloat()
            println("Division = " + (num1 / num2))
          case 4 =>
            println("Enter number1: ")
            var num1 = readFloat()
            println("Enter number2: ")
            var num2 = readFloat()
            var result = num1 * num2
            var name = "DMUK"
            println(f"Product = $result%10.2f $name%10s")
          case 5 | 6 =>
            System.exit(0)
          case _ =>
            println("Invalid Input.... Try again with the choice(1-5)...")
      }
  }
}
