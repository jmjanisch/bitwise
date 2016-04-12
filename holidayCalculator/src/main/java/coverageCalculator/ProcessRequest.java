package coverageCalculator;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by Lora on 4/2/16.
 *
 *  This class assigns employee to holiday
 */
public class ProcessRequest {

    public HashMap<String,Integer> assignHolidays(Request sentRequest) {

        ArrayList<Employee> employees = sentRequest.getEmployees();
        ArrayList<String> emptyHolidays = sentRequest.getHolidays();
        ArrayList allHolidays = sentRequest.getHolidays();
        HashMap<String, Integer> assignedHolidays = new HashMap<String, Integer>();

        //loop through the holidays and look at first choices for working, if they match an employee assign
        for (String holiday : emptyHolidays) {

            //loop through employees to see if they have the holiday as their first choice
            for (Employee employee : employees) {
                //get employees first choice
                int firstChoiceNumber = employee.getFristHolidayChoice();
                //change number choice to written out holiday
                String firstChoice = (String)allHolidays.get(firstChoiceNumber);

                //check to see if the holiday equals the first choice of employee
                if (holiday.equals(firstChoice)) {
                    //if so add the holiday and employee to the filled holiday list
                    assignedHolidays.put(holiday, employee.getEmpid());
                    //remove the holiday from the holiday list
                    emptyHolidays.remove(holiday);
                    //remove the employee from the list of employees to add to holidays
                    employees.remove(employee);
                }
            }

            //if there are more holidays than employees repopulate the employee list
            if(emptyHolidays.size() != 0 && employees.size() == 0) {
                employees = sentRequest.getEmployees();
            }
        }

        //loop through the second choices of employees to fill holidays not assigned
        for (String holiday : emptyHolidays) {

            //loop through employees to see if they have the holiday as their second choice
            for (Employee employee : employees) {
                //get employees second choice
                int secondChoiceNumber = employee.getFristHolidayChoice();
                //change number choice to written out holiday
                String secondChoice = (String)allHolidays.get(secondChoiceNumber);

                //check to see if the holiday equals the second choice of employee
                if (holiday.equals(secondChoice)) {
                    //if so add the holiday and employee to the filled holiday list
                    assignedHolidays.put(holiday, employee.getEmpid());
                    //remove the holiday from the holiday list
                    emptyHolidays.remove(holiday);
                    //remove the employee from the list of employees to add to holidays
                    employees.remove(employee);
                }
            }

            //if there are more holidays than employees repopulate the employee list
            if(emptyHolidays.size() != 0 && employees.size() == 0) {
                employees = sentRequest.getEmployees();
            }
        }

        //loop through the last choices and dont assign employees remaining to last choice
        for (String holiday : emptyHolidays) {

            //loop through employees to see if they have the holiday as their first choice
            for (Employee employee : employees) {
                //get employees last choice
                int lastChoiceNumber = employee.getFristHolidayChoice();
                //change number choice to written out holiday
                String lastChoice = (String)allHolidays.get(lastChoiceNumber);

                //check to see if the holiday does not equals the last choice of employee
                if (!holiday.equals(lastChoice)) {
                    //if so add the holiday and employee to the filled holiday list
                    assignedHolidays.put(holiday, employee.getEmpid());
                    //remove the holiday from the holiday list
                    emptyHolidays.remove(holiday);
                    //remove the employee from the list of employees to add to holidays
                    employees.remove(employee);
                }
            }

            //if there are more holidays than employees repopulate the employee list
            if(emptyHolidays.size() != 0 && employees.size() == 0) {
                employees = sentRequest.getEmployees();
            }
        }

        return assignedHolidays;
    }
}
