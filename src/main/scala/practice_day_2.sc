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