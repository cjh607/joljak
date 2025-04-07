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
    private int id;
    private String tableName;
    private String Value;
    private List<DTOChildTable> childTableName;

    public DtoTable(int i, String faculty, String value, List<DTOChildTable> dtoChildTables) {
        this.id = i;
        this.tableName = faculty;
        this.Value = value;
        this.childTableName = dtoChildTables;
    }
}
