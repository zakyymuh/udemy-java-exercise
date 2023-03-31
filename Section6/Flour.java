package Section6;

public class Flour {
  public static void main(String[] args) {
    // System.out.println(canPack(0, 5, 6));
    // System.out.println(canPack(2, 10, 20));
    System.out.println(canPack(1, 0, 4));
    System.out.println(canPack(1, 0, 5));
  }

  public static boolean canPack(int bigCount, int smallCount, int goal) {
    if(bigCount < 0 || goal <= 0 || smallCount < 0){
      return false;
    }
    
    int a = 0;
    if(bigCount > 0){
      a = bigCount * 5;
    }

    int restGoal = goal - a;
    int restPack = smallCount - restGoal;

    if(restPack < 0){
      return false;
    }

    //exception
    int b2 = goal % 5;
    int c = smallCount - b2;
    System.out.println(b2);
    System.out.println(c);
    if(b2 > 0 && c < 0){
      return false;
    }


    return true;
  }
}
