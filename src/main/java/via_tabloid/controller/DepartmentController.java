package via_tabloid.controller;

import org.springframework.web.bind.annotation.*;
import via_tabloid.entity.DepartmentEntity;
import via_tabloid.service.DepartmentService;

import java.util.List;

@RestController
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/departments")
    public String addDepartment(DepartmentEntity department) {
        return "departmentService.addDepartment(department);";
    }

    @RequestMapping("")
    public String printSomething() {
        return "<body><h1>Hello World!</h1></body>";
    }


    @GetMapping("/departments")
    public List<DepartmentEntity> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/department/{id}")
    public DepartmentEntity getDepartmentById(@PathVariable("id") Long id) {
        return departmentService.getDepartmentById(id);    }
}
