abstract class Shape {
  def centerPoint()
}

class Rectangle extends Shape {
  override def centerPoint() = {
  }
}

class Circle extends Shape {
  override def centerPoint(): Unit = {}
}