package via_tabloid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import via_tabloid.entity.DepartmentEntity;
import via_tabloid.repository.DepartmentRepository;

import java.util.List;

@Service
public class DepartmentService {
    final
    DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public DepartmentEntity addDepartment(DepartmentEntity department) {
        return departmentRepository.save(department);
    }

    public List<DepartmentEntity> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public DepartmentEntity getDepartmentById(Long id) {
        return departmentRepository.findById(id).get();
    }
}
