package Section6;

public class SumEven {
  public static void main(String[] args) {
    int number = 4;
    int range = 20;
    int evenCount = 0;
    int oddCount = 0;
    while (number <= range) {
      number++;
      if (!isEven(number)) {
        oddCount++;
        continue;
      }
      System.out.println("Even Number " + number);
      evenCount++;
      if(evenCount >= 5){
        break;
      }
    }

    System.out.println("Even Number found " + evenCount);
    System.out.println("Odd Number found " + oddCount);

  }

  public static boolean isEven(int number) {
    if (number % 2 != 0) {
      return false;
    }
    return true;
  }
}
