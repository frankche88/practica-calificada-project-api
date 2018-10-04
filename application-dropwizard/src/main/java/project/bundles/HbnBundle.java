package project.bundles;

import java.io.InputStream;

import com.google.common.collect.ImmutableList;

import io.dropwizard.db.PooledDataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.hibernate.SessionFactoryFactory;
import project.ProjectConfiguration;
import project.project.infrastructure.hibernate.repository.ProjectHibernateRepository;

public class HbnBundle extends HibernateBundle<ProjectConfiguration> {

	
	public HbnBundle() {
		super(ImmutableList.of(), new SessionFactoryFactory());
	}

	@Override
	public PooledDataSourceFactory getDataSourceFactory(ProjectConfiguration configuration) {
		return configuration.getDataSourceFactory();

	}
	
	protected void configure(org.hibernate.cfg.Configuration configuration) {
		

		
		InputStream inputBankAccount = ProjectHibernateRepository.class.getClassLoader().getResourceAsStream("hibernate/project.hbm.xml");
		
		InputStream inputCustomer = ProjectHibernateRepository.class.getClassLoader().getResourceAsStream("hibernate/customer.hbm.xml");
		
		InputStream inputUser = ProjectHibernateRepository.class.getClassLoader().getResourceAsStream("hibernate/Users.hbm.xml");
		

		configuration.addInputStream(inputBankAccount);
		configuration.addInputStream(inputCustomer);
		
		configuration.addInputStream(inputUser);
		
    }

}
