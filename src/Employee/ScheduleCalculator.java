package Employee;

import java.util.Random;

/**
 * Test class to generate random hours for hourly employee
 *
 * @author josh.taylor
 */
public class ScheduleCalculator {

    public static double getHoursWorked(String employeeID){
        Random random = new Random();
        return random.nextInt(150) + 5;
    }

}
