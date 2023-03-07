import scala.Short.MinValue.%
import scala.io.Source.DefaultBufSize.%
import scala.io.StdIn

var array =Array (1,2,3,4)

for( i <-0 to array.length-1)
  {
    println(array(i))
  }

var twoDimArray = Array (  (1,2) ,(2,3) ,(1))
{
for(i <- 0 to array.length -1)
  {
    for(j <- 0 to array.length-1)
      {
        println(array(i,j)
      }
  }
}


// started the Rock the JVM course

object Function extends App {
  def aFunction (a:String ,b  :Int ) :String = {
  a + " " +b
  }
  print("hello " ,3)
}





