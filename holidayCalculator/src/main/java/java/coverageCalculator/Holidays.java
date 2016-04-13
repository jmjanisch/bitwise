package java.coverageCalculator;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;
/**
 * Created by Justin Janisch on 3/25/2016.
 *
 * dont know if we need this class-Lora
 */
@XmlRootElement
public class Holidays {

    private List<String> holidayRequests;
    private int employeeId;

    public Holidays() {

    }

    public Holidays(int employeeId, List<String> holidayRequests) {
        this.employeeId = employeeId;
        this.holidayRequests = holidayRequests;
    }

    public List<String> getHolidayRequests() {
        return holidayRequests;
    }

    public void setHolidayRequests(List<String> holidayRequests) {
        this.holidayRequests = holidayRequests;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return new StringBuffer(" EmployeeId : ").append(this.employeeId)
                .append(" Holiday Requests : ").append(this.holidayRequests).toString();
    }

}
