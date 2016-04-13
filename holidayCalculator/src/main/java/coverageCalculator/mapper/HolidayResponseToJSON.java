package coverageCalculator.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import coverageCalculator.entity.HolidayResponse;
import org.apache.log4j.Logger;

/**
 * Created by Justin Janisch on 4/12/2016.
 */
public class HolidayResponseToJSON {
    ObjectMapper mapper = new ObjectMapper();
    Logger logger = Logger.getLogger(this.getClass());

    public String createJSONFromHolidayResponse(HolidayResponse holidayResponse) throws JsonProcessingException {
        String jsonString = mapper.writeValueAsString(holidayResponse);
        logger.debug(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(holidayResponse));
        return jsonString;
    }
}
