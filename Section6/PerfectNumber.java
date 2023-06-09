package Section6;

public class PerfectNumber {
  public static void main(String[] args) {
    System.out.println("6 is " + (isPerfectNumber(6) ? "" : "not ") + "perfect number");
  }

  public static boolean isPerfectNumber(int number) {
    // my own solution
    // if(number < 1) return false;
    
    // int sum = 0;
    // for(int i = 1; i <= number / 2; i++){
    //   if(number % i == 0){
    //     sum += i;
    //   }
    // }
    
    // return sum == number ? true : false;

    //optimalize solution
    int sum = 0;
    for(int i = 1; i < number; i++){
      if(number % i == 0)
        sum += i;
    }

    return sum == number && number > 1;
  }
}
