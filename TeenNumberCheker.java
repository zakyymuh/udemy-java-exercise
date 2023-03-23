public class TeenNumberCheker {
  public static void main(String[] args) {

  }

  public static boolean hasTeen(int varA, int varB, int varC) {
    if(isTeen(varA)){
      return true;
    } else if(isTeen(varB)){
      return true;
    } else if(isTeen(varC)){
      return true;
    } else {
      return false;
    }
  }

  public static boolean isTeen(int age) {
    if(age >= 13 && age <= 19){
      return true;
    } else {
      return false;
    }
  }
}
