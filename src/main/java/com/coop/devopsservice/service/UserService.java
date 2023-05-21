/**
 * @ClassName UserService
 * @Author 24
 * @Date 2023/5/14 17:06
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.service;

import com.coop.devopsservice.entity.User;

import java.util.List;

public interface UserService {

    List<User> findUsers();
    User findUserById(String userId);
    int addUser(User user);
    int deleteById(String userId);
    int updateUser(User user);
}

//    may the force be with you.
//    @ClassName   UserService
//    Created by 24 on 2023/5/14.
