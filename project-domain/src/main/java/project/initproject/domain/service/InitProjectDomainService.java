package project.initproject.domain.service;

import static project.common.application.Messages.INVALID_PROJECT;
import static project.common.application.Messages.USER_MISSING;

import javax.inject.Inject;
import javax.inject.Named;

import project.common.application.Notification;
import project.customers.domain.entity.Customer;
import project.project.domain.entity.Project;
import project.project.domain.repository.ProjectRepository;
import project.security.domain.entity.User;
import project.security.domain.repository.UserRepository;

@Named
public class InitProjectDomainService {
	
	@Inject
	private ProjectRepository projectRepository;
	
	@Inject
	private UserRepository userRepository;
	
	public void signup(Project project, Customer customer, User user)
			throws IllegalArgumentException {
		Notification notification = this.validation(project, customer, user);
        if (notification.hasErrors()) {
            throw new IllegalArgumentException(notification.errorMessage());
        }
        
        //TODO: SAVE PROJECT AND USER
        
        project.setCustomer(customer);
        
        
        projectRepository.save(project);
        
        userRepository.save(user);
        
		
	}
	
	private Notification validation(Project originAccount, Customer destinationAccount, User amount) {
        Notification notification = new Notification();
        this.validateUser(notification, amount);
        this.validateProject(notification, originAccount, destinationAccount);
        return notification;
    }
    
    private void validateUser(Notification notification, User amount) {
        if (amount == null) {
            notification.addError(USER_MISSING);
            return;
        }
    }
    
    private void validateProject(Notification notification, Project originAccount, Customer destinationAccount) {
        if (originAccount == null || destinationAccount == null) {
            notification.addError(INVALID_PROJECT);
            return;
        }
    }
}
