def product(s: String) = {
  var result: Long = 1
  s.foreach(result *= _.toLong)
  result
}

product("Hello")