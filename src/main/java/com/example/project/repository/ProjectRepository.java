package com.example.project.repository;

import com.example.project.entity.ProjectEnt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectEnt, Long> {
}
