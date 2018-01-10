import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Person person = objectMapper.readValue(new File("C:\\Users\\Helix2\\Downloads\\data.json"), Person.class);
            System.out.println(person);

            Example example = objectMapper.readValue(new File("C:\\Users\\Helix2\\Downloads\\example.json"), Example.class);
            System.out.println(example);


        } catch (IOException e){
            e.printStackTrace();

        }


    }
}
