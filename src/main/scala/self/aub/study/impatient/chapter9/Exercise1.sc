import scala.io.{BufferedSource, Source}

val file: BufferedSource = Source.fromFile("/Users/liujinxin/Workspace/study-scala/self.aub.study.impatient/src/main/scala/self.aub.study.impatient.chapter9/doc")
val reverse: Array[String] = file.getLines().toArray.reverse
reverse.foreach(line=>println(line))
