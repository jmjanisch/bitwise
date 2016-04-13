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

    public HolidayRequestInput processHolidayInput() throws IOException {
        HolidayRequestInput holidayRequest = new HolidayRequestInput();

        String testRequest = "{\"holidays\":[\"NewYears\",\"MartinLutherKingDay\",\"4th\"],\"employees\":[{\"empid\":103,\"holidayChoice\":[1,2,3]},{\"empid\":106,\"holidayChoice\":[2,1,3]},{\"empid\":104,\"holidayChoice\":[2,1,3]}]}";

        System.out.println("Test Request: " + testRequest);

        holidayRequest = mapper.readValue(testRequest, HolidayRequestInput.class);

        logger.debug(holidayRequest);

        return holidayRequest;
    }
}
