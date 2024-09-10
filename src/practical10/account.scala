class BankAccount(val accountNumber: String, private var balance: Double) {

  // Deposit method
  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"Deposited $$amount into account $accountNumber. New balance: $$balance")
    } else {
      println("Deposit amount must be positive.")
    }
  }

  // Withdraw method
  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println(s"Withdrew $$amount from account $accountNumber. New balance: $$balance")
    } else if (amount > balance) {
      println(s"Insufficient balance. Cannot withdraw $$amount from account $accountNumber.")
    } else {
      println("Withdraw amount must be positive.")
    }
  }

  // Transfer method
  def transfer(amount: Double, targetAccount: BankAccount): Unit = {
    if (amount > 0 && amount <= balance) {
      this.withdraw(amount)
      targetAccount.deposit(amount)
      println(s"Transferred $$amount from account $accountNumber to account ${targetAccount.accountNumber}.")
    } else if (amount > balance) {
      println(s"Insufficient balance. Cannot transfer $$amount from account $accountNumber to account ${targetAccount.accountNumber}.")
    } else {
      println("Transfer amount must be positive.")
    }
  }

  // Method to display the current balance
  def getBalance: Double = balance
}

// Usage example
object BankSystem {
  def main(args: Array[String]): Unit = {
    val account1 = new BankAccount("123456", 1000.0)  // Create account1 with a balance of 1000
    val account2 = new BankAccount("654321", 500.0)   // Create account2 with a balance of 500

    // Perform some transactions
    account1.deposit(200.0)            // Deposit into account1
    account1.withdraw(100.0)           // Withdraw from account1
    account1.transfer(300.0, account2) // Transfer from account1 to account2

    // Display final balances
    println(s"Final balance of account1: $$${account1.getBalance}")
    println(s"Final balance of account2: $$${account2.getBalance}")
  }
}
