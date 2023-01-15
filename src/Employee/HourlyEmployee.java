package Employee;

/**
 * Hourly paid employee. Uses a mock schedule to generate pay
 *
 * @author josh.taylor
 */
public class HourlyEmployee extends Employee {

    private double hourlyPayRate;

    /**
     * Simple constructor that set's immutable first name, last name and employeeID and hourlyPayRate
     * @param firstName
     * @param lastName
     * @param employeeID
     * @param hourlyPayRate
     */
    public HourlyEmployee(String firstName, String lastName, String employeeID, double hourlyPayRate) {
        super(firstName, lastName, employeeID);
        this.hourlyPayRate = hourlyPayRate;

    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double calculateMonthlyPay() {
        //This is just an example of how this would look
        return this.hourlyPayRate * ScheduleCalculator.getHoursWorked(this.getEmployeeID());
    }
}