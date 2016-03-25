package coverageCalculator;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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

    @POST
    @Path("processHolidayRequest")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("text/html")
    public Response processHolidayRequest() {
        String response = "Holiday Request off: ";
        return Response.status(200).entity(response).build();
    }



}
