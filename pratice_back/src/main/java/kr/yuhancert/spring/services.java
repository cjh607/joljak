package kr.yuhancert.spring;

import kr.yuhancert.spring.DTO.DtoTable;
import kr.yuhancert.spring.Repository.Deptmap_Repository;
import kr.yuhancert.spring.Repository.Faculty_Repository;
import kr.yuhancert.spring.Repository.Major_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.yuhancert.spring.Repository.Depart_Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class services {
    @Autowired
    public Depart_Repository depart_Repository;
    @Autowired
    public Deptmap_Repository deptmap_Repository;
    @Autowired
    public Faculty_Repository faculty_Repository;
    @Autowired
    public Major_Repository major_Repository;

    public List<DtoTable> dtoMapping() {
        List<DeptMap> deptMapList = deptmap_Repository.findAll();

        return deptMapList.stream().map(deptMap -> {
            Faculty faculty = null;
            Department department = null;
            Major major = null;
            String a = "",b="",c="";

            if (deptMap.getFaculty() != null) {
                faculty = faculty_Repository.findById(deptMap.getFaculty()).orElse(null);
                a= faculty.getFacultyName();
            }

            if (deptMap.getDepartment() != null) {
                department = depart_Repository.findById(deptMap.getDepartment()).orElse(null);
                b= department.getDepartmentName();
            }

            if (deptMap.getMajor() != null) {
                major = major_Repository.findById(deptMap.getMajor()).orElse(null);
                c= major.getMajorName();
            }

            return new DtoTable(
                    deptMap.getId(), a, b, c
            );
        }).collect(Collectors.toList());

    }




    public List<Department> getdepartment(){
        return depart_Repository.findAll();
    }
    public List<DeptMap> getdeptmap() {return deptmap_Repository.findAll();}
    public List<Faculty> getfaculty() {return faculty_Repository.findAll();}
    public List<Major> getmajor() {return major_Repository.findAll();}

}

