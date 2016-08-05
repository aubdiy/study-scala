class Point {
  var i = 0
  var j = 0
}

object Point {
  def apply(i: Int, j: Int) ={
    val point: Point = new Point()
    point.i = 5
    point
  }
}


var p = Point(4, 3)
p.i