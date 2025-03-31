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
@Table(name = "faculty")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "faculty_id_gen")
    @SequenceGenerator(name = "faculty_id_gen", sequenceName = "college_id_seq", allocationSize = 1)
    @Column(name = "faculty_id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "faculty_name", nullable = false, length = Integer.MAX_VALUE)
    private String facultyName;


}