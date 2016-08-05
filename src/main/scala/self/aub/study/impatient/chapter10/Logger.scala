package self.aub.study.impatient.chapter10

/**
  * Created by liujinxin on 16/5/5.
  */
trait Logger {
  def log(msg: String)

  def info(msg: String) {
    log("INFO: " + msg)
  }

  def warn(msg: String) {
    log("WARN: " + msg)
  }

  def severe(msg: String) {
    log("SEVERE: " + msg)
  }
}
