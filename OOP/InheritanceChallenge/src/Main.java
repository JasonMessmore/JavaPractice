public class Main {
    public static void main(String[] args) {

        Employee jason = new Employee("Jason", "05/12/2000", "08/15/2020");
        System.out.println(jason);
        System.out.println("Age = " + jason.getAge());
        System.out.println("Pay = " + jason.collectPay());
        int jasonAge = jason.getAge();

        HourlyEmployee sam = new HourlyEmployee("Sam", "12/02/1998", "07/10/2021", 34.73);
        System.out.println(sam);
        System.out.println("Sam's age is: " + sam.getAg e());
        System.out.println("Sam's paycheck = " + sam.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "10/12/1998",
                "03/20/2020", 250000);
        System.out.println(joe);
        System.out.println("Joe's paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's retirement check will be $" + joe.collectPay());



    }
}