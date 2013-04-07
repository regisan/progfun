package greeter

object HelloWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 
  println("Welcome to the Scala worksheet");$skip(15); 
  
  val x = 5;System.out.println("""x  : Int = """ + $show(x ));$skip(11); val res$0 = 
  
  x + x;System.out.println("""res0: Int = """ + $show(res$0));$skip(32); 
  
  def square(x: Int) = x * x;System.out.println("""square: (x: Int)Int""");$skip(15); val res$1 = 
  
  square(x);System.out.println("""res1: Int = """ + $show(res$1));$skip(174); 
  
  def sum(f: Int => Int, a: Int, b: Int): Int = {
  
  	def loop(a: Int, acc: Int): Int = {
  		if (a > b) acc
  		else loop(a + 1, acc + f(a))
  	}
  	
  	loop(a, 0)
  };System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(24); val res$2 = 
  
 sum(x => x, 0, 100);System.out.println("""res2: Int = """ + $show(res$2))}
  
  
}
