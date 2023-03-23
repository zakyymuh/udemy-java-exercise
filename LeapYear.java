public class LeapYear {

  public static void main(String[] args) {
    // System.out.println("is leap year " + isLeapYear(1924));
    isLeapYear(1924);
  }

  public static boolean isLeapYear(int year) {
    if (year < 1 || year > 9999) {
      return false;
    }

    int varA = year % 4;
    boolean isDivisible = (varA == 0) ? true : false;
    if (!isDivisible) {
      return false;
    }

    int varB = year % 100;
    isDivisible = (varB == 0) ? true : false;
    if (!isDivisible) {
      return true;
    } else {
      int varC = year % 400;
      isDivisible = (varC == 0) ? true : false;
      if (!isDivisible) {
        return false;
      }
    }

    return true;
  }
}
