/**
 * JavaMethod48
 */
public class JavaMethod48 {

  public static void main(String[] args) {
    displayHighScorePosition("Zaky", calculateHighScorePosition(1700));
    displayHighScorePosition("Ali", calculateHighScorePosition(999));
    displayHighScorePosition("Arief", calculateHighScorePosition(567));
    displayHighScorePosition("Ahmad", calculateHighScorePosition(322));
  }

  public static void displayHighScorePosition(String playerName, int position) {
    System.out.println(playerName + " has managed to get into position " + position + " on the high score list");
  }

  public static int calculateHighScorePosition(int score) {
    if(score >= 1000){
      return 1;
    } else if(score < 1000 && score >= 500){
      return 2;
    } else if(score < 500 && score >= 100){
      return 3;
    } else {
      return 4;
    }
  }
}