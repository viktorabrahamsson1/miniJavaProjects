import java.util.Scanner;

import models.Calculator;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an intiial value to work with: ");
    int num = scanner.nextInt();

    Calculator calculator = new Calculator(num);

    boolean runCalc = true;
    while (runCalc) {
      System.out.println("Choose an operation to do: ");
      System.out.println("1: addition");
      System.out.println("2: subtraction");
      System.out.println("3: division");
      System.out.println("4: multiplication");
      System.out.println("5. exit");
      String option = scanner.nextLine();

      switch (option) {
        case "1":
          sentance();
          int numToAdd = scanner.nextInt();
          num = calculator.add(numToAdd);
          break;

        case "2":
          sentance();
          int numToSub = scanner.nextInt();
          scanner.nextInt();
          num = calculator.sub(numToSub);
          break;

        case "3":
          sentance();
          int numtoDiv = scanner.nextInt();
          num = calculator.division(numtoDiv);
          break;

        case "4":
          sentance();
          int numToMultiply = scanner.nextInt();
          num = calculator.multiplication(numToMultiply);
          break;

        case "5":
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
}
