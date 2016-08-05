import scala.collection.mutable.ArrayBuffer

abstract class Item {
  def price(): Double

  def description(): String

  override def toString: String = {
    "description:" + description() + " price:" + price()
  }
}

class SimpleItem(val price: Double, val description: String) extends Item {
}

class Bundle extends Item {
  val items = new ArrayBuffer[Item]()

  def addItem(item: Item): Unit = {
    items.append(item)
  }

  override def price(): Double = {
    var totalPrice = 0
    items.foreach(totalPrice += _.price())
    totalPrice
  }

  override def description(): String = {
    items.mkString(" ")
  }
}