package project.project.infrastructure.hibernate.repository;

import javax.inject.Named;
import javax.inject.Singleton;

import banking.common.infrastructure.hibernate.repository.BaseHibernateRepository;
import project.project.domain.entity.Project;
import project.project.domain.repository.ProjectRepository;

@Named
@Singleton
public class ProjectHibernateRepository extends BaseHibernateRepository<Project>
		implements ProjectRepository {

	

	public void save(Project bankAccount) {
		super.save(bankAccount);
	}

	
	@Override
	public Project findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
