package project.initproject.domain.service;

import static project.common.application.Messages.INVALID_PROJECT;
import static project.common.application.Messages.USER_MISSING;

import javax.inject.Named;

import project.common.application.Notification;
import project.customers.domain.entity.Customer;
import project.project.domain.entity.Project;
import project.security.domain.entity.User;

@Named
public class InitProjectDomainService {
	public void signup(Project originAccount, Customer destinationAccount, User amount)
			throws IllegalArgumentException {
		Notification notification = this.validation(originAccount, destinationAccount, amount);
        if (notification.hasErrors()) {
            throw new IllegalArgumentException(notification.errorMessage());
        }
        
        //TODO: SAVE PROJECT AND USER
		
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
