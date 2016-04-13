package java.coverageCalculator;

import org.apache.log4j.Logger;

import java.util.regex.Pattern;

/**
 * Created by Justin Janisch on 3/26/2016.
 *
 * Take the request sent in by user and test if it is of the correct form, if not return error to user, it true continue
 */
public class ValidateInput {

    static final Logger logger = Logger.getLogger(CoverageCalculator.class);

    public boolean parseJson(String sentRequest) {

        logger.info("In validate method");

        String requestPattern = "\\{\"holidays\":\\[((\"\\S+\").*)+\\],\"employees\":\\[(\\{\"empid\":[0-9]+,\"holidayChoice\":\\[[0-9]+,[0-9]+,[0-9]+\\]\\}.*)+]\\}";

        //check if the request is in the correct form
        if (Pattern.matches(sentRequest, requestPattern)) {
            logger.info("in patter if");
            return true;
        } else {
            return false;
        }
    }
}
