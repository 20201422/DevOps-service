/**
 * @ClassName Project
 * @Author 24
 * @Date 2023/4/20 20:31
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.entity.projectEntity;

import com.coop.devopsservice.entity.userEntity.User;

import java.util.ArrayList;
import java.util.List;

public class Project {
    
    private String projectId;
    private String projectName;
    private String projectDescribe;
    private List<User> users;
    
    public Project() {
    }
    
    public Project(String projectId, String projectName, String projectDescribe) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDescribe = projectDescribe;
    }
    
    public Project(String projectId, String projectName, String projectDescribe, List<User> users) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDescribe = projectDescribe;
        this.users = users;
    }
    
    public String getProjectId() {
        return projectId;
    }
    
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public String getProjectName() {
        return projectName;
    }
    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    public String getProjectDescribe() {
        return projectDescribe;
    }
    
    public void setProjectDescribe(String projectDescribe) {
        this.projectDescribe = projectDescribe;
    }
    
    public List<User> getUsers() {
        return users;
    }
    
    public void setUsers(List<User> users) {
        this.users = users;
    }
    
    public List<User> addUser(User user) {  // 添加用户
        if (users == null)
            users = new ArrayList<>();
        users.add(user);
        return users;
    }
    
    public void removeUser(User user) { // 移除用户
        if (users != null)
            users.remove(user);
    }
    
    @Override
    public String toString() {
        return "Project{" +
                "projectId='" + projectId + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectDescribe='" + projectDescribe + '\'' +
                ", users=" + users +
                '}';
    }
}

//    may the force be with you.
//
//    Created by 24 on 2023/4/20.
