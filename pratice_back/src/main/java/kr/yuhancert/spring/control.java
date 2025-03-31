package kr.yuhancert.spring;

import kr.yuhancert.spring.DTO.DtoTable;
import kr.yuhancert.spring.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class control {
    @Autowired
    public services service;

    @GetMapping("/api")
    public DtoTable getallData() {
        return service.getAlldata();
    }
    @GetMapping("/apiS")
    public List<Department> getdepartment() {
        return service.getdepartment();
    }

}
