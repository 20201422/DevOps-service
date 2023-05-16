package com.coop.devopsservice;

import com.coop.devopsservice.controller.UserController;
import com.coop.devopsservice.entity.ApiResult;
import com.coop.devopsservice.entity.User;
import com.coop.devopsservice.serviceImpl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DevOpsServiceApplicationTests {
    
    @Autowired
    private UserController userController;
    
    @Test
    void contextLoads() {
    
//        User user = new User("20201419", "慧强", "123456", "组员", "hq.jpeg");
//        User user = new User("20201420", "滔滔", "123456", "组员", "tt.jpeg");
//        User user = new User("20201422", "堃芃", "123456", "组长", "kp.jpeg");
        User user = new User("20201423", "瑞祥", "123456", "组员", "rx.jpeg");
        ApiResult apiResult = userController.updateUser(user);
        assertEquals(200, apiResult.getCode());
        
    }
    
}
