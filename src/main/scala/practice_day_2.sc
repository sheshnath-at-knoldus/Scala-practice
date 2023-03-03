import java.lang

class mutable_fields {
  var message ="hello world"
  println(message)
}
 val mutable_object = new  mutable_fields

def method_demo = "hello world"
def method_demo_2 (message :String):String =message
//method_demo_2(message:String)String




class Time (var hours :Int ,var minutes:Int )
{
  val asMinutes:Int = hours * 60 + minutes
  println(asMinutes)
}
val time =new Time(2,3)





//class MyClass(param1: Int, param2: String) {
//  val myField: String = "Hello"
//
//  def myMethod(): Unit = {
//    println(myField + " " + param2)
//  }
//}




class Trainexample (val string_value: String ,val Number_value :Int)
{
print(string_value ,Number_value)
}
val object_train =new Trainexample("hello" ,20)



var array_values =Array(1,2,3,4,5,)
println(array_values)