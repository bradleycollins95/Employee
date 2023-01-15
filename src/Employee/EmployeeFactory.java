package Employee;

import java.util.Random;

public class EmployeeFactory {

    public static Employee getRandomEmployee() {
        Random random = new Random();

        if (random.nextInt(1000) % 2 == 0) {
            return new HourlyEmployee("Josh", "Tailor", "20083489", 18.75);
        } else {
            return new SalariedEmployee("Jane", "Doe", "200912345", 47500);
        }

    }
}

