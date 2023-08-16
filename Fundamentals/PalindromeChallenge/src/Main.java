public class NumberPalindrome {
public static void main(int)
    isPalindrome(94349);

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit = 0;
        if (number != 0) {
            while (number != 0) {
                lastDigit = number % 10;
                reverse = reverse * 10 + lastDigit;
                number /= 10;
            }
        }
        boolean b = number == reverse;
        if (b) {
            System.out.println("the number is a palindrome");
        }
    return b; }
}

// First and Last Digit Sum Challenge below
// public class FirstLastDigitSum {
//    public static int sumFirstAndLastDigit(int number) {
//        if (number < 0) {
//            return -1;
//        }
//        int firstDigit = 0;
//        int lastDigit = number % 10;
//        while ((number / 1) >= 10) {
//            number /= 10;
//        }
//        firstDigit = number;
//        return (firstDigit + lastDigit);
//    }
//}