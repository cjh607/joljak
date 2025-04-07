package kr.yuhancert.spring.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
@NoArgsConstructor
public class DTOChildTable {
    private int id;
    private String department;
    private String major;

    public DTOChildTable(int j, String e, String f) {
        this.id = j;
        this.department = e;
        this.major = f;
    }
}
