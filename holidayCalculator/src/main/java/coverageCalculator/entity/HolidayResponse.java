package coverageCalculator.entity;

import java.util.TreeMap;

/**
 * Created by Justin Janisch on 4/12/2016.
 */
public class HolidayResponse {

    private TreeMap<String, Integer> holidayAssignments;

    public HolidayResponse() {

    }

    public HolidayResponse(TreeMap<String, Integer> holidayAssignments) {
        this.holidayAssignments = holidayAssignments;
    }

    public TreeMap<String, Integer> getHolidayAssignments() {
        return holidayAssignments;
    }

    public void setHolidayAssignments(TreeMap<String, Integer> holidayAssignments) {
        this.holidayAssignments = holidayAssignments;
    }

    @Override
    public String toString() {
        return "HolidayResponse{" +
                "holidayAssignments=" + holidayAssignments +
                '}';
    }
}
