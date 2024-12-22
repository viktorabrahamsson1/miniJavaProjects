package models;

public class Calculator {
  public int initialValue;

  public Calculator(int initialValue) {
    this.initialValue = initialValue;

  }

  public int add(int num) {
    return this.initialValue += num;
  }

  public int sub(int num) {
    return this.initialValue -= num;
  }

  public int division(int num) {
    return this.initialValue /= num;
  }

  public int multiplication(int num) {
    return this.initialValue *= num;
  }

}