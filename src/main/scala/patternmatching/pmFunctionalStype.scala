package patternmatching

object pmFunctionalStype extends App{
  // Convert a list into single with comma seperated using funcntional stype

  // Imperative way - Java (iterative way)
  val list = List("Delhi", "Mumbai", "Gurgaon", "Bangalore")
  var result = "" // can be StringBuffer
  list.foreach( elem => result += elem + ", ")
  println(result)

  // Functional way - Scala (using pattern matching) (Recursive way)
  print(listToString(list))

  def listToString(list: List[String]):String = list match {
    case head :: tail => head + "," + listToString(tail)
    case Nil => ""
  }





}
