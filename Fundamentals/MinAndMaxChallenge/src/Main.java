import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter a #, or enter any character to exit:");
            String nextEntry = scanner.nextLine();
            try {
                double num = Double.parseDouble(nextEntry);
                if (loopCount == 0 || num < min) {
                    min = num;
                }
                if (loopCount == 0 || num > max) {
                    max = num;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }

        }

        if (loopCount > 0) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("No valid data entered");
        }


    }
}