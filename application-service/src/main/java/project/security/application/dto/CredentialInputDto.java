package project.security.application.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import project.common.application.dto.RequestBaseDto;
import project.common.application.enumeration.RequestBodyType;
import project.security.application.dto.deserialize.CredentialInputDtoDeserializer;

@JsonDeserialize(using = CredentialInputDtoDeserializer.class)
public class CredentialInputDto extends RequestBaseDto {
	
	private String userName;
	private String password;
	
	
	
	public CredentialInputDto(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	
	public CredentialInputDto(RequestBodyType requestBodyType) {
		this.requestBodyType = requestBodyType;
	}


	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	
	

}
