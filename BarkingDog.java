public class BarkingDog {
  public static void main(String[] args) {
    
  }

  public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
    if(hourOfDay > 23 || hourOfDay < 0){
      return false;
    } else if(isBarking && hourOfDay < 8){
      return true;
    } else if(isBarking && hourOfDay > 22 ){
      return true;
    } else {
      return false;
    }
  }
}
