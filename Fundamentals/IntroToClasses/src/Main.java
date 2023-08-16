public class Main {
    public static void main(String[] args) {

        Car civic = new Car();

        civic.setConvertible(false);
        civic.setDoors(4);
        civic.setMake("Honda");
        civic.setModel("Civic");
        civic.setColor("Yellow");

        Car car = new Car();

        car.setMake("Porsche");
        car.setModel("911");
        car.setColor("Orange");
        car.setDoors(2);
        car.setConvertible(true);

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
        civic.describeCar();
    }
}