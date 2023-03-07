import scala.io.StdIn
object practice extends  App{

  val userInputA: String = StdIn.readLine()
  var flag: Int = 0
  var flagb :Int=1
    for (n <- 0 until userInputA.length) {
      if (userInputA(n) ==  '1' || userInputA(n) == '2' || userInputA(n) == '3' || userInputA(n) == '4' || userInputA(n) == '5' || userInputA(n) == '6' || userInputA(n) == '7' || userInputA(n) == '8' || userInputA(n) == '9' || userInputA(n) == '0')
        {
           flag = 1
        }
        else {
         flagb= 0
      }
    }
       if (flag==1)
         {
           println("true")
         }


  }



