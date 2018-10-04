package banking.customers.infrastructure.hibernate.repository;

import static junit.framework.TestCase.assertNotNull;

import org.junit.Test;

import banking.commons.infrastructure.hibernate.repository.JPAHibernateTest;
import project.customers.domain.entity.Customer;

public class CustomerHibernateRepositoryTest extends JPAHibernateTest {
	
	CustomerHibernateRepository customerRepository = new CustomerHibernateRepository();
	
	
	
	@Test
    public void testFindById_success() throws Exception {
		
		sessionFactory.getCurrentSession().beginTransaction();
		
		customerRepository.setSessionFactory(sessionFactory);
		
		Customer book = customerRepository.findById(1);
		
        assertNotNull(book);
        
        sessionFactory.getCurrentSession().getTransaction().commit();
    }

}
