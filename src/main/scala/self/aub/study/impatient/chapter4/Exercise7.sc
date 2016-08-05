import scala.collection.JavaConversions._

val properties: scala.collection.mutable.Map[String, String] = System.getProperties

var maxKeyLen = 0;
for ((k, v) <- properties) {
  if (maxKeyLen < k.length) {
    maxKeyLen = k.length
  }
}
maxKeyLen += 5
for ((k, v) <- properties) {
  println(k + " " * (maxKeyLen - k.length) + "|     " + v)
}

