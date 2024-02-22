

object Details {
  def main(args: Array[String]): Unit = {
    var day: Int = 22
    var month: String = "Sep"
    var year: Int = 1974
    var initial: Char = 'L'
    var message: String = "My first name initial is " + "\"" + initial + "\"" +
      " and I was born on " + day + '/' + month + '/' + year + '.'

    print(message)
  }
}