public class DecimalComparator {
  public static void main(String[] args) {
    System.out.println("Hasilnya adalah " + areEqualByThreeDecimalPlaces(1.234, 1.2336));
  }
  public static boolean areEqualByThreeDecimalPlaces(double firstDecimal, double secondDecimal) {
    int first = (int) (firstDecimal * 1000);
    int second = (int) (secondDecimal * 1000);
    if (first - second == 0) {
      return true;
    } else {
      return false;
    }
  }
}
