import com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time

class Time (var hours :Int ,var minutes:Int )
{
  val asMinutes:Int = hours * 60 + minutes
println(asMinutes)
}
 val time =new Time(2,3)


