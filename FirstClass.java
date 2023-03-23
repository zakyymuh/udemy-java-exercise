public class FirstClass {
  public static void main(String[] args) {
    System.out.println("Hello Zaky!");

    boolean isAlien = true;
    if (isAlien) {
      System.out.println("It is an Alien");
      System.out.println("And I am scared to death!");
    }

    int topScore = 81;
    if (topScore <= 100) {
      System.out.println("You are the highest top score!");
    }

    int secondTopScore = 100;
    if (topScore > secondTopScore && secondTopScore <= 100) {
      System.out.println("You are greater than second top score and less than 100");
    }

    if (topScore < 80 || secondTopScore > 101) {
      System.out.println("Either or Both of the operator is True");
    }

  }
}
