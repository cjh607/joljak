package kr.yuhancert.spring;

import kr.yuhancert.spring.DTO.DTOChildTable;
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

    @GetMapping("/test")
    public List<DTOChildTable> getDTOd() { return service.setDtoChildTables(); }

    @GetMapping("/api")
    public List<DtoTable> getDTO() { return service.setDtoTable(); }

    @GetMapping("/apiS")
    public List<DeptMap> getdepartment() { return service.getdeptmap(); }

}
