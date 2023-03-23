package Section6;

public class Prime {
  public static void main(String[] args) {

    int count = 0;
    for(int i = 10; count < 3 && i < 50; i++){
      if(isPrime(i)){
        System.out.println("Prime number is " + i);
        count++;
      }
    }
  }

  public static boolean isPrime(int number) {
    
    if(number <= 2){
      return (number == 2);
    }

    for(int divisor = 2; divisor <= number / 2; divisor++){
      if(number % divisor == 0){
        return false;
      }
    }

    return true;
  }
}
