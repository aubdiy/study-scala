def mi(x: Double, n: Int): Double = {
  if (n == 0) {
    1
  } else if (n > 0 && n % 2 == 0) {
    mi(x, n / 2) * mi(x, n / 2)
  } else if (n > 0 && n % 2 == 1) {
    x * mi(x, n - 1)
  } else {
    1 / mi(x, -n)
  }
}

mi(2, 4)