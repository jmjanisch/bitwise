package java.coverageCalculator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

/**
 * Created by Justin Janisch on 4/13/2016.
 */
@Path("/helloworld")
public class HelloWorld {
    // The Java method will process HTTP GET requests
    @GET
    @Path("/{name}")// The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public javax.ws.rs.core.Response getMessage(@PathParam("name") String name) {
        String output =  "Hello " + name;

        return javax.ws.rs.core.Response.status(200).entity(output).build();
    }

    @GET
    @Path("helloHtml/{name}")
    @Produces("text/html")
    public String getHelloHtml(@PathParam("name") String name) {
        String message = "<html><title>Hello" + name + "</title><body><h1>Hello " + name + "</h1></body></html>";

        return message;
    }


    @GET
    @Path("helloJson/{name}")
    @Produces("application/json")
    public String getHelloJson(@PathParam("name") String name) {
        return "{[name:" + name + "]}";
    }

}
