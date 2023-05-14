/**
 * @ClassName Sprint
 * @Author 24
 * @Date 2023/4/20 20:31
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.entity;

public class Sprint {
    
    private String sprintId;
    private String sprintName;
    private String sprintDescribe;
    private String sprintState;
    private String projectId;
    
    public Sprint() {
    }
    
    public Sprint(String sprintId, String sprintName, String sprintDescribe, String sprintState, String projectId) {
        this.sprintId = sprintId;
        this.sprintName = sprintName;
        this.sprintDescribe = sprintDescribe;
        this.sprintState = sprintState;
        this.projectId = projectId;
    }
    
    public String getSprintId() {
        return sprintId;
    }
    
    public void setSprintId(String sprintId) {
        this.sprintId = sprintId;
    }
    
    public String getSprintName() {
        return sprintName;
    }
    
    public void setSprintName(String sprintName) {
        this.sprintName = sprintName;
    }
    
    public String getSprintDescribe() {
        return sprintDescribe;
    }
    
    public void setSprintDescribe(String sprintDescribe) {
        this.sprintDescribe = sprintDescribe;
    }
    
    public String getSprintState() {
        return sprintState;
    }
    
    public void setSprintState(String sprintState) {
        this.sprintState = sprintState;
    }
    
    public String getProjectId() {
        return projectId;
    }
    
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}

//    may the force be with you.
//
//    Created by 24 on 2023/4/20.
