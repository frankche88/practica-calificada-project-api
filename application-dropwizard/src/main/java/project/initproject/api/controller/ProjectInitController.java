package project.initproject.api.controller;

import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.dropwizard.hibernate.UnitOfWork;
import io.swagger.annotations.Api;
import project.common.api.controller.ResponseHandler;
import project.customers.application.dto.mapper.CustomerToCustomerDtoMapper;
import project.customers.domain.entity.Customer;
import project.initproject.application.dto.ProjectInitDto;
import project.initproject.domain.service.InitProjectDomainService;
import project.project.application.dto.mapper.ProjectDtoMapper;
import project.project.domain.entity.Project;
import project.security.domain.entity.User;

@Path("/api")
@PermitAll
@Api(value = "/api/signup")
public class ProjectInitController {
	

	@Inject
	private ResponseHandler responseHandler;

	@Inject
	private ProjectDtoMapper projectDtoMapper;
	
	@Inject
	private CustomerToCustomerDtoMapper customerDtoMapper;
	
	@Inject
	private InitProjectDomainService InitProjectDomainService;

	@POST
	@Path("/signup")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@UnitOfWork
	public Response signup(ProjectInitDto projectInitDto) throws Exception {
		try {
			
			Project project = projectDtoMapper.reverseMapper(projectInitDto.getProject());
			
			Customer customer = customerDtoMapper.reverseMapper(projectInitDto.getCustomer());
			
			User user = projectInitDto.getUser();
			
			InitProjectDomainService.signup(project, customer, user);
			return this.responseHandler.getOkCommandResponse("signup done!");
		} catch(IllegalArgumentException ex) {
			return this.responseHandler.getAppCustomErrorResponse(ex.getMessage());
		} catch(Exception ex) {
			return this.responseHandler.getAppExceptionResponse(ex);
		}
	}
	

	
}
