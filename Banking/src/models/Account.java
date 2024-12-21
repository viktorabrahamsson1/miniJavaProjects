package models;

public class Account {
  String name;
  int accountNumber;
  double balance;

  public Account(String name, int accountNumber, double balance) {
    this.name = name;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      this.balance += amount;
    } else {
      throw new IllegalArgumentException("The amount needs to be above 0.");
    }
  }

  public void withdraw(double amount) {
    if (this.balance >= amount && amount > 0) {
      this.balance -= amount;
    } else {
      throw new IllegalArgumentException("You can not make this withdrawl.");
    }
  }

  public void getBalance() {
    System.out.println("Balance: " + this.balance);
  }

  @Override
  public String toString() {
    return "name: " + this.name + ", " + "accountNumber: " + this.accountNumber + ", " + "balance: " + this.balance;
  }
}
