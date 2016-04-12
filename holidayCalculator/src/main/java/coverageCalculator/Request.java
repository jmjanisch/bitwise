package coverageCalculator;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Lora on 4/2/16.
 *
 * This class is the basis for the request that comes in from the user, they send in an arraylist for holidays that
 * coverage is needed for and an arraylist of employees to cover the holidays
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "holidays",
        "employees"
})
public class Request {

    @JsonProperty("holidays")
    private ArrayList<String> holidays = new ArrayList<String>();
    @JsonProperty("employees")
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The holidays
     */
    @JsonProperty("holidays")
    public ArrayList<String> getHolidays() {
        return holidays;
    }

    /**
     *
     * @param holidays
     * The holidays
     */
    @JsonProperty("holidays")
    public void setHolidays(ArrayList<String> holidays) {
        this.holidays = holidays;
    }

    /**
     *
     * @return
     * The employees
     */
    @JsonProperty("employees")
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /**
     *
     * @param employees
     * The employees
     */
    @JsonProperty("employees")
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}