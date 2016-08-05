var result: Long = 1
val str = "Hello"

for (ch <- str) {
  result *= ch.toLong
}

println(result)

