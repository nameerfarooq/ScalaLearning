import scala.util.Random
object Main{
    def main(args: Array[String]): Unit = {
    def randGenerator(arr:List[Int],start:Int,end:Int,size:Int):List[Int]={
        if(size == arr.length)
            arr
        else
        randGenerator(arr :+ Random.between(start,end),start,end,size)
    }
    def randomNumberGenerator(start:Int,end:Int,size:Int):List[Int]={
        randGenerator(List(),start,end,size)
    }

    val list = randomNumberGenerator(50,500,15)
    println("list of random numbers: "+list)
    }
}