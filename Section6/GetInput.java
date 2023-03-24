package Section6;

import java.util.Scanner;

public class GetInput {
  public static void main(String[] args) {
    int currentYear = 2023;
    // try{
    //   System.out.println(getInputFromConsole(currentYear));
    // } catch (NullPointerException e){
      System.out.println(getInputFromScanner(currentYear));
    // }
  }

  public static String getInputFromConsole(int currentYear) {
    String name = System.console().readLine("Hi, What's your name?");
    System.out.println("Hi " + name + " Thank you for taking up a course!");

    String dateOfBirth = System.console().readLine("What year you were born?");
    int age = currentYear - Integer.parseInt(dateOfBirth);

    return "So you are " + age + " years old";
  }

  public static String getInputFromScanner(int currentYear) {
    System.out.println("Hi, What's your name?");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    
    System.out.println("What year you were born?");
    String dateOfBirth = scanner.nextLine();
    int age = currentYear - Integer.parseInt(dateOfBirth);

    return "So you are " + age + " years old";
  }
}
