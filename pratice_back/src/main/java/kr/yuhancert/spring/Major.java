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
@Table(name = "major")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Major {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "major_id_gen")
    @SequenceGenerator(name = "major_id_gen", sequenceName = "major_major_id_seq", allocationSize = 1)
    @Column(name = "major_id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "major_name", nullable = false, length = Integer.MAX_VALUE)
    private String majorName;


}