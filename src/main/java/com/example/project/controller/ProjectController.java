package com.example.project.controller;

import com.example.project.entity.ProjectEnt;
import com.example.project.service.ProjectServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/project")
public class ProjectController {
    private ProjectServiceImpl projectService;

    // building create Employee REST API
    @PostMapping
    public ResponseEntity<ProjectEnt> createProject(ProjectEnt projectEnt){
        ProjectEnt savedProject = projectService.createProjectENt(projectEnt);
        return new ResponseEntity<>(projectEnt, HttpStatus.OK);
    }

    // building get All Employee REST API
    @GetMapping("/all")
    public ResponseEntity<List<ProjectEnt>> getAllProject(){
        List<ProjectEnt> projectEnts = projectService.getAllProjectENt();
        return new ResponseEntity<>(projectEnts, HttpStatus.OK);
    }

    // Building Update Employee REST API
//    @PutMapping("{id}")
//    public ResponseEntity<ProjectEnt> updateProjectEnt(@PathVariable("id") Long projectId,
//                                                   @RequestParam ProjectEnt projectEnt){
//        projectEnt.setId(projectId);
//        ProjectEnt updateProjectEnt = projectEnt.updateProject(projectEnt);
//        return new ResponseEntity<>(updateProjectEnt, HttpStatus.OK);
//    }

    // Build Delete Employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteProjectEnt(@PathVariable("id") Long projectId){
        projectService.deleteProjectEnt(projectId);
        return new ResponseEntity<>("Project detail successfully deleted!", HttpStatus.OK);
    }
}
