package kr.yuhancert.spring;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "department")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Department {
    @Id
    @Column(name = "department_id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "department_name", nullable = false, length = Integer.MAX_VALUE)
    private String departmentName;

}