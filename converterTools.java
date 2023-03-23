public class converterTools {
  public static void main(String[] args) {
    System.out.println("68 inches = " + convertToCentimeters(68) + " cm");
    System.out.println("5 feet 8 inches = " + convertToCentimeters(5, 8) + " cm");
  }

  public static double convertToCentimeters(int inches) {
    return inches * 2.54;
  }

  public static double convertToCentimeters(int feet, int inches) {
    return convertToCentimeters((feet * 12) + inches);
  }
}
