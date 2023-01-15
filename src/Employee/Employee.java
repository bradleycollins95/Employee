package Employee;

public abstract class Employee {

    public String firstName;
    public String lastName;
    public String employeeID;


    public final String getFirstName() {
        return firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final String getEmployeeID() {
        return employeeID;
    }

    public Employee(String firstName, String lastName, String employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
    }

    public abstract double calculateMonthlyPay();

}
