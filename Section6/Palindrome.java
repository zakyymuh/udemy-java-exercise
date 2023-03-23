package Section6;

public class Palindrome {
  public static void main(String[] args) {
    isPalindrome(198);
  }

  public static boolean isPalindrome(int number) {
    if(number < 0){
      number *= -1;
    }

    int original = number;
    int reverse = 0;
    int lastDigit = 0;

    while(number > 0){
      lastDigit = number % 10;
      reverse = (reverse * 10) + lastDigit;
      number = number / 10;
    }

    if(reverse == original){
      return true;
    }
    return false;
  }
}
