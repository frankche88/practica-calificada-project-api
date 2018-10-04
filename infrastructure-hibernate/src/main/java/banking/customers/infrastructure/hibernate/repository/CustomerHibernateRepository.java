package banking.customers.infrastructure.hibernate.repository;

import javax.inject.Named;
import javax.inject.Singleton;

import banking.common.infrastructure.hibernate.repository.BaseHibernateRepository;
import project.customers.domain.entity.Customer;
import project.customers.domain.repository.CustomerRepository;

@Named
@Singleton
public class CustomerHibernateRepository extends BaseHibernateRepository<Customer> implements CustomerRepository {

	@Override
	public Customer findById(long id) {
		
		return null;
	}

	

}