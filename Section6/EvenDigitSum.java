package Section6;

public class EvenDigitSum {
  public static void main(String[] args) {
    System.out.println("Sum of even digit number from 124690 is " + getEvenDigitSum(124690));
  }

  public static int getEvenDigitSum(int number) {
    if(number < 0) return -1;

    int totalSum = 0;
    int lastDigit;
    while(number > 0){
      lastDigit = number % 10;
      totalSum += (lastDigit % 2 == 0) ? lastDigit : 0;
      number /= 10;
    }
    
    return totalSum;
  }
}
