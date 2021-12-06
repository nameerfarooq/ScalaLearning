import scala.util.Random
object Main{
    def main(args:Array[String]): Unit = {
        def AsciiGen(list:List[Char],s:Int,e:Int):List[Char]={
            if(s==e)
                list.reverse
            else AsciiGen(s.toChar :: list, s+1, e)

        }
        def CharArray(start:Int):List[Char]={
            AsciiGen(List(),start,123)
        }
        println(CharArray(97))
    }
}