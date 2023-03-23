public class minutesToYears {
  public static void main(String[] args) {
    printYearsAndDays(1440);  
  }

  public static void printYearsAndDays(long minutes){
    if(minutes < 0){
        System.out.print("Invalid Value");
        return;
    }
    
    long hours = (long) (minutes / 60L);
    long days = (long) (hours / 24L);
    long years = (long) (days / 365L);
    long remainingDays = days % 365;
    System.out.print(minutes + " min = " + years + " y and " + remainingDays + " d");
}
}
