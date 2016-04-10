package coverageCalculator;

import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by Justin Janisch on 3/26/2016.
 *
 * Take the request sent in by user and test if it is of the correct form, if not return error to user, it true continue
 */
public class ValidateInput {

    public boolean parseJson(String sentRequest) {

        String pattern = "\\{\\\"holidays\\\":\\[(\\\"\\S+\\s\\S+\\\")+,.+\\],\\\"employees\\\":\\[(\\{\\\"empid\\\":[0-9]+,\\\"holidayChoice\\\":\\[[0-9]+,[0-9]+,[0-9]+\\]\\})+.+";

        if (Pattern.matches(sentRequest, pattern)) {
            return true;
        } else {
            return false;
        }
    }
}
