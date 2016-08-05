val array: Array[Int] = Array(1,2,3,4,5)


def reorderArray(arr: Array[Int]): Array[Int] = {
  val t = arr.toBuffer
  for (i <- 1 until(t.length,2); tmp = t(i); j = i - 1 ) {
    t(i) = t(j)
    t(j) = tmp
  }
  t.toArray
}

reorderArray(array)
println(array.mkString(","))