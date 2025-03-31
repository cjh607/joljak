package kr.yuhancert.spring;

import kr.yuhancert.spring.DTO.DtoTable;
import kr.yuhancert.spring.Repository.Deptmap_Repository;
import kr.yuhancert.spring.Repository.Faculty_Repository;
import kr.yuhancert.spring.Repository.Major_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.yuhancert.spring.Repository.Depart_Repository;

import java.util.List;

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

    public DtoTable getAlldata(){
        List<Department> departments = depart_Repository.findAll();
        List<DeptMap> deptmaps = deptmap_Repository.findAll();
        List<Faculty> faculties = faculty_Repository.findAll();
        List<Major> majors = major_Repository.findAll();
        return new DtoTable (departments,deptmaps,faculties,majors);
    }

    public List<Department> getdepartment(){
        return depart_Repository.findAll();
    }
    public List<DeptMap> getdeptmap() {return deptmap_Repository.findAll();}
    public List<Faculty> getfaculty() {return faculty_Repository.findAll();}
    public List<Major> getmajor() {return major_Repository.findAll();}

}

