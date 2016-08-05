import scala.io.{BufferedSource, Source}

/**
  * Created by liujinxin on 16/5/5.
  */
val file: BufferedSource = Source.fromFile("/Users/liujinxin/Workspace/study-scala/self.aub.study.impatient/src/self.aub.study.impatient.chapter10/aaa.sc")
val lines: Iterator[String] = file.getLines()
for(l <- lines) println(l)


