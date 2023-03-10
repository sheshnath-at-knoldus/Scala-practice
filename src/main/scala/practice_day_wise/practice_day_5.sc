val x : Int =42
print(x)

val  expression = 1+2
print(expression)
println(2+3*4 +'c')
println(!true)
println(true)
var x=2
x +=2
print(x)


//instruction Vs Expression
/* instruction is for doing something expression has some value
instruction are executed
expressions are evaluated
 */
val aCondition = false
val aConditionValue =if(aCondition) 23 else 45
print(aConditionValue)
print(if(aCondition) 23 else 45)
var  incrementer =0
while(incrementer<10) {
  print(incrementer)
  incrementer += 1
}
//side effects are  println ,whiles. reassigning
// code blocks
val  acodeblock : Int  ={
  val y =12
  val z = 900
  val  a = y+z +'q'
  a
}
println(acodeblock)

def aFunction (a :Char  , b :Int) :Int = {
  a + b
}
println(aFunction('a',23))

def noParameter()=print("hello world" +223)
noParameter()


def printnumbers(anumber :Int ):Unit ={
   if(anumber !=0) {
     print(anumber)
     printnumbers(anumber-1)
   }
}
printnumbers(5)