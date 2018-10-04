package project.project.domain.entity;

import java.math.BigDecimal;

import project.common.application.Budget;
import project.customers.domain.entity.Customer;

public class Project {
	private long id = 0;
    private String name;
    private Budget budget = new Budget(BigDecimal.ZERO, "USD");
    private Customer customer;

    public Project() {
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Budget getBudget() {
		return budget;
	}

	public void setBudget(Budget budget) {
		this.budget = budget;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

    
}
