package java.coverageCalculator;

/**
 * Created by Lora on 4/10/16.
 */
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "holiday"
})
public class AssignedHoliday {

    @JsonProperty("holiday")
    private String holiday;
    @JsonProperty("assignedEmployee")
    private Integer assignedEmployee;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The holiday
     */
    @JsonProperty("holiday")
    public String getHoliday() {
        return holiday;
    }

    /**
     *
     * @param holiday
     * The holiday
     */
    @JsonProperty("holiday")
    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }

    /**
     *
     * @return
     * The holiday
     */
    @JsonProperty("assignedEmployee")
    public Integer getAssignedEmployee() {
        return assignedEmployee;
    }

    /**
     *
     * @param holiday
     * The holiday
     */
    @JsonProperty("assignedEmployee")
    public void setAssignedEmployee(Integer assignedEmployee) {
        this.assignedEmployee = assignedEmployee;
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