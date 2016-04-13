package java.coverageCalculator;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Lora on 3/29/16.
 *
 * Create the response to send back to user
 */
public class CreateResponse {

    public String run(HashMap<String, Integer> assignedHolidays) {
        ObjectMapper mapper = new ObjectMapper();

        Response response = new Response();
        String jsonInString = "{response:[";
        Set set = assignedHolidays.entrySet();
        Iterator iterator = set.iterator();

           // Convert object to JSON string
            //jsonInString = mapper.writeValueAsString(assignedHolidays);
            //System.out.println(jsonInString);

            //take each set and write to string
            while(iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                jsonInString += "{" + entry.getKey() + ":" + entry.getValue() + "},";
            }

            // Convert object to JSON string and pretty print
            //jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);
            //System.out.println(jsonInString);

            jsonInString += "]}";

        return jsonInString;
    }
}