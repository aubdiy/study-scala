package self.aub.study.impatient.chapter8

/**
  * Created by liujinxin on 16/7/5.
  */
class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount
    balance
  }
}