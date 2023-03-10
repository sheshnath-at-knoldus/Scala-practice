object practiseauxiloryfunction extends App{


        def outerfunction(outerIndex:Int):Int={

        def inerFunction(inerindex:Int):Int={inerindex+1}
        println(inerFunction(5))

        if(outerIndex==0)println("outer index")
        else
        println(s"outer $outerIndex print")
        outerfunction(outerIndex-1)
        }
        print(outerfunction(5))

        }
