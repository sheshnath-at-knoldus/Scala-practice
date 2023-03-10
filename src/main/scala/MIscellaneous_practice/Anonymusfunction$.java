object Anonymusfunction extends App{

        val doubler:Int=>Int=(x:Int)=>x*2
        println(doubler(3))
        val tripler:Int=>Int=x=>x*3
        println(tripler(3))
        val quadrapler=(x:Int)=>x*4
        println(quadrapler(4))

        val add:(Int,Int)=>Int=(a:Int,b:Int)=>a+b
        println(add(2,3))
        val evennumer=(number:Int)=>{if(number%2==0)"even"else"odd"}
        println(evennumer(2))
        val stringconcatinate:(String,String)=>String=(s1:String,s2:String)=>s1+s2
        println(stringconcatinate("hello","world"))
        val numberr=(a:Int,b:Int)=>a*b+" abc"
        println((numberr(2,3)))


        }
