public class Main {
    public static void main(String[] args) {
        int primeCount = 0;
        for (int i = 100; i <= 1000; i++) {
            if (primeCount >= 3) {
                break;
            }
            if (isPrime(i)) {
                System.out.println("The number " + i + " is prime.");
                primeCount++;
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor < wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}