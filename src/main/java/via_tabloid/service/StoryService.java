package via_tabloid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import via_tabloid.entity.StoryEntity;
import via_tabloid.repository.StoryRepository;

import java.util.List;

@Service
public class StoryService {
    final
    StoryRepository storyRepository;


    public StoryService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public StoryEntity addStory(StoryEntity story) {
        return storyRepository.save(story);
    }

    public List<StoryEntity> getAllStories() {
        return storyRepository.findAll();
    }
}
