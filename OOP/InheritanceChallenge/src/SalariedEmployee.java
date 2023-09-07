public class SalariedEmployee extends Employee {

    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate,
                            double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {

        double paycheck = annualSalary / 26;
        double calculatedPaycheck = (isRetired) ? 0.8 * paycheck : paycheck;
        return (int) calculatedPaycheck;
    }

    public void retire() {
       terminate("12/12/2023");
       isRetired = true;
    }
}
