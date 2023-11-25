package via_tabloid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import via_tabloid.entity.StoryEntity;

public interface StoryRepository extends JpaRepository<StoryEntity, Long> {
}
