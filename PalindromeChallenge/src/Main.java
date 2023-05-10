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