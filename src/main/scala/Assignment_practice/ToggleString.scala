package Assignment_practice

import scala.io.StdIn

object ToggleString extends App {
   private val userInput: String = StdIn.readLine()
   var afterToggle = " "
           //exception handling
      try {
         def getToggledString(userInput: String): String = {
              if  (userInput == "" )
                throw new Exception ("No userInput")
              //iterate through the userInput and changing from upper to lower case
              for (index <- 0 until userInput.length) {

                if (userInput.charAt(index).toInt >= 65 && userInput.charAt(index).toInt <= 90) {
                  afterToggle = afterToggle + (userInput.charAt(index) + 32).toChar
                }
                else if (userInput(index) >= 97 && userInput(index) <= 122) {
                  afterToggle = afterToggle + (userInput.charAt(index) - 32).toChar
                }

              }
               // return the result
              afterToggle
         }
       print(getToggledString(userInput))

      } catch {
          case e: Exception =>
            println("An error occurred : " + e.getMessage)
      }
  }
