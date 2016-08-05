class Time(val hours: Int, val minutes: Int) {


  def before(orther: Time): Boolean = {
    hours < orther.hours || (hours == orther.hours && minutes < orther.minutes)
  }

  override def toString() {
    hours + ":" + minutes
  }
}