package com.example.pratice_back;

import org.apache.catalina.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service {
    private final DepartmentReposi deptRepo;
    //private final DeptMap deptMapRepo;
    private final FacultyReposi facultyRepo;
    private final MajorReposi majorRepo;

    public List<Department> getdepart() {
        return deptRepo.findAll();
    }
    @Autowired
    public service(DepartmentReposi deptRepo, FacultyReposi facultyRepo, MajorReposi majorRepo) {
        this.deptRepo = deptRepo;
        //this.deptMapRepo = deptMapRepo;
        this.facultyRepo = facultyRepo;
        this.majorRepo = majorRepo;
    }


    //public List<DeptMap> getdeptmap() {
        //return deptMapRepo.findAll();
    //}
    public List<Faculty> getfaculty() {
        return facultyRepo.findAll();
    }
    public List<Major> getmajor() {
        return majorRepo.findAll();
    }
}