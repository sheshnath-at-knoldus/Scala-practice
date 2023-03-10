package Assignment_practice

import scala.io.StdIn

object Countdivisor extends App {

  // taking inputs from user
  val userInputA: Int = StdIn.readInt()
  val userInputB: Int = StdIn.readInt()
  val userInputC: Int = StdIn.readInt()

  // exception handling implementation
  try {

    // getting the count for divisor
    def getCount(userInputA: Int, userInputB: Int, userInputC: Int): Int = {
      var counter = 0

      //iterate through user input
      for (index <- userInputA to userInputB) {

        if (index % userInputC == 0) {
          counter = counter + 1
        }
      }

      //return count
      counter
    }

    print(getCount(userInputA, userInputB, userInputC))
  }

    //catching exception from try block
  catch {
    case e: Exception =>
      println("An error occurred : " + e.getMessage)
  }
}
