1==2
val x :Int =42
print(x)
val string :String ="Hello"
print(string)
val aboolean :Boolean =true
println(aboolean)
val achar :Char ='q'
println(achar)
val along :Long  =766976767677676l
print(along)

val x =1+2
println(x)
val z = x+1
print(z)

val codeblock ={
  val x=23
  val y=x+23
println(y)
}
println(codeblock)

object function extends App {
  private def afunction(a : String, b:Int ):String= {
   a + "" +b
  }
  print(afunction("hellp",23))
}

val v =Vector("hello world")
v.map(str =>str.split(" "))

val numbers = List(1, 2, 3, 4, 5)
val doubledNumbers = numbers.map(n => n * 2)
print(doubledNumbers)

val numbers = List(1, 2, 3, 4, 5)
val evenNumbers = numbers.filter(n => n % 2 == 0)
print(evenNumbers)


for(n <- 1 to 3 ) println(n)

for(n <- Vector(1,2,3)) yield n+1


for(n <- Set (1,2,3))yield  "#" +n
//generator
val vec =Vector(2,4,5)
for(elem <- vec) yield (elem +1)


// multiple generator
for{
  n <- 1 to 3
  m <- 1 to n
}yield n*m


//filters
for{
  n <- 1 to 3 if n%2 ==1
  m <- 1 to n
}yield n*m

//for{
//  time <- times
//  hours =time.hours if hours >12
//}

//for(n <- 1 to 3 )yield n+1
//(1to 3 ).map(n=>n+1)



for(n <- 1 to 3 ; m <-1 to n )yield n*m
(1 to 3) .flatMap(n=> (1 to n ).map(m=>n *m))
//
//for(n <- 1 to 3) println(n)
//(1to 3) .foreach(n => println(n))



class Animal {
  def eat (): Unit = println(" hello world")
  private def secret (): Unit = println(" hiii")
}
class Bird extends Animal {
  eat ()
  secret()
}
