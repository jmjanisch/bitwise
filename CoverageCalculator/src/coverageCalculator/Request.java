package coverageCalculator;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
/**
 * Created by Lora on 4/2/16.
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