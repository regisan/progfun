package week2

object CurryingWorksheet {
  
  /*def sum(f: Int => Int): (Int, Int) => Int = {
  	def sumF(a: Int, b: Int) : Int =
  		if (a > b) 0
  		else f(a) + sumF(a + 1, b)
  		
  	sumF
  }*/
  
  def sum(f: Int => Int)(a: Int, b: Int) : Int =
  	if (a > b) 0 else f(a) + sum(f)(a + 1, b) //> sum: (f: Int => Int)(a: Int, b: Int)Int
  
  def cube(x: Int) = x * x * x                    //> cube: (x: Int)Int
  
  (sum(cube)) (1, 3)                              //> res0: Int = 36
  
  def product(f: Int => Int)(a: Int, b: Int): Int =
  	if (a > b) 1 else f(a) * product(f)(a + 1, b)
                                                  //> product: (f: Int => Int)(a: Int, b: Int)Int
  	
  def fact(n: Int) = product(x => x)(1 , n)       //> fact: (n: Int)Int

  product(x => x * x)(3, 4)                       //> res1: Int = 144
  
  fact(5)                                         //> res2: Int = 120
  
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
  	if (a > b) zero
  	else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
                                                  //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
  def produto(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)
                                                  //> produto: (f: Int => Int)(a: Int, b: Int)Int
	def soma(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x + y, 0)(a, b)
                                                  //> soma: (f: Int => Int)(a: Int, b: Int)Int
	def fatorial(n: Int) = produto(x => x)(1, n)
                                                  //> fatorial: (n: Int)Int
	
	produto(x => x * x)(3,4)                  //> res3: Int = 144
	soma(x => x)(1, 3)                        //> res4: Int = 6
  fatorial(5)                                     //> res5: Int = 120
}