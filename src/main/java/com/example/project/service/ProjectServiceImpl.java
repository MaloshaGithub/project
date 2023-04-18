package com.example.project.service;

import com.example.project.entity.ProjectEnt;
import com.example.project.repository.ProjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProjectServiceImpl implements projectService{
    private ProjectRepository projectRepository;
    @Override
    public ProjectEnt createProjectENt(ProjectEnt projectEnt) {

        return projectRepository.save(projectEnt);
    }

    @Override
    public ProjectEnt getProjectById(Long projectId) {
        Optional<ProjectEnt> optionalProjectEnt = projectRepository.findById(projectId);
        return optionalProjectEnt.get();
    }

    @Override
    public List<ProjectEnt> getAllProjectENt() {
        return projectRepository.findAll();
    }

    @Override
    public ProjectEnt updateProjectEnt(ProjectEnt projectEnt) {
        ProjectEnt existingProject = projectRepository.findById(projectEnt.getId()).get();
        existingProject.setPname(projectEnt.getPname());
        existingProject.setPdescription(projectEnt.getPdescription());
        existingProject.setBudget(projectEnt.getBudget());
        existingProject.setStartdata(projectEnt.getStartdata());
        existingProject.setEnddate(projectEnt.getEnddate());
        existingProject.setStatus(projectEnt.getStatus());
        return null;
    }

    @Override
    public void deleteProjectEnt(Long projectId) {
        projectRepository.deleteById(projectId);
    }
}
