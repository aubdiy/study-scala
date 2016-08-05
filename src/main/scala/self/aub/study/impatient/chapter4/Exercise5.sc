

import scala.collection.JavaConversions._
import java.util.TreeMap
import scala.io.{BufferedSource, Source}

val file: BufferedSource = Source.fromFile("/Users/liujinxin/Workspace/study-scala/self.aub.study.impatient/src/main/scala/self.aub.study.impatient.chapter4/words.txt")

val split: Array[String] = file.mkString.split("\\s")


var result: scala.collection.mutable.Map[String, Int] = new TreeMap[String, Int]

for (word <- split) {
  result += (word -> (result.getOrElse(word, 0) + 1))
}


result