package kr.yuhancert.spring.Repository;

import kr.yuhancert.spring.DeptMap;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface Deptmap_Repository extends JpaRepository<DeptMap, Long> {
    List<DeptMap> findByFaculty(Long faculty);
}
