package Section6;

public class NumbersOfDayInMonth {
  public static void main(String[] args) {
    System.out.println("2020 is a leap year " + isLeapYear(1600));
  }

  public static boolean isLeapYear(int year) {
    if (year < 1 || year > 9999) {
      return false;
    }
    boolean isDivisible = year % 4 == 0 ? true : false;
    boolean isNotDivisible = year % 100 > 0 ? true : false;
    boolean isDivisbleBy400 = year % 400 == 0 ? true : false;

    if (isDivisible && isNotDivisible) {
      return true;
    } else if (isDivisbleBy400) {
      return true;
    } else {
      return false;
    }
  }

  public static int getDaysInMonth(int month, int year) {
    if (month < 1 || month > 12) {
      return -1;
    }

    if (year < 1 || year > 9999) {
      return -1;
    }

    switch (month) {
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      case 2:
        if (isLeapYear(year)) {
          return 29;
        } else {
          return 28;
        }
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        return 31;
      default:
        return -1;
    }
  }
}
