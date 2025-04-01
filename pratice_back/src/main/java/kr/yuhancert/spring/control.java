package kr.yuhancert.spring;

import kr.yuhancert.spring.DTO.DtoTable;
import kr.yuhancert.spring.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class control {
    @Autowired
    public services service;

    @GetMapping("/api")
    public ResponseEntity<List<DtoTable>> getallData() {
        List<DtoTable> dtoTableList = service.dtoMapping();
        return ResponseEntity.ok(dtoTableList);
    }

    @GetMapping("/apiS")
    public List<Department> getdepartment() {
        return service.getdepartment();
    }

}
