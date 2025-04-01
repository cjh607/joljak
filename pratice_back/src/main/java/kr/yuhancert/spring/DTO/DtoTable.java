package kr.yuhancert.spring.DTO;

import jakarta.validation.constraints.NotNull;
import kr.yuhancert.spring.Department;
import kr.yuhancert.spring.DeptMap;
import kr.yuhancert.spring.Faculty;
import kr.yuhancert.spring.Major;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class DtoTable {
    private Long id;
    private String departmentName;
    private String facultyName;
    private String majorName;

    public DtoTable(Long id, @NotNull String facultyName, @NotNull String departmentName, @NotNull String majorName) {
    }
}
