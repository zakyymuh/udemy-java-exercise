package Section6;

public class SumDigit {
  public static void main(String[] args) {
    System.out.println("Sum digit of 1000 is " + sumDigits(1234));
    System.out.println("Sum digit of 1000 is " + sumDigits(-1));
    System.out.println("Sum digit of 1000 is " + sumDigits(4));
    System.out.println("Sum digit of 1000 is " + sumDigits(123123));
  }

  public static int sumDigits(int number) {
    if(number < 0){
      return -1;
    }

    int sumCount = 0;
  
    while(number > 9){
      sumCount += number % 10;
      number = number / 10; 
    }

    sumCount += number;
    return sumCount;
  }
}
