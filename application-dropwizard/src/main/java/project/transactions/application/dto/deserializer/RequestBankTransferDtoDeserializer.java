package project.transactions.application.dto.deserializer;

import java.io.IOException;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import project.common.application.enumeration.RequestBodyType;
import project.initproject.application.dto.ProjectInitDto;

public class RequestBankTransferDtoDeserializer extends JsonDeserializer<ProjectInitDto> {
	@Override
	public ProjectInitDto deserialize(JsonParser jsonParser, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		ProjectInitDto requestBankTransferDto = null;
		try {
    		ObjectCodec objectCodec = jsonParser.getCodec();
            JsonNode node = objectCodec.readTree(jsonParser);
            String fromAccountNumber = node.get("fromAccountNumber").asText();
            String toAccountNumber = node.get("toAccountNumber").asText();
            BigDecimal amount = new BigDecimal(node.get("amount").asText());
           // requestBankTransferDto = new ProjectInitDto(fromAccountNumber, toAccountNumber, amount, RequestBodyType.VALID);
    	} catch(Exception ex) {
    		//requestBankTransferDto = new ProjectInitDto("", "", null, RequestBodyType.INVALID);
    	}
        return requestBankTransferDto;
	}	
}
