import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getInputFromScanner(2023);
    }

    public static String getInputFromConsole(int currentYear) {
            String name = System.console().readLine("Hi, What's your name? ");
            System.out.println("Hi " + name + ", nice to meet you!");
            return "";
    }
    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
//        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println(("Hi, What's your name? "));
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", nice to meet you!");
        System.out.println("What year were you born?");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + (currentYear));
            age = checkData(currentYear, scanner.nextLine());
            validDOB = age < 0 ? false : true;
        } while (!validDOB);

        System.out.println("So you are " + age + " years old");
        return "bah";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }
        return (currentYear - dob);
    }
}