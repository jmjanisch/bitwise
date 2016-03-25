package coverageCalculator;

import java.util.*;
/**
 * Created by Justin Janisch on 3/25/2016.
 */
public class HolidayRequest {

    private List<String> holidayRequests;
    private int employeeId;

    public HolidayRequest() {

    }

    public HolidayRequest(List<String> holidayRequests, int employeeId) {
        this.holidayRequests = holidayRequests;
        this.employeeId = employeeId;
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
