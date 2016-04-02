package coverageCalculator;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Lora on 4/2/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "response"
})
public class ResponseEntity {

    @JsonProperty("response")
    private List<ResponseEntity> response = new ArrayList<ResponseEntity>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The response
     */
    @JsonProperty("response")
    public List<ResponseEntity> getResponse() {
        return response;
    }

    /**
     *
     * @param response
     * The response
     */
    @JsonProperty("response")
    public void setResponse(List<ResponseEntity> response) {
        this.response = response;
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