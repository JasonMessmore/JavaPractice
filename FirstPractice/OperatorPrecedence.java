package FirstPractice;

public class OperatorPrecedence {
    public static void main(String[] args) {
        double myVariable = 20;
        double mySecondVariable = 80;
        double remainder = ((100 * (myVariable + mySecondVariable)) % 40);
        boolean result = (remainder == 0.00) ? true : false;
        System.out.println(result);
        if (!result) {
            System.out.println("got some remainder");
        }
    }
}