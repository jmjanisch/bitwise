package coverageCalculator;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import coverageCalculator.entity.HolidayResponse;
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

 Dont need


    @GET
    @Path("/coverageCalculatorJson/{holidayRequests}")
    @Produces("application/json")
    public String getRequestOffJson(@PathParam("holidayRequests") String name) {
        return "{[name:" + name + "]}";
    }

    @GET
    @Path("/getHolidayRequest/{employeeId}")
    @Produces("application/json")
    public HolidayRequest showRequest( @PathParam("employeeId") int employeeId) {
        List<String> holidays = new ArrayList<String>();
        holidays.add("New Years");
        holidays.add("Thanksgiving");
        holidays.add("Christmas");

        HolidayRequest holidayRequest = new HolidayRequest(employeeId, holidays);

        return holidayRequest;

    }



     Dont need
    @POST
    @Path("/processHolidayRequest")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("text/html")
    public Response processHolidayRequest(HolidayRequest holidayRequest) {
        ValidateInput validator = new ValidateInput();
        int statusCode = 200;
        String response = "POST Response: " + holidayRequest.toString();

        validator.parseJson(holidayRequest);

       /*for (HolidayRequest holidayRequest : holidayRequests) {
            System.out.println(holidayRequest.toString());
            response += "Number of requests +1 "; //holidayRequest.toString();
       }*/


        //return Response.status(statusCode).entity(response).build();
    //}


    /*
        url: http://tomcat-lorab.rhcloud.com/holidayCalculator/coverageCalculator/Json/{lora}
        send in the request
        cant have any spaces in json

        This takes in the request from the user and checks the structure of the request and if correct sends back
        employees assigned to the holidays
     */

    /* 4/12/16 @12:30 JJ - Commented out due to Request, ProcessRequest, and CreateResponse Types were erroring out
                           and not defined.

    @GET
    @Path("Json/{sentRequest}")
    @Produces("application/json")
    @Consumes(MediaType.APPLICATION_JSON)
    public String getRequestOffSchedule(@PathParam("sentRequest") String holidayRequest) {

        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = "The request was not in the correct format please check and send again";
        HashMap<String,Integer> assignedHolidays = new HashMap<String,Integer>();

        try {

            //run validation did they send in the proper structure
            ValidateInput validate = new ValidateInput();
            if (validate.parseJson(holidayRequest)) {

                // Convert JSON string to Object
                Request request = mapper.readValue(jsonInString, Request.class);
                System.out.println(request);

                //run logic for holiday choice proper json was received
                ProcessRequest process = new ProcessRequest();
                assignedHolidays = process.assignHolidays(request);

                //create the response for the screen
                CreateResponse response = new CreateResponse();
                jsonInString = response.run(assignedHolidays);


            } else {
                //the request sent by user was not of proper form return error
                jsonInString = "The request was not in the correct format please check and send again";

            }


            //Pretty print
            //String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);
            //System.out.println(prettyStaff1);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return jsonInString;
    }*/
}
