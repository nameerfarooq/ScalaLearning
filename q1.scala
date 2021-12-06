import scala.util.Random
object Main{
    def main(args:Array[String]): Unit = {
        // first way of defining an array
        var list1 = Array(1,2,3,4,5,6)
        for(i <- list1)
        {
            println(i)
        }

        // second way of defining an array
        var a:Array[Int] = new Array[Int](5)
        a(0)=2;a(1)=4;a(2)=6;a(3)=8;a(4)=10
        for (j<-a)
        {
            println(j)
        }

        // third way of defining an array
        var b = new Array[Int](4)
        b(0)=5 ; b(1)=10 ; b(2)=15 ; b(3)=20
        for(k <- b)
        {
            println(k)
        }
    }
}