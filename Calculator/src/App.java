import java.util.Scanner;

import models.Calculator;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an intiial value to work with: ");
    int num = scanner.nextInt();

    Calculator calculator = new Calculator();

    boolean runCalc = true;
    while (runCalc) {
      System.out.println("Choose an operation to do: ");
      System.out.println("1: addition");
      System.out.println("2: subtraction");
      System.out.println("3: division");
      System.out.println("4: multiplication");
      System.out.println("5. display current number");
      System.out.println("6. exit");
      String option = scanner.nextLine();

      switch (option) {
        case "1":
          sentance();
          int numToAdd = scanner.nextInt();
          num = calculator.add(num, numToAdd);
          break;

        case "2":
          sentance();
          int numToSub = scanner.nextInt();
          num = calculator.sub(num, numToSub);
          break;

        case "3":
          sentance();
          int numtoDiv = scanner.nextInt();
          num = calculator.division(num, numtoDiv);
          break;

        case "4":
          sentance();
          int numToMultiply = scanner.nextInt();
          num = calculator.multiplication(num, numToMultiply);
          break;

        case "5":
          displayNum(num);
          break;

        case "6":
          runCalc = false;
          scanner.close();

        default:
          System.out.println("Unvalid option!");
          break;
      }
    }
  }

  public static void sentance() {
    System.out.println("Enter a number: ");
  }

  public static void displayNum(int num) {
    System.out.println(num);
  }
}
