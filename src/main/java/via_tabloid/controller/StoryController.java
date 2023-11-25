package via_tabloid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import via_tabloid.entity.DepartmentEntity;
import via_tabloid.entity.StoryEntity;
import via_tabloid.service.StoryService;

import java.util.List;

@RestController
public class StoryController {
    private final StoryService storyService;

    public StoryController(StoryService storyService) {
        this.storyService = storyService;
    }

    @PostMapping("/stories")
    public StoryEntity addStory(StoryEntity story) {
        return storyService.addStory(story);
    }


    @GetMapping("/stories")
    public List<StoryEntity> getAllStories() {
        return storyService.getAllStories();
    }
}
