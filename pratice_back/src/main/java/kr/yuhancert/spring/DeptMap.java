package kr.yuhancert.spring;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "dept_map")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DeptMap {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dept_map_id_gen")
    @SequenceGenerator(name = "dept_map_id_gen", sequenceName = "dept_map_dept_map_id_seq", allocationSize = 1)
    @Column(name = "dept_map_id", nullable = false)
    private Long id;

    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "faculty_id")
    private Long faculty;

    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "department_id")
    private Long department;

    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "major_id")
    private Long major;

}