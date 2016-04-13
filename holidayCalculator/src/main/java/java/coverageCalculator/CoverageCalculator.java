package java.coverageCalculator;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.coverageCalculator.entity.HolidayResponse;
import java.coverageCalculator.mapper.HolidayResponseToJSON;
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
// The Java class will be hosted at the URI path "/java.coverageCalculator"
@Path("/holiday")
public class CoverageCalculator {
    // The Java method will process HTTP GET requests
    @GET
    @Path("/{name}")// The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public Response getMessage(@PathParam("name") String name) {
        String output = "Hello " + name;
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
        
        return Response.status(200).entity(output).build();
    }


    /*
        url: http://tomcat-lorab.rhcloud.com/holidayCalculator/holiday/Json/{lora}
        send in the request
        cant have any spaces in json

        This takes in the request from the user and checks the structure of the request and if correct sends back
        employees assigned to the holidays
     */

    @GET
    @Path("Json/{sentRequest}")
    @Produces("application/json")
    @Consumes(MediaType.APPLICATION_JSON)
    public String getRequestOffSchedule(@PathParam("sentRequest") String holidayRequest) {

        final Logger logger = Logger.getLogger(CoverageCalculator.class);
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = "The request was not in the correct format please check and send again";
        HashMap<String,Integer> assignedHolidays = new HashMap<String,Integer>();

        logger.info("sent request from user: " + holidayRequest);

        try {

            //run validation did they send in the proper structure
            ValidateInput validate = new ValidateInput();
            //if (validate.parseJson(holidayRequest)) {

                jsonInString = "in validate if";
                // Convert JSON string to Object
                Request request = mapper.readValue(jsonInString, Request.class);
                logger.info("transfomred request: " + request);

                //run logic for holiday choice proper json was received
                ProcessRequest process = new ProcessRequest();
                assignedHolidays = process.assignHolidays(request);

                //create the response for the screen
                CreateResponse response = new CreateResponse();
                jsonInString = response.run(assignedHolidays);
                logger.info("response: " + jsonInString);

            /*} else {
                //the request sent by user was not of proper form return error
                logger.info("User sent the wrong formatted request");
                jsonInString = "The request was not in the correct format please check and send again";

            }*/

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonInString;
    }
}
