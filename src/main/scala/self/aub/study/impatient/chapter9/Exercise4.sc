import scala.io.{BufferedSource, Source}

val file: BufferedSource = Source.fromFile("/Users/liujinxin/Workspace/study-scala/self.aub.study.impatient/src/main/scala/self.aub.study.impatient.chapter9/doc")


val result: Array[Int] = file.mkString.split("\\s+").filter(word => try {
  word.toDouble; true
} catch {
  case ex: Exception => {
    false
  }
}).map(num => num.toInt)


println(result.sum)
println(result.min)
println(result.max)
println(result.sum/result.length)
