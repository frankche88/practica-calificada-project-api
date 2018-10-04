package banking.accounts.infrastructure.hibernate.repository;

import org.junit.Test;

import banking.commons.infrastructure.hibernate.repository.JPAHibernateTest;
import project.project.infrastructure.hibernate.repository.ProjectHibernateRepository;

public class BankAccountHibernateRepositoryTest extends JPAHibernateTest {
	
	ProjectHibernateRepository customerRepository = new ProjectHibernateRepository();
	
	@Test
    public void testGetObjectById_success() {
		
		sessionFactory.getCurrentSession().beginTransaction();
		
		customerRepository.setSessionFactory(sessionFactory);
		
       
        
        sessionFactory.getCurrentSession().getTransaction().commit();
    }

}
