package project.customers.application.dto;

import project.common.application.dto.RequestBaseDto;

public class CustomerDto extends RequestBaseDto {

	private long id = 0;

	private String firstName;

	private String lastName;

	public CustomerDto() {

	}

	public CustomerDto(long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFullName() {
		return String.format("%s, %s", this.lastName, this.firstName);
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}
