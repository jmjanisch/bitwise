package coverageCalculator;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Lora on 4/9/16.
 *
 * This class is used to try the json parsing and making sure the employee class and request class are working properly
 * has fake data to test
 */
public class TestProcess {

    public static void main(String[] args) {
        TestProcess obj = new TestProcess();
        obj.run();
    }

    private void run() {
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = "{\"holidays\":[\"NewYears\",\"MartinLutherKingDay\",\"MemorialDay\",\"FourthOfJuly\",\"LaborDay\",\"Thanksgiving\",\"Christmas\"],\"employees\":[{\"empid\":103,\"holidayChoice\":[3,2,6]},{\"empid\":106,\"holidayChoice\":[4,2,7]},{\"empid\":104,\"holidayChoice\":[2,1,6]}]}";

        try {

            // Convert JSON string to Object
            Request request = mapper.readValue(jsonInString, Request.class);
            System.out.println(request);

            //get the array of employee objects location on stack
            System.out.println(request.getHolidays());
            ArrayList<Employee> employees = request.getEmployees();
            System.out.println(employees);

            for(Employee employee : employees){
                System.out.println(employee.getEmpid());
                System.out.println(employee.getHolidayChoice());
                System.out.println("First Choicd: " + employee.getFristHolidayChoice());
                System.out.println("Second Choice: " + employee.getSecoundHolidayChoice());
                System.out.println("Last Choice: " + employee.getLastHolidayChoide());
                System.out.println("-----------");
            }

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
