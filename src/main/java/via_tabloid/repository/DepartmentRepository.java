package via_tabloid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import via_tabloid.entity.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long> {
}
