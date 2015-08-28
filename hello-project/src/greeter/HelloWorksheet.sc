package greeter

object HelloWorksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val x = 5                                       //> x  : Int = 5
  
  x + x                                           //> res0: Int = 10
  
  def square(x: Int) = x * x                      //> square: (x: Int)Int
  
  square(x)                                       //> res1: Int = 25
  
  def sum(f: Int => Int, a: Int, b: Int): Int = {
  
  	def loop(a: Int, acc: Int): Int = {
  		if (a > b) acc
  		else loop(a + 1, acc + f(a))
  	}
  	
  	loop(a, 0)
  }                                               //> sum: (f: Int => Int, a: Int, b: Int)Int
  
 sum(x => x, 0, 100)                              //> res2: Int = 5050
  
  
}