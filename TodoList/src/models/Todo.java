package models;

import java.util.Scanner;

public class Todo {

  Scanner scanner = new Scanner(System.in);

  public void addTodo() {
    System.out.println("Enter a task to add: ");
    String task = scanner.nextLine();
    // todo, Save task to a file with a index 1. 2. and so on..

  }

  public void deleteTodo(int todoIndex) {
    // todo: from the index delete that todo.
  }

  public void changeTodo(int todoIndex) {
    // todo: from index change a todo in list.
  }
}
