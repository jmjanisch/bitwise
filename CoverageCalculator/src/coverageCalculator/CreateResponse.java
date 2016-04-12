package coverageCalculator;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by Lora on 3/29/16.
 */
public class CreateResponse {

    public static void main(String[] args) {
        CreateResponse obj = new CreateResponse();
        obj.run();
    }

    private void run() {
        ObjectMapper mapper = new ObjectMapper();

        ResponseEntity response = new ResponseEntity();

        try {
            // Convert object to JSON string and save into a file directly
            mapper.writeValue(new File("D:\\response.json"), response);

            // Convert object to JSON string
            String jsonInString = mapper.writeValueAsString(response);
            System.out.println(jsonInString);

            // Convert object to JSON string and pretty print
            jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);
            System.out.println(jsonInString);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}