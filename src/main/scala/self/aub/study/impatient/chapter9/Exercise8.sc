import scala.io.{BufferedSource, Source}

val l: BufferedSource = Source.fromURL("http://work.dianshang.wanda.cn")
//val lines: Iterator[String] = l.getLines()
//lines.foreach(line=>println(line))

val pattern = """<img[^>]+(src\s*=\s*"[^>^"]+")[^>]*>""".r

//pattern.findAllIn("<img aa=\"123\" src=\"asdf\" />").foreach(str=>println(str))
for(pattern(str)<-pattern.findAllIn(l.mkString))println(str)