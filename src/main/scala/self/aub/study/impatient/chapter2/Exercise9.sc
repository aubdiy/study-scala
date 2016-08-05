def product(s: String): Long = {
  if (s.length == 1) {
    s.charAt(0).toLong
  } else {
    s.charAt(0).toLong * product(s.tail)
  }
}

product("Hello")