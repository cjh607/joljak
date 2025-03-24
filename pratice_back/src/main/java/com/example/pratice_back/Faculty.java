package com.example.pratice_back;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "faculty")
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "faculty_id_gen")
    @SequenceGenerator(name = "faculty_id_gen", sequenceName = "college_id_seq", allocationSize = 1)
    @Column(name = "faculty_id", nullable = false)
    private Long id;

    @Column(name = "faculty_name", nullable = false, length = Integer.MAX_VALUE)
    private String facultyName;

}