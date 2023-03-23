package Section6;

public class FirstAndLastSum {
  public static void main(String[] args) {
    System.out.println("Sum of first and last digit from 204 = " + sumFirstAndLastDigit(204));
  }

  public static int sumFirstAndLastDigit(int number) {
    if(number < 0){
      return -1;
    }
    int lastDigit = number % 10;
    
    while(number > 9){
      number /= 10;
    }

    return number + lastDigit;
  }
}
