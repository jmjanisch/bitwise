package coverageCalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
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
        "empid",
        "holidayChoice"
})
public class Employee {

    @JsonProperty("empid")
    private Integer empid;
    @JsonProperty("holidayChoice")
    private List<Integer> holidayChoice = new ArrayList<Integer>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The empid
     */
    @JsonProperty("empid")
    public Integer getEmpid() {
        return empid;
    }

    /**
     *
     * @param empid
     * The empid
     */
    @JsonProperty("empid")
    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    /**
     *
     * @return
     * The holidayChoice
     */
    @JsonProperty("holidayChoice")
    public List<Integer> getHolidayChoice() {
        return holidayChoice;
    }

    /**
     *
     * @param holidayChoice
     * The holidayChoice
     */
    @JsonProperty("holidayChoice")
    public void setHolidayChoice(List<Integer> holidayChoice) {
        this.holidayChoice = holidayChoice;
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
