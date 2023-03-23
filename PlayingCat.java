public class PlayingCat {
  public static void main(String[] args) {
    
  }

  public static boolean isCatPlaying(boolean summer, int temperature) {
    int temperatureLimit = summer ? 45 : 35;
    if(temperature >= 35 && temperature <= temperatureLimit){
      return true;
    } else {
      return false;
    }
  }
}
