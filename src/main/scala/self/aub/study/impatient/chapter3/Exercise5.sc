val doubles: Array[Double] = Array(1.0,3.5,7,6.8)
val sum: Double = doubles.sum
val d: Double = sum/doubles.length


def aveArray(arr:Array[Double]):Double={
  arr.sum/arr.length
}

aveArray(Array(1,1.1,2.2,3.4))