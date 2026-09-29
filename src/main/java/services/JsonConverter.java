package services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class JsonConverter {
    static ObjectWriter objecWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
    static ObjectMapper mapper = new ObjectMapper().configure(
            DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false
    );

    public String convertToJson(Object object) throws JsonProcessingException {
        return objecWriter.writeValueAsString(object);
    }

    public <T> T jsonToType(String jsonResponse, Class<T> clazz) throws JsonProcessingException {
        return mapper.readValue(jsonResponse, clazz);
    }
}
