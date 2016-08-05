
object Card extends Enumeration {
  val M = Value("♣")
  val T = Value("♠")
  val H = Value("♥")
  val F = Value("♦")

  def color(c:Card.Value): Unit ={
    if(c==Card.M|| c== Card.T){
      println("black")
    }else{
      println("red")
    }
  }
}

Card.color(Card.M)
Card.color(Card.T)
Card.color(Card.H)
Card.color(Card.F)