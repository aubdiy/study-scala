import scala.io.{BufferedSource, Source}

/**
  * Created by liujinxin on 16/5/5.
  */
val file: BufferedSource = Source.fromFile("myfile.txt")
val lines: Iterator[String] = file.getLines()
for(l <- lines) println(l)


