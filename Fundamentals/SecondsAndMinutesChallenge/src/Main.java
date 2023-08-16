public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 145));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds + "), must be a positive integer value";
        }
        return getDurationString(seconds / 60, seconds % 60);
    }
    public static String getDurationString(int minutes, int seconds) {
        // calculate how many hours there are
        // use the remainder to figure out how many minutes should be displayed
        // use the remainder from minutes to figure out how many seconds should be displayed
        if (seconds < 0 || seconds > 60) {
            return "invalid input for seconds";
        }
        if (minutes < 0) {
            return "invalid input for minutes";
        }
        int hours = minutes / 60;

        int newMinutes = minutes % 60;

        return hours + "h " + newMinutes + "m " + seconds + "s";
        }
    }