package project.security.domain.repository;

import project.security.domain.entity.User;

public interface UserRepository {
	
	public User findByUserName(String username);
	
	public void save(User user);

}
