package coverageCalculator;

import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
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
    @Path("coverageCalculatorJson/{name}")
    @Produces("application/json")
    public String getHelloJson(@PathParam("name") String name) {
        return "{[name:" + name + "]}";
    }


}
