package com.example.pratice_back;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "department")
public class Department {
    @Id
    @Column(name = "department_id", nullable = false)
    private Long id;

    @Column(name = "department_name", nullable = false, length = Integer.MAX_VALUE)
    private String departmentName;

}