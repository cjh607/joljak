package kr.yuhancert.spring.DTO;

import kr.yuhancert.spring.Department;
import kr.yuhancert.spring.DeptMap;
import kr.yuhancert.spring.Faculty;
import kr.yuhancert.spring.Major;

import java.util.List;

public class DtoTable {
    private List<Department> department;
    private List<DeptMap> deptmap;
    private List<Faculty> faculty;
    private List<Major> major;

    public DtoTable(List<Department> department, List<DeptMap> deptmap, List<Faculty> faculty,List<Major> major ) {
        this.department = department;
        this.deptmap = deptmap;
        this.faculty = faculty;
        this.major = major;
    }
    public List<Department> getDepartment() {return department;}
    public void setDepartment(List<Department> department) {this.department = department;}
    public List<DeptMap> getDeptmap() {return deptmap;}
    public void setDeptmap(List<DeptMap> deptmap) {this.deptmap = deptmap;}
    public List<Faculty> getFaculty() {return faculty;}
    public void setFaculty(List<Faculty> faculty) {this.faculty = faculty;}
    public List<Major> getMajor() {return major;}
    public void setMajor(List<Major> major) {this.major = major;}
}
