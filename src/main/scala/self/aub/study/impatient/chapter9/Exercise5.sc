import java.io.PrintWriter
import scala.math._

val writer: PrintWriter = new PrintWriter("/Users/liujinxin/Workspace/study-scala/self.aub.study.impatient/src/main/scala/self.aub.study.impatient.chapter9/doc1")
val num = 2
for (n <- 1 to 20) {
  writer.println(pow(2, n) + "\t\t" + 1 / pow(2, n))
}
writer.close()