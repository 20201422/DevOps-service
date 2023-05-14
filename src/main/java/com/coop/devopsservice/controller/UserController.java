/**
 * @ClassName UserController
 * @Author 24
 * @Date 2023/5/14 19:46
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.controller;

import com.coop.devopsservice.entity.ApiResult;
import com.coop.devopsservice.entity.User;
import com.coop.devopsservice.serviceImpl.UserServiceImpl;
import com.coop.devopsservice.util.ApiResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    
    private UserServiceImpl userService;
    
    public UserController() {
    }
    
    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }
    
    @GetMapping("/users")
    public ApiResult findAllUser() {    // 查找全部用户
        System.out.println("查询全部");
        return ApiResultHandler.success(userService.findAll());
    }
    
    @GetMapping("/user/{userId}")
    public ApiResult findUserById(@PathVariable("userId") String userId) {  // 根据id查找用户
        System.out.println("根据ID查找");
        return ApiResultHandler.success(userService.findUserById(userId));
    }
    
    @PostMapping("/user/add")
    public ApiResult addUser(User user){    // 添加一个用户
        System.out.println("添加用户");
        return ApiResultHandler.success(userService.addUser(user));
    }
    
    @DeleteMapping("/user/delete/{userId}")
    public ApiResult deleteUserById(@PathVariable("userId") String userId) {    // 删除一个用户
        System.out.println("删除用户");
        return ApiResultHandler.success(userService.deleteById(userId));
    }
    
    @PutMapping("/user/update")
    public ApiResult updateUser(User user) {    // 更新一个用户
        System.out.println("更新用户");
        return ApiResultHandler.success(userService.updateUser(user));
    }
}

//    may the force be with you.
//    @ClassName   UserController
//    Created by 24 on 2023/5/14.
