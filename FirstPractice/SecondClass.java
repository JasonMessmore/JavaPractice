package FirstPractice;

public class SecondClass {
    public static void main(String[] args) {
        System.out.println("Hello, Jason");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("and I'm scared of aliens!");
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Honda";
        boolean isDomestic = makeOfCar == "Honda" ? false : true;

        if (!isDomestic) {
            System.out.println("This car is not domestic to the United States");
        }

        int age = 22;
        String canTheyDrink = (age >= 21) ? "legally drink" : "not legally drink";
        System.out.println("You can " + canTheyDrink);
    }
}
