package project.project.application.dto.mapper;

import javax.inject.Named;
import javax.inject.Singleton;

import project.project.application.dto.ProjectDto;
import project.project.domain.entity.Project;

@Named
@Singleton
public class ProjectDtoMapper {
	
	


	public Project reverseMapper(ProjectDto dto) {

		Project project = new Project();

		project.setBudget(dto.getBudget());

		project.setName(dto.getName());


		return project;
	}

}
