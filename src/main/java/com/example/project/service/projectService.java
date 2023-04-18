package com.example.project.service;

import com.example.project.entity.ProjectEnt;

import java.util.List;

public interface projectService {
    ProjectEnt createProjectENt(ProjectEnt projectEnt);

    ProjectEnt getProjectById(Long projectId);

    List<ProjectEnt> getAllProjectENt();

    ProjectEnt updateProjectEnt(ProjectEnt projectEnt);

    void deleteProjectEnt(Long projectId);
}
