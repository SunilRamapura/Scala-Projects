import scala.io.StdIn.*

object MyFirstScalaCode {

  def main(args: Array[String]): Unit = {
    var n1:Byte = 127; //Byte= 8bit
    var n2:Short = 32767; //Short= 16bit
    var n3:Int = 2147483647; //Int= 32bit
    var number:Long = 9223372036854775807L; //Long= 64bit
    var award:Float = 789798.43543; //32-bit IEEE 754 single-precision floating-point value
    var somevalue:Double = 980724985.4354354354323532324356; //64-bit IEEE 754 single-precision floating-point value)
    var isValid:Boolean = true; //or false
    var singlechar:Char = 'd';
    var StringVar:String = "DMUK";

    isValid = false

    println("Hello Students! Welcome to Scala Programming Session.....\t")
    println("Scala is a Hybrid Programming Language\n")
    println(number)

    println("Enter your age:")
    var age:Int = readInt()
    var code:Char = readChar()
    var nationality:String = readLine("Enter your Nationality")
    var  isTrue = readBoolean()

    if !(nationality=="Kazakhstan")
      then
    {
    println("You are not an Kazakhstan Citizen. So you cannot vote")
    }

    println("No. of Comd Line Arguments: " + args.length)
    println("This is the Command line Argument 1: " + args(0))
    println("This is the Command line Argument 2: " + args(1))
  }
//bool isValid = True; This is mutable
//final bool isValid = True; This is immutable

}
//scalac MyFirstScalaCode.scala
//scala MyFirstScalaCode DMUK London Almaty

//----comments----
//python: print
//c: printf()
//c++: cout
/* java: System.out.println()
scala: print() or println() */