package project.customers.domain.repository;

import project.customers.domain.entity.Customer;

public interface CustomerRepository {

	Customer findById(long id);
	


	void save(Customer customer);
}
