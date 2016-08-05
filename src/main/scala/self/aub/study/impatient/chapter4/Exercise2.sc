import scala.collection.mutable
import scala.collection.mutable.HashMap
import scala.io.{BufferedSource, Source}

val file: BufferedSource = Source.fromFile("/Users/liujinxin/Workspace/study-scala/self.aub.study.impatient/src/main/scala/self.aub.study.impatient.chapter4/words.txt")

val split: Array[String] = file.mkString.split("\\s")

val result: mutable.HashMap[String, Int] = new HashMap[String, Int]


for (word <- split) {
  result(word) = result.getOrElse(word, 0) + 1
}


result