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

    def PrimeCheck(primeList : List[Int],list1 : List[Int]):List[Int] = {
        if(list1.length == 0)
            list1
        else{
        
        for(i<-list1){
            if(i==2 | i ==3){
                primeList:+i
            }
            else{
                for( j<-1 to i-1){
                    if(i%j != 0){
                        primeList:+i
                    }
                }
            }
        }
        println("prime number list"+primeList)
    }
}
        val abc = PrimeCheck(List(),list)
        println(abc)
    }
}