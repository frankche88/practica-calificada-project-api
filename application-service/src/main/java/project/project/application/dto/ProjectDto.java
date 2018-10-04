package project.project.application.dto;

import java.math.BigDecimal;

import project.common.application.Budget;
import project.customers.domain.entity.Customer;

public class ProjectDto {

    private String name;
    private Budget budget = new Budget(BigDecimal.ZERO, "USD");
    private Customer customer;
    
    
	public String getName() {
		return name;
	}
	public Budget getBudget() {
		return budget;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBudget(Budget budget) {
		this.budget = budget;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
}
