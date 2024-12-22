package models;

public class Guess {
  public int computorRandom;

  public Guess() {
    this.computorRandom = (int) Math.round(Math.random() * 99 + 1);
  }

  public void showGuess() {
    System.out.println(this.computorRandom);
  }
}
