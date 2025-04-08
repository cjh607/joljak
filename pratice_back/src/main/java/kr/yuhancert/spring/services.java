package kr.yuhancert.spring;

import kr.yuhancert.spring.DTO.DTOChildTable;
import kr.yuhancert.spring.DTO.DtoTable;
import kr.yuhancert.spring.Repository.Deptmap_Repository;
import kr.yuhancert.spring.Repository.Faculty_Repository;
import kr.yuhancert.spring.Repository.Major_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.yuhancert.spring.Repository.Depart_Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
    public DtoTable dtoTable;
    public DTOChildTable dtoChildTable;
    List<DtoTable> dtoTables = new ArrayList<>();
    List<DTOChildTable> dtoChildTables = new ArrayList<>();

    public List<DTOChildTable> setDtoChildTables() {
        dtoChildTables = [];
        int j =1;
        List<DeptMap> deptfacluty = deptmap_Repository.findAll();
            for (int k=1; k<6; k++) {

                Long finalK = (long) k;
                List<DeptMap> result = deptfacluty.stream()
                        .filter(n -> n.getFaculty() == finalK)
                        .collect(Collectors.toList());
                for (DeptMap deptmap : result) {
                    Long a = deptmap.getDepartment();
                    Long b = deptmap.getMajor();
                    Optional<Department> c = depart_Repository.findById(a);
                    if (b == null) {
                        continue;
                    }
                    Optional<Major> d = major_Repository.findById(b);
                    String e = c.get().getDepartmentName();
                    String f = d.get().getMajorName();
                    dtoChildTables.add(new DTOChildTable(j, e, f));
                    j++;
                }
            }

        return dtoChildTables;
    }
    public List<DtoTable> setDtoTable(){
        dtoTables.clear();
        for (int i=1; i<6; i++){
            // i 는 dtotable 의 키값이 됨.
            Optional<Faculty> a = faculty_Repository.findById((long) i);//1번쨰에 해당하는 facluty_name 가져오기
            String b = a.get().getFacultyName();
            dtoTables.add(new DtoTable(i,"Faculty",b,dtoChildTables)); // dtotables 리스트에 키값,테이블이름,값,자식리스트 값을 집어넣음.
        }
        return dtoTables;
    }



    public List<Department> getdepartment(){
        return depart_Repository.findAll();
    }
    public List<DeptMap> getdeptmap() {return deptmap_Repository.findAll();}
    public List<Faculty> getfaculty() {return faculty_Repository.findAll();}
    public List<Major> getmajor() {return major_Repository.findAll();}

}


