import scala.io.{BufferedSource, Source}

val file: BufferedSource = Source.fromFile("/Users/liujinxin/Workspace/study-scala/self.aub.study.impatient/src/main/scala/self.aub.study.impatient.chapter9/doc")
val lines: Iterator[String] = file.getLines()
lines.foreach(line=>println(line.replaceAll("\t","    ")))
