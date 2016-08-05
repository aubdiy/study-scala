import scala.math.random

def randomArray(n: Int) = {
  for (i <- 1 to n) yield (random * n).toInt
//  for (i <- 0 until  n) yield (random * n).toInt
}

random

randomArray(5)