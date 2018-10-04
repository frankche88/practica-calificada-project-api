package project.customers.application.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import project.customers.application.dto.CustomerDto;
import project.customers.domain.entity.Customer;

@Named
@Singleton
public class CustomerToCustomerDtoMapper {

	public CustomerDto mapper(Customer customer) {

		CustomerDto dto = new CustomerDto(customer.getId(), customer.getFirstName(),
				customer.getLastName());
		
		
		return dto;
	}

	public Customer reverseMapper(CustomerDto dto) {

		Customer customer = new Customer();

		customer.setId(dto.getId());

		customer.setFirstName(dto.getFirstName());

		customer.setLastName(dto.getLastName());

		return customer;
	}

	public List<CustomerDto> mapper(List<Customer> customers) {

		List<CustomerDto> lstCustomer = new ArrayList<>();

		for (Customer customer : customers) {

			lstCustomer.add(mapper(customer));

		}

		return lstCustomer;
	}



}
