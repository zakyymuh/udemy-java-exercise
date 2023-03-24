package Section6;

public class GreatestCommonDivisor {
  public static void main(String[] args) {
    System.out.println(getGreatestCommonDivisor(15, 25));
  }

  public static int getGreatestCommonDivisor(int first, int second) {
    if(first < 10 || second < 10) return -1;

    int biggest = (first > second) ? first : second;
    int common = 1;
    for(int i = 1; i <= biggest; i++){
      if(first % i == 0 && second % i == 0){
        common = i;
      }
    }

    return common;
  }
}
