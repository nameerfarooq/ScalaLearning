object Main{
    def main(args:Array[String]): Unit = {
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


       
    }
}


