public class Main {
    public static void main(String[] args) {
        printDayOfWeek(4);
        printDayOfWeek(7);
        printDayOfWeek(1);
        printWeekDay(0);
        printWeekDay(5);
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println("The day of the week is " + dayOfWeek);
    }

    public static void printWeekDay(int day) {
        if (day == 0) {
            System.out.println("Sunday");
        }
        else if (day == 1) {
            System.out.println("Monday");
        }
        else {
            System.out.println("invalid day");
        }
    }
}