package Section6;

public class FactorPrinter {
  public static void main(String[] args) {
    printFactors(32);
  }

  public static void printFactors(int number) {
    if(number < 1) System.out.println("Invalid Value");


    //old
    // for(int i = 1; i <= number; i++){
    //   if(number % i == 0){
    //     System.out.println(i);
    //   }
    // }  

    //optimize
    for(int i = 1; i <= number / 2; i++){
      if(number % i == 0){
        System.out.println(i);
      }
    }  

    System.out.println(number);
  }
}
