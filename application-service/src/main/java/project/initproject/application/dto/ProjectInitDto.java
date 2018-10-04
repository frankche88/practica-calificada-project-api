package project.initproject.application.dto;

import project.common.application.dto.RequestBaseDto;
import project.common.application.enumeration.RequestBodyType;
import project.customers.application.dto.CustomerDto;
import project.project.application.dto.ProjectDto;
import project.security.domain.entity.User;


//@JsonDeserialize(using = ProjectInitDtoDeserializer.class)
public class ProjectInitDto extends RequestBaseDto {
	private ProjectDto project;
	private CustomerDto customer;
	private User user;
	
	public ProjectInitDto() {
	}
	
	public ProjectInitDto(ProjectDto project, CustomerDto customer, User user, RequestBodyType requestBodyType) {
		this.project = project;
		this.customer = customer;
		this.user = user;
		this.requestBodyType = requestBodyType;
	}

	public ProjectDto getProject() {
		return project;
	}

	public CustomerDto getCustomer() {
		return customer;
	}

	public User getUser() {
		return user;
	}
	
	

	
}
