import self.aub.study.impatient.chapter8.BankAccount

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  private var num: Int = 3

  def earnMonthlyInterest() = {
    num = 3
    super.deposit(1)
  }

  override def deposit(amount: Double): Double = {
    num -= 1
    if (num > 0) {
      super.deposit(amount)
    } else {
      super.deposit(amount - 1)
    }
  }

  override def withdraw(amount: Double): Double = {
    num -= 1
    if (num > 0) {
      super.withdraw(amount)
    } else {
      super.withdraw(amount - 1)
    }

  }
}