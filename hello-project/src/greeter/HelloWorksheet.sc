package greeter

object HelloWorksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val x = 5                                       //> x  : Int = 5
  
  x + x                                           //> res0: Int = 10
  
  def square(x: Int) = x * x                      //> square: (x: Int)Int
  
  square(x)                                       //> res1: Int = 25
  
}