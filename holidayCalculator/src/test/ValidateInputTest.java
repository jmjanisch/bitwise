import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.regex.Pattern;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Lora on 4/12/16.
 */
public class ValidateInputTest {

    final Logger logger = Logger.getLogger(ValidateInputTest.class);

    @Test
    public void testPatternMatch() {
        String requestPattern = "\\{\"holidays\":\\[((\"\\S+\").*)+\\],\"employees\":\\[(\\{\"empid\":[0-9]+,\"holidayChoice\":\\[[0-9]+,[0-9]+,[0-9]+\\]\\}.*)+]\\}";
        String request = "{\"holidays\":[\"NewYears\",\"MartinLutherKingDay\",\"MemorialDay\",\"FourthOfJuly\",\"LaborDay\",\"Thanksgiving\",\"Christmas\"],\"employees\":[{\"empid\":103,\"holidayChoice\":[3,2,6]},{\"empid\":106,\"holidayChoice\":[4,2,7]},{\"empid\":104,\"holidayChoice\":[2,1,6]}]}";

        //check if the request is in the correct form
        logger.info("Request: " + request);
        assertTrue("The patterns do not match", Pattern.matches(requestPattern, request));
    }
}
