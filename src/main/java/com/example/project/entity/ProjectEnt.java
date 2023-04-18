package com.example.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "project_det")
public class ProjectEnt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private String pname;
    @Column(nullable = false)
    private String pdescription;
    @Column(nullable = false)
    private String status;
    @Column(nullable = false)
    private LocalDate startdata;
    @Column(nullable = false)
    private LocalDate enddate;
    @Column(nullable = false)
    private int budget;

}
