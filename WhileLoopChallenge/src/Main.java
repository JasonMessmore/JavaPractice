public class Main {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int oddNumbers = 0;
        int evenNumbers = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                oddNumbers++;
                continue;
            }
            evenNumbers++;
            System.out.println("Even number " + number);
            if (evenNumbers == 5) {
                System.out.println("Total number of odds = " + oddNumbers + ", and total number of evens = " + evenNumbers);
                break;
            }
            }
        }
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}