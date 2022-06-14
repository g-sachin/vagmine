package patternmatching

object PatternMatching extends App{

  patternMatchingWithVariable
  pmWithFunction("red")
  pmWithAnyType(123)
  pmWithAnyType("random")
  pmWithAnyType(34L)

  val list = List(1, 4, 7, 11, 67)
  pmWithList(list)

  println(pmWithSumOfList(list))

  def patternMatchingWithVariable: Unit = {
    var day = "Friday"

    day match {
      case "Monday" => println("Mondays blue")
      case "Tuesday"=> println("Be foucsed its tuesday")
      case "Friday" => println("yoo its Fri-yay")
      case "Saturday" => println("let me sleep ..tomorrow is sunday")
    }
  }

  def pmWithFunction(color: String) = color match {
      case "black" => println("BLACK")
      case "red" => println("RED")
      case _ => println("Unknown color")
    }


  def pmWithAnyType(any:Any): Unit = any match {
    case a:Int => println("INTEGER")
    case st:String => println("String type")
    case l:Long => println("Long type")
    case _ => println("Unknown type")
  }

  def pmWithList(ls:List[Int]) = ls match {
    case a:List[Int]  => println(a)
    case Nil => None
  }

  // a is head and :: tail denotes the rest of list
  // once it reaches the last element, tail becomes Nil and recursion ends
  def pmWithSumOfList(ls:List[Int]):Int = ls match {
    case a :: tail => a + pmWithSumOfList(tail)
    case Nil => 0
  }

}
