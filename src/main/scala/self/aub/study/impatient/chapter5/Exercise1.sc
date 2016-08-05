class Counter {
  private var value = Int.MaxValue - 1

  def increment() {
    value += 1
    if (value == Int.MaxValue) {
      value = 0;
    }
  }

  def current() = value
}

val myCounter = new Counter
myCounter.increment()
println(myCounter.current)