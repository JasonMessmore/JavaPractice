public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public boolean isRetired() {
        return getAge() > 65;
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26;
        double calculatedPaycheck = (isRetired) ? 0.8 * paycheck : paycheck;
        return (int) calculatedPaycheck;
    }

    public void retire() {
       terminate("12/12/2025");
       isRetired = true;
    }
}
