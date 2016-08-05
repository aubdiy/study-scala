import scala.io.{BufferedSource, Source}

val file: BufferedSource = Source.fromFile("/Users/liujinxin/Workspace/study-scala/self.aub.study.impatient/src/main/scala/self.aub.study.impatient.chapter9/doc")
file.mkString.split("\\s+").foreach(word => if(word.length>3)println(word))