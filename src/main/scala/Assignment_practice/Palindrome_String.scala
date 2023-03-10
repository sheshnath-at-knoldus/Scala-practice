package Assignment_practice

import scala.Console.println
import scala.io.StdIn
object Palindrome_String extends App {
  // exception handling
  try {
    val user_input = StdIn.readLine()
    if (user_input == "")
      throw new Exception ("no input value")

    def isPalindrome(user_input: String): Boolean = {
      // Define to the start and end of the string
      var start_of_string = 0
      var end_of_string = user_input.length - 1
      // Iterate through the string
      while (start_of_string < end_of_string) {
        // Check if the characters at the start and end are equal
        if (user_input(start_of_string) != user_input(end_of_string)) {
          return false
        }
        start_of_string += 1
        end_of_string -= 1
      }
      // return value to the method
      true
    }
    // check for palindrome
    if (isPalindrome(user_input)) {
      println("YES")
    } else {
      println("NO")
    }
  }  catch {
    case e: Exception =>
      println("An error occurred: " + e.getMessage)
  }
}