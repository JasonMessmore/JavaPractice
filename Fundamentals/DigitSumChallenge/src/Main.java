public class Main {
    public static void main(String[] args) {
        int number = -134;
        System.out.println("The sum of the digits of " + number + " = " + sumDigits(number));
    }
    public static int sumDigits(int number) {
        int result = 0;
        if (number < 0) {
            return -1;
        }
        while (number != 0) {
            result = result + (number % 10);
            number = (number/10);
        }
        return result;
    }
}

// n % 10 extract least sig digit
// use n = n/10 to drop the last digit as you are looping