import scala.io.StdIn
object Countdivisor extends App {
  val userInputA: Int = StdIn.readInt()
  val userInputB: Int = StdIn.readInt()
  val userInputC: Int = StdIn.readInt()

  try {

    if  (userInputA == 0 || userInputB == 0 ||userInputC ==0) {
      throw new Exception("no input value")
    }


    def countdivisor(userInputA: Int, userInputB: Int, userInputC: Int): Int = {
      var counter = 0
      for (index <- userInputA to userInputB) {
        if (index % userInputC == 0) {
          counter = counter + 1
        }
      }
      counter
    }
    print(countdivisor(userInputA, userInputB, userInputC))
  }
  catch {
    case e: Exception =>
      println("An error occurred : " + e.getMessage)
  }
}
