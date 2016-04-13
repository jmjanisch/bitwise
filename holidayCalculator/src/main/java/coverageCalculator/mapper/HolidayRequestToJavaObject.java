package coverageCalculator.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import coverageCalculator.entity.HolidayRequestInput;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Created by Justin Janisch on 4/13/2016.
 */
public class HolidayRequestToJavaObject {

    ObjectMapper mapper = new ObjectMapper();
    Logger logger = Logger.getLogger(this.getClass());

    public HolidayRequestInput processHolidayInput(String input) throws IOException {
        HolidayRequestInput holidayRequest = new HolidayRequestInput();

        holidayRequest = mapper.readValue(input, HolidayRequestInput.class);

        logger.debug(holidayRequest);

        return holidayRequest;
    }
}
