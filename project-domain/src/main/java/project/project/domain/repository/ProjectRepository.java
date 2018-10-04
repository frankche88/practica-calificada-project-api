package project.project.domain.repository;

import project.project.domain.entity.Project;

public interface ProjectRepository {

	void save(Project bankAccount);

	Project findById(long id);

}
