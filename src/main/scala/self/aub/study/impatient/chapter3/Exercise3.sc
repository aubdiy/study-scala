def reorderArray(arr: Array[Int]): Array[Int] = {
  (for (i <- 0 until(arr.length, 2)) yield if (i + 1 < arr.length) Array(arr(i + 1), arr(i)) else Array(arr(i)))
    .flatten.toArray
}

println(reorderArray(Array(1, 2, 3, 4, 5)).mkString(","))
