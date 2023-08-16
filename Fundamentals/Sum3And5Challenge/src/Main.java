public class Main {
    public static void main(String[] args) {
        int count = 0;
        int total = 0;
        for (int i = 1; count < 5 && i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                System.out.println("The number " + i + " is divisible by 3 & 5.");
                total = total + i;
            }
        }
    System.out.println("The sum of all the numbers that met the condition is " + total);
    }
}