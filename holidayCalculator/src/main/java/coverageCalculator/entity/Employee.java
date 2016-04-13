package coverageCalculator.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

/**
 * Created by Justin Janisch on 4/13/2016.
 */




@Generated("org.jsonschema2pojo")
public class Employee {

    private Integer empid;
    private List<Integer> holidayChoice = new ArrayList<Integer>();

    /**
     *
     * @return
     * The empid
     */
    public Integer getEmpid() {
        return empid;
    }

    /**
     *
     * @param empid
     * The empid
     */
    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    /**
     *
     * @return
     * The holidayChoice
     */
    public List<Integer> getHolidayChoice() {
        return holidayChoice;
    }

    /**
     *
     * @param holidayChoice
     * The holidayChoice
     */
    public void setHolidayChoice(List<Integer> holidayChoice) {
        this.holidayChoice = holidayChoice;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", holidayChoice=" + holidayChoice +
                '}';
    }
}
