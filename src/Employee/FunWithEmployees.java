package Employee;

public class FunWithEmployees {

    public static void main(String[] args) {
        System.out.println("Fun with Employees");

        Employee employee = EmployeeFactory.getRandomEmployee();

        System.out.printf("Employee: %s\nMonthly pay: $%.2f", employee.getFirstName(), employee.calculateMonthlyPay());

    }

}
