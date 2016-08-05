var result: Long = 1
val str = "Hello"
str.foreach(result *= _.toLong)
println(result)