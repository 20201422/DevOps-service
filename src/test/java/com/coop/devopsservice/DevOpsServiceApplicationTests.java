package com.coop.devopsservice;

import com.coop.devopsservice.controller.epicController.EpicController;
import com.coop.devopsservice.controller.questionController.QuestionController;
import com.coop.devopsservice.controller.storyController.StoryController;
import com.coop.devopsservice.controller.userController.UserController;
import com.coop.devopsservice.entity.ApiResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DevOpsServiceApplicationTests {
    
    @Autowired
    private UserController userController;
    @Autowired
    private QuestionController questionController;
    @Autowired
    private EpicController epicController;
    
    @Test
    void contextLoads() {
    
//        User user = new User("20201419", "慧强", "123456", "组员", "hq.jpeg");
//        User user = new User("20201420", "滔滔", "123456", "组员", "tt.jpeg");
//        User user = new User("20201422", "堃芃", "123456", "组长", "kp.jpeg");
//        User user = new User("20201423", "瑞祥", "123456", "组员", "rx.jpeg");
//        ApiResult apiResult = userController.updateUser(user);
//        assertEquals(200, apiResult.getCode());

//        Question question = new Question("4",  "用例建模","对项目完成uml建模", "高", "规划中", "12", "34");
//        ApiResult api = questionController.addQuestion(question);
//        assertEquals(200, api.getCode());

        StoryController storyController = new StoryController();
        System.out.println(storyController.showStoryMap());
    
    }
    
}
