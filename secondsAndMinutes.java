public class secondsAndMinutes {
  public static void main(String[] args) {
    System.out.println(getDurationString(3945));
    System.out.println(getDurationString(45, 65));
  }

  public static String getDurationString(int seconds) {
    if (seconds < 0) {
      return "Invalid data for seconds(" + seconds + "), must be positive integer value";
    }

    int m = seconds / 60;
    int s = seconds % 60;
    return getDurationString(s, m);
  }

  public static String getDurationString(int seconds, int minutes) {
    if (seconds < 0 || seconds > 59) {
      return "Invalid data for seconds(" + seconds + "), must be positive integer and less than 59";
    }

    if (minutes < 0) {
      return "Invalid data for minutes(" + minutes + "), must be positive integer value";
    }

    int remainingHours = minutes / 60;
    int remainingMinutes = minutes % 60;
    return remainingHours + "h " + remainingMinutes + "m " + seconds + "s";
  }

}
