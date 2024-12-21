package models;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bank {
  private Map<Integer, Account> accounts = new HashMap<Integer, Account>();
  private int accountNumber = 0;
  private String action;

  public Bank() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("***********");
      System.out.println("Choose an action:");
      System.out.println("1: Create account");
      System.out.println("2. Get balance");
      System.out.println("3. List accounts");
      System.out.println("4. Deposit");
      System.out.println("5. Withdraw");
      System.out.println("6. close");
      System.out.println("************");

      action = scanner.nextLine();

      switch (action) {
        case "1":
          System.out.println("Enter your name: ");
          String name = scanner.nextLine();
          System.out.println("Enter your inital balance: ");
          double initialBalance = scanner.nextDouble();
          createAccount(name, initialBalance);
          break;

        case "2":
          System.out.println("Enter a account number: ");
          int searchedAccountNumber = scanner.nextInt();
          if (accounts.containsKey(searchedAccountNumber)) {
            getBalance(searchedAccountNumber);
          } else {
            System.out.println("Enter a valid account number");
          }
          break;

        case "3":
          listAccounts();
          break;
        case "4":
          System.out.println("Enter the account number to deposit to: ");
          int accountNumber = scanner.nextInt();
          System.out.println("Enter the amount of the deposit: ");
          double amount = scanner.nextDouble();

          if (accounts.containsKey(accountNumber) && amount > 0) {
            Account account = accounts.get(accountNumber);
            account.deposit(amount);
          } else {
            System.out.println("undoable deposit, check account number or balance.");
          }
          break;

        // todo funkar ej som den ska!
        case "5":
          System.out.println("Enter the account number to withdraw from: ");
          int accountNumberWithdrawl = scanner.nextInt();
          System.out.println("Enter the amount of the withdrawl: ");
          double amountWithdrawl = scanner.nextDouble();

          if (accounts.containsKey(accountNumberWithdrawl)
              && amountWithdrawl < accounts.get(accountNumberWithdrawl).balance && amountWithdrawl > 0) {
            Account account = accounts.get(accountNumberWithdrawl);
            account.withdraw(amountWithdrawl);
          } else {
            System.out.println("undoable deposit, check account number or balance.");
          }
          break;
        case "6":
          scanner.close();
          break;
        default:
          System.out.println("Please enter a valid option.");
          break;
      }
    }

  }

  public void createAccount(String name, double initialBalance) {
    Account newAccount = new Account(name, this.accountNumber, initialBalance);
    accounts.put(this.accountNumber, newAccount);
    this.accountNumber++;
  }

  public void getBalance(int accountNumber) {
    double balance = accounts.get(accountNumber).balance;
    System.out.println("Balance of account number " + accountNumber + ": " + balance);

  }

  private void listAccounts() {
    for (int i = 0; i < accounts.size(); i++) {
      Account currAcc = accounts.get(i);
      System.out.println(currAcc.toString());
    }
  }

}
