package com.example.pratice_back;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "dept_map")
public class DeptMap {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dept_map_id_gen")
    @SequenceGenerator(name = "dept_map_id_gen", sequenceName = "dept_map_dept_map_id_seq", allocationSize = 1)
    @Column(name = "dept_map_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "department_id")
    private Department department;

}