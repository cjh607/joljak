package com.example.pratice_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;


interface DepartmentReposi extends JpaRepository<Department, Long> {
    // 필요한 쿼리 메서드 추가
}

interface DeptReposi extends JpaRepository<DeptMap, Long> {
    // 필요한 쿼리 메서드 추가
}

 interface FacultyReposi extends JpaRepository<Faculty, Long> {
    // 필요한 쿼리 메서드 추가
}

 interface MajorReposi extends JpaRepository<Major, Long> {
    // 필요한 쿼리 메서드 추가
}
