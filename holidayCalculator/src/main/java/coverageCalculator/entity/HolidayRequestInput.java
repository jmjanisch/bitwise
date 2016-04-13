package coverageCalculator.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class HolidayRequestInput {

    private List<String> holidays = new ArrayList<String>();
    private List<Employee> employees = new ArrayList<Employee>();

    /**
     *
     * @return
     * The holidays
     */
    public List<String> getHolidays() {
        return holidays;
    }

    /**
     *
     * @param holidays
     * The holidays
     */
    public void setHolidays(List<String> holidays) {
        this.holidays = holidays;
    }

    /**
     *
     * @return
     * The employees
     */
    public List<Employee> getEmployees() {
        return employees;
    }

    /**
     *
     * @param employees
     * The employees
     */
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "HolidayRequestInput{" +
                "holidays=" + holidays +
                ", employees=" + employees +
                '}';
    }
}
