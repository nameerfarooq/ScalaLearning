object Main{
    def main(args:Array[String]): Unit = {

        // maps

        var A:Map[Char, Int] = Map()
        val colors = scala.collection.mutable.Map("red"->"#FF0000","azure"->"#F0FFFF")
        colors("red") = "#xyz"
        colors("blue") = "#sdfsd"
        A += ('I'-> 1)
        A += ('J'-> 5)
        A += ('K'-> 10)

        for(i<-colors){
            println(i)
        }

        //sets
        val set1=Set(1,2,3)
        // set1+= (5) this will give error as it is an immutable set
        println(set1)
        var set2=Set(2,8,9)
        set2+=(6)
        println(set2)

       
    }
}


