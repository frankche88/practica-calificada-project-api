package project.guice.module;

import org.hibernate.SessionFactory;

import com.google.inject.AbstractModule;

import banking.customers.infrastructure.hibernate.repository.CustomerHibernateRepository;
import banking.security.infrastructure.hibernate.repository.UserHibernateRepository;
import project.bundles.HbnBundle;
import project.customers.domain.repository.CustomerRepository;
import project.project.domain.repository.ProyectRepository;
import project.project.infrastructure.hibernate.repository.ProjectHibernateRepository;
import project.security.domain.repository.UserRepository;

public class HbnModule extends AbstractModule {

	private final HbnBundle hbnBundle;

    public HbnModule(HbnBundle hbnBundle) {
        this.hbnBundle = hbnBundle;
    }

    @Override
    protected void configure() {
        bind(SessionFactory.class).toInstance(hbnBundle.getSessionFactory());
        
        bind(ProyectRepository.class).to(ProjectHibernateRepository.class);
        
        bind(CustomerRepository.class).to(CustomerHibernateRepository.class);
        
        bind(UserRepository.class).to(UserHibernateRepository.class);
        
    }

}
