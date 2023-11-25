package via_tabloid.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "DepartmentEntity")
@Table(name = "department")
public class DepartmentEntity {
    @Id
    private Long id;
    private String name;

  /*  @JsonIgnore
    private List<StoryEntity> stories = new ArrayList<>();*/

    public DepartmentEntity() {
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public DepartmentEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
