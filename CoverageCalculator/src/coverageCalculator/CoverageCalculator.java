package coverageCalculator;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.*;

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
    @Path("coverageCalculatorHtml/{name}")
    @Produces("text/html")
    public String getHelloHtml(@PathParam("name") String name) {
        String message = "<html><title>Hello" + name + "</title><body><h1>Hello " + name + "</h1></body></html>";

        return message;
    }


    @GET
    @Path("coverageCalculatorJson/{holidayRequests}")
    @Produces("application/json")
    public String getRequestOffJson(@PathParam("holidayRequests") String name) {
        return "{[name:" + name + "]}";
    }

    @GET
    @Path("getHolidayRequest/{employeeId}")
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
    @Path("processHolidayRequest")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("text/html")
    public Response processHolidayRequest(HolidayRequest holidayRequest) {
        String response = "POST Response: " + holidayRequest.toString();
        return Response.status(200).entity(response).build();
    }



}
