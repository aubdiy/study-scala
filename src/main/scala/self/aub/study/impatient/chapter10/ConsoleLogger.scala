package self.aub.study.impatient.chapter10

/**
  * Created by liujinxin on 16/5/5.
  */
class ConsoleLogger extends Logger with Cloneable with Serializable {
  def log(msg: String) {
    println(msg)
  }
}
