package coverageCalculator;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Lora on 4/2/16.
 *
 * This class is used to try the json parsing and making sure the employee class and request class are working properly
 */
public class ProcessRequest {

    public static void main(String[] args) {
        ProcessRequest obj = new ProcessRequest();
        obj.run();
    }

    private void run() {
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = "{\"holidays\" : [\"New Years\",\"Martin Luther King Day\",\"Memorial Day\",\"Fourth of July\",\"Labor Day\",\"Thanksgiving\",\"Christmas\"],\"employees\" : [{\"empid\" : 103, \"holidayChoice\" : [3,2,6]},{\"empid\" : 106, \"holidayChoice\" : [4,2,7]},{\"empid\" : 104, \"holidayChoice\" : [2,1,6]}]}";

        try {

            // Convert JSON string to Object
            Request request = mapper.readValue(jsonInString, Request.class);
            System.out.println(request);

            //Pretty print
            //String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);
            //System.out.println(prettyStaff1);

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
