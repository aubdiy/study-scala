
/**
  * Created by liujinxin on 16/6/7.
  */
object PrintInIverted extends App {
  for (s <- args) {
    print(s)
    print(" ")
  }

  println("")
  args.reverse.foreach(arg => print(arg + " "))
}
