public class Main {
    public static void main(String[] args) {

        Employee jason = new Employee("Jason", "05/12/2000", "08/15/2020");
        System.out.println(jason);
        System.out.println("Age = " + jason.getAge());
        System.out.println("Pay = " + jason.collectPay());
        int jasonAge = jason.getAge();

        SalariedEmployee joe = new SalariedEmployee("Joe", "10/12/1998",
                "03/20/2020", 250000);
        System.out.println(joe);
        System.out.println("Joe's paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's retirement check will be $" + joe.collectPay());

    }
}