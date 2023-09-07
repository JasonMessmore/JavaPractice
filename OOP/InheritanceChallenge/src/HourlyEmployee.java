public class HourlyEmployee extends Employee {

    private double hourlyPayRate;
    public HourlyEmployee(String name, String birthDate, String hireDate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay(){
        return (hourlyPayRate * 2);
    }
}
