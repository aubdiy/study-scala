val goods = Map("a" -> 10, "b" -> 20, "c" -> 30)
goods("b")

for ((k, v) <- goods) yield (k, v * 0.9)