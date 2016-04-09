package coverageCalculator;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

import javax.jms.Message;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Justin Janisch on 3/25/2016.
 */
// The Java class will be hosted at the URI path "/coverageCalculator"
@Path("/coverageCalculator")
public class CoverageCalculator {
    // The Java method will process HTTP GET requests
    @GET
    @Path("/{name}")// The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public Response getMessage(@PathParam("name") String name) {
        String output =  "Hello " + name;

        return Response.status(200).entity(output).build();
    }

    @GET
    @Path("/coverageCalculatorHtml/{name}")
    @Produces("text/html")
    public String getHelloHtml(@PathParam("name") String name) {
        String message = "<html><title>Hello" + name + "</title><body><h1>Hello " + name + "</h1></body></html>";

        return message;
    }


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

    @POST
    @Path("/processHolidayRequest")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("text/html")
    public Response processHolidayRequest(HolidayRequest holidayRequest) {
        ValidateInput validator = new ValidateInput();
        int statusCode = 200;
        String response = "POST Response: " + holidayRequest.toString();

        validator.parseJson();

       /*for (HolidayRequest holidayRequest : holidayRequests) {
            System.out.println(holidayRequest.toString());
            response += "Number of requests +1 "; //holidayRequest.toString();
       }*/


        return Response.status(statusCode).entity(response).build();
    }
<<<<<<< HEAD

    /*
=======
/*
>>>>>>> 0fd8792f67518cd1370000770172ba647d886a71
    @GET
    @Path("/Json/{holidays:\\d")
    @Produces("text/plain")
    @Consumes(MediaType.APPLICATION_JSON)
    public String getRequestOffScheduel(Message holidays) {

        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = holidays;


        try {

            // Convert JSON string to Object
            Request request = mapper.readValue(jsonInString, Request.class);
            System.out.println(request);

            //Pretty print
            String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);
            System.out.println(prettyStaff1);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return jsonInString;
    }
*/

<<<<<<< HEAD
    @GET
    //@Path("Json/{holidays:[('[a-zA-Z] +')+,.+],employees:[({'empid':[0-9]+,'holidayChoice':[[0-9]+,[0-9]+,[0-9]+]})+.+")
    @Path("Json/{sentRequest}")
=======

    @GET
    @Path("Json/{holidays:[('[a-zA-Z] +')+,.+],employees:[({'empid':[0-9]+,'holidayChoice':[[0-9]+,[0-9]+,[0-9]+]})+.+")
>>>>>>> 0fd8792f67518cd1370000770172ba647d886a71
    @Produces("application/json")
    @Consumes(MediaType.APPLICATION_JSON)
    public String getRequestOffScheduel(@PathParam("sentRequest") String holidayRequest) {

        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = holidayRequest;


        try {

            // Convert JSON string to Object
            Request request = mapper.readValue(jsonInString, Request.class);
            System.out.println(request);

            //Pretty print
            String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);
            System.out.println(prettyStaff1);

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
