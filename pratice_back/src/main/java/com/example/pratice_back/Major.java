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
@Table(name = "major")
public class Major {
    @Id
    @Column(name = "major_id", nullable = false)
    private Long id;

    @Column(name = "major_name", nullable = false, length = Integer.MAX_VALUE)
    private String majorName;

}