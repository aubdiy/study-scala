def countdown_a(n: Int): Unit = {
  var i = n
  while (i >= 0) {
    println(i)
    i -= 1
  }
}

def countdown_b(n: Int): Unit = {
  (0 to n reverse).foreach(println(_))
}

countdown_a(5)
countdown_b(5)

