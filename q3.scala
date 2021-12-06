import scala.util.Random
object Main {
  def main(args: Array[String]): Unit = {

    val capitals = Map("France"->"Paris", "Japan"->"tokyo")
    
    println("show(capitals.get(\"japan\")) :"+ show(capitals.get("Japan")) )
    println("show(capitals.get(\"pakistan\")) :"+ show(capitals.get("pakistan")) )

    }
def show(x : Option[String]) = x match{
  case Some(s) =>s
  case None => "?"
}

}