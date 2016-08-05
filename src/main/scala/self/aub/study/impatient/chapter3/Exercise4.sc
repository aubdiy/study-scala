import scala.collection.mutable.ArrayBuffer

def reorderArray(arr: Array[Int]) = {
  var a = ArrayBuffer[Int]()
  var b = ArrayBuffer[Int]()
  arr.foreach(element => if (element > 0) a += element else b += element)
  a ++= b
}


reorderArray(Array(1, -5, 0, -6, 8))


def reorderArray2(arr: Array[Int]) = {
  val a: Array[Int] = arr.filter(_ > 0)
  val b: Array[Int] = arr.filter(_ <= 0)
  val newarr = a ++ b
  newarr
}

reorderArray2(Array(1, -5, 0, -6, 8))