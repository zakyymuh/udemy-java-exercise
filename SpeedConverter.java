public class SpeedConverter {
  // write your code here
  public static void main(String[] args) {
    printConversion(2.00);  
    // double result = (double) 2 / (double) 3;
    // System.out.println(result);
  }

  public static long toMilesPerHour(double kilometersPerHour){
      if(kilometersPerHour < 0){
          return -1;
      } else {
          double result = kilometersPerHour / 1.609 ;
          long roundedResult = (long) Math.round(result);
          return roundedResult;
      }
  }
  
  public static void printConversion(double kilometersPerHour){
      long calculateResult = toMilesPerHour(kilometersPerHour);
      if(calculateResult < 0){
          System.out.println("Invalid Value");
      } else {
          System.out.println(kilometersPerHour + " km/h = " + calculateResult + " mi/h");
      }
  }
}