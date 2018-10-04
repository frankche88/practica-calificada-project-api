package project.customers.application.dto.deserializer;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import project.common.application.enumeration.RequestBodyType;
import project.customers.application.dto.CustomerDto;

public class CustomerDtoDeserializer extends JsonDeserializer<CustomerDto> {
	
	Logger logger = LoggerFactory.getLogger(CustomerDtoDeserializer.class);

	@Override
	public CustomerDto deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		
		CustomerDto dto = null;
		
		try {
    		ObjectCodec objectCodec = jsonParser.getCodec();
    		
            JsonNode node = objectCodec.readTree(jsonParser);
            
            long id = 0;
            try {
            	id = new Long (node.get("id").asText());
            } catch(RuntimeException e) {
            	
            }

            String firstName = node.get("firstName").asText();
            
            String lastName = node.get("lastName").asText();
            
            dto = new CustomerDto(id, firstName, lastName);
            
    	} catch(Exception ex) {
    		logger.error(ex.getMessage(), ex);
    		dto = new CustomerDto();
    		dto.setRequestBodyType(RequestBodyType.INVALID);
    	}
        return dto;
	}

}
