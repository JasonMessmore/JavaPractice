public class Main {
    public static void main(String[] args) {
        double finalAnswer = convertToCentimeters(5, 8);
        System.out.println("5ft, 8in =  " + finalAnswer + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }
    public static double convertToCentimeters(int heightInInches) {
        return (heightInInches * 2.54);
    }
    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        return convertToCentimeters((heightInFeet *12) + heightInInches);
    }
    /* 1 inch = 2.54 cm */
}