object Functions {

  def main(args: Array[String]): Unit = {
    def foo(a:Int):Int = {
      return a*6
    }

    def boo(b:Int): Unit = {
      print(b)
    }

    //val soo = (a:Int):Int => a*6
    val soo = (a:Int) => a

    println(foo(5))
    boo(4)
    println("")
    println(soo) //Functions$$$Lambda$14/0x0000000800065840@25af5db5
    println(soo(8))
  }
}
class Functions {

}

/**
 * i) define funtion - by default return type is unit
 *     def foo(a:Int):Int = {
 *     }
 *
 * ii) Lamda function - '=>' for expression
 *    val foo = (a:Int):Int => a*5
 *
 *    foo(4) - print 20
 *
 *
 *    FUNCTION vs Method
 *
 *    Method - is a function that defined as member of specific object
 *    Function - is a group of statements that execute together to perform a specific task &
 *               can be created as a complete object
 */
