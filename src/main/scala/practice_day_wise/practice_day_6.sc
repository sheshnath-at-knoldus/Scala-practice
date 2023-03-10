import scala.annotation.tailrec

def repeatedFunction(stringValue :String, resursionTime :Int ): String = {
  if(resursionTime ==0) stringValue
  else  stringValue + repeatedFunction( stringValue ,resursionTime-1)
 }
 print(repeatedFunction( "Hello ",5))



 @tailrec
 def usingforwithfunction(index:Int) : Int ={
  if (index  == 5 ) index
  else  usingforwithfunction( index + 1)
   }
    print(usingforwithfunction(0))



def gift (giftName :String , giftQty : Int) : String  ={
  s" This is $giftName for $giftQty childrens "
}
println(gift("Toy Car " ,12 ))



def evennumber (number :Int ): String = {
  val check : String= {
    if( (number/2 ) % 2 ==0) " Even number "
    else " not an even number "
  }
  check
}
print(evennumber(4))

def evenNumber (number : Int) :String ={
  def check( inputnumber :Int):String ={
    if(inputnumber%2==0) " Even numberr"
    else " Not an  even number"
  }
  check(number)

}
print(evennumber(4))


//type inference

//val x : Int ="hello"
val xy: Char = 128
print(xy)
val x  :Char =99
print(x)

val c : Float = 'a'
print(c)
val cc :Double = 'a'
print(cc)


//  when you need loops  ,use  Tial recursion

def tailrecursion (  firstString :String ,secondString  :String , numberoftimes : Int ) :String = {
  var result =""
  if (numberoftimes <=0) secondString
  else
    tailrecursion(firstString ,secondString+firstString,numberoftimes-1 )
}

print(tailrecursion("hello","",5))

//call by name and call by value

def callByValue (value : Long) : Unit = {
  print("by value =  "+ value)
  print("by value =  "+ value)
}


def callByName (value : Long) : Unit ={
  print("by name =  "+ value)
  print("by name =  "+ value)
}

callByName(System.nanoTime())
callByValue(System.nanoTime())

def infinite() :Int =1 + infinite()
def printFirst (x: Int ,y : => Int )= println(x)

printFirst(34,infinite())


def methodOverloading () :Int ={
  2+3
}
def methodOverloading(a :Int ,b :Int) : Int ={
  a+b
}
println(methodOverloading())
println(methodOverloading(2,3))








//
// def nestedLoopUsingFunction(indexouter: Int): Int = {
//  def internalFunction(indexIner: Int): String ={
//   if (indexIner ==5)
//   else
//  }
//  internalFunction(5)
//  print(internalFunction(5))
//  if (indexouter == 5) indexouter
//  else
//   internalFunction(indexouter -1)
// }
//print(nestedLoopUsingFunction(5))



//def outerFunction(outerindex :Int) :Int ={
//
//      def inerFunction( inerindex :20 =Int) :Unit= {
//         if (inerindex == 5) {
//        print(inerindex)
//         } else {
//          inerFunction(inerindex - 1)
//          print(inerindex)
//         }
//      }
//  inerFunction(10)
//  if(outerindex==5)
//  { outerindex}
// else
//  outerFunction(outerindex-1)
// }
//print(outerFunction(10))

