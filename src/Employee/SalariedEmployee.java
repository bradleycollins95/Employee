package Employee;

public class SalariedEmployee extends Employee {

    private double annualSalary;

    public SalariedEmployee(String firstName, String lastName, String employeeID, double annualSalary) {
        super(firstName, lastName, employeeID);
        this.annualSalary = annualSalary >=0 ? annualSalary : 0;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateMonthlyPay() {
        return this.annualSalary/12;
    }
}