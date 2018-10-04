package banking.security.infrastructure.hibernate.repository;

import javax.inject.Named;
import javax.inject.Singleton;

import banking.common.infrastructure.hibernate.repository.BaseHibernateRepository;
import project.security.domain.entity.UserRole;
import project.security.domain.repository.UserRoleRepository;

@Named
@Singleton
public class UserRoleHibernateRepository extends BaseHibernateRepository<UserRole>  implements UserRoleRepository {

	

}
