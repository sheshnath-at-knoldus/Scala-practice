import scala.Console.println
import scala.io.StdIn

object Palindrome_String extends App{

  val user_input =StdIn.readLine()

        def isPalindrome(aword: String): Boolean = {
          // Define pointers to the start and end of the string
          var start = 0
          var end = aword.length - 1
          // Iterate through the string until the pointers meet in the middle
          while (start < end) {
            // Check if the characters at the start and end pointers are equal
            if (aword(start) != aword(end)) {
              return false
            }
            start += 1
            end -= 1
          }
           true
        }
            if (isPalindrome(user_input)==true)
                println("YES")
            else
              println("NO")

}
