def lteqgt(value: Array[Int], v: Int) = {
  (
    value.count(_ < v),
    value.count(_ == v),
    value.count(_ > v)
    )
}

lteqgt(Array(4,5,1,7),4)