import java.awt.{Point, Rectangle}

class Square(point: Point, width: Int) extends Rectangle(point.x, point.y, width, width) {
  def this() {
    this(new Point(0, 0), 0)
  }

  def this(width: Int) {
    this(new Point(0, 0), width)
  }
}