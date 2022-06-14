package patternmatching

object PMWithCaseClass extends App {

  //USE CASE - I
  val tiger = Animal(false)
  fly(tiger)

  case class Animal(canFly:Boolean )

  def fly(a:Animal) = a match {
    case Animal(true) => println("can fly")
    case Animal(false) => println("NOOO ")
  }


  // USE-CASE II
  abstract class DelimitedLine
  case class TabDelimited() extends DelimitedLine
  case class SpaceDelimited() extends DelimitedLine
  case class CommaDelimited() extends DelimitedLine

  val tab = TabDelimited()
  val space = SpaceDelimited()
  val comma = CommaDelimited()
  println("S" + delimiter(tab) + "G")
  println("S" + delimiter(space) + "G")
  println("S" + delimiter(comma) + "G")

  def delimiter(dl: DelimitedLine):String = dl match {
    case TabDelimited() => "\t"
    case SpaceDelimited() => " "
    case CommaDelimited() => ","
  }

}
