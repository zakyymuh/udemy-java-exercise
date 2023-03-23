package Section6;

public class SharedDigit {
  public static void main(String[] args) {
    System.out.println("13 & 33 has " + (hasSharedDigit(12, 21) ? "" : "not") + " shared digit");
  }

  public static boolean hasSharedDigit(int number1, int number2) {
    if(number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99){
      return false;
    }

    int firstDigit = number1 % 10;
    int secondDigit = number1 / 10 % 10;

    while(number2 > 0){
      if(number2 % 10 == firstDigit || number2 % 10 == secondDigit){
        return true;
      }
      number2 /= 10;
    }

    return false;
  }
}
