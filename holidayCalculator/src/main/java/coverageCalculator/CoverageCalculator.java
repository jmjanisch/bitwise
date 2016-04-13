package coverageCalculator;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import coverageCalculator.entity.HolidayRequestInput;
import coverageCalculator.entity.HolidayResponse;
import coverageCalculator.mapper.HolidayRequestToJavaObject;
import coverageCalculator.mapper.HolidayResponseToJSON;
import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by Justin Janisch on 3/25/2016.
 */
// The Java class will be hosted at the URI path "/coverageCalculator"
@Path("/holiday")
public class CoverageCalculator {
    // The Java method will process HTTP GET requests
    @GET
    @Path("/{input}")// The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public Response getMessage(@PathParam("input") String input) {
        String output = "Hello " + input;

        HolidayResponseToJSON mapper = new HolidayResponseToJSON();
        Logger logger = Logger.getLogger(this.getClass());

        // Setup test HolidayResponse Entity to use as a test and write sample response.
        HolidayResponse testResponse = new HolidayResponse();
        TreeMap<String, Integer> holidaySchedule = new TreeMap<String, Integer>();
        holidaySchedule.put("New Years", 105);
        holidaySchedule.put("Martin Luther King Day", 102);
        holidaySchedule.put("Memorial Day", 107);
        holidaySchedule.put("4th of July", 101);
        holidaySchedule.put("Labor Day", 106);
        holidaySchedule.put("Thanksgiving", 108);
        holidaySchedule.put("Christmas", 103);
        testResponse.setHolidayAssignments(holidaySchedule);
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        try {
            output = mapper.createJSONFromHolidayResponse(testResponse);
            logger.info("Output: " + output);
        } catch (JsonProcessingException error) {
            error.printStackTrace();
        }

        // SETUP and TEST HolidayRequestToJavaObject
        HolidayRequestToJavaObject testJsonImport = new HolidayRequestToJavaObject();
        HolidayRequestInput testJavaObject = new HolidayRequestInput();
        String holidayRequestInput = "{\"holidays\":[\"NewYears\",\"MartinLutherKingDay\",\"4th\"],\"employees\":[{\"empid\":103,\"holidayChoice\":[1,2,3]},{\"empid\":106,\"holidayChoice\":[2,1,3]},{\"empid\":104,\"holidayChoice\":[2,1,3]}]}";

        try {
            testJavaObject = testJsonImport.processHolidayInput(holidayRequestInput);
            logger.info("MY JAVA OBJECT: " + testJavaObject.toString());
        } catch (IOException error) {
            error.printStackTrace();
        }

        return Response.status(200).entity(output).build();
    }


}
