public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            return getDurationString(minutes, seconds);
        } else return "Invalid input";
    }
    public static String getDurationString(int minutes, int seconds) {
        // calculate how many hours there are
        // use the remainder to figure out how many minutes should be displayed
        // use the remainder from minutes to figure out how many seconds should be displayed
        if (seconds >= 0 && minutes >= 0) {
            int hours = minutes / 60;
            int newMinutes = minutes % 60;
            int newSeconds = seconds % 60;
            return hours + "h " + newMinutes + "m " + newSeconds + "s";
        } else return "Invalid input";
    }
}