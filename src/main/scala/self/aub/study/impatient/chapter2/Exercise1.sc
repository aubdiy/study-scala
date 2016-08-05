def signum(n: Int) = {
  var signum = 0
  if (n > 0) {
    signum = 1
  } else if (n < 0) {
    signum = -1
  } else {
    signum = 0
  }
  signum
}

signum(0)
signum(5)
signum(-9)

BigInt(20).signum