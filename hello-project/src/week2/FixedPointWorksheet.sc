package week2

import math.abs

object FixedPointWorksheet {

	val tolerance = 0.0000001                 //> tolerance  : Double = 1.0E-7
	def isCloseEnough(x: Double, y: Double) =
		abs((x - y) / x) / x < tolerance  //> isCloseEnough: (x: Double, y: Double)Boolean

	def fixedPoint(f: Double => Double)(firstGuess: Double) = {
		def iterate(guess: Double): Double = {
			val next = f(guess)
			if (isCloseEnough(guess, next)) next
			else iterate(next)
		}
		iterate(firstGuess)
	}                                         //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
	
	fixedPoint(x => 1 + x/2)(1)               //> res0: Double = 1.999999761581421
	def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double
	
	def sqrt(x: Double) =
		fixedPoint(averageDamp(y => x / y))(1)
                                                  //> sqrt: (x: Double)Double
  sqrt(2)                                         //> res1: Double = 1.414213562373095
}