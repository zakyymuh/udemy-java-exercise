package Section6;

public class Switch {
  public static void main(String[] args) {
    int value = 4;
    switch (value) {
      case 1:
        System.out.println("The value is 1");
        break;
      case 2:
        System.out.println("The value is 2");
        break;
      default:
        System.out.println("System can not recognise the value");
        break;
    }
  }

}