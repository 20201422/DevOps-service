/**
 * @ClassName Epic
 * @Author 24
 * @Date 2023/4/20 20:31
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.entity;

public class Epic {
    
    private String epicId;
    private String epicName;
    private String epicDescribe;
    private String epicPriority;
    private String epicState;
    private String projectId;
    
    public Epic() {
    }
    
    public Epic(String epicId, String epicName, String epicDescribe, String epicPriority, String epicState, String projectId) {
        this.epicId = epicId;
        this.epicName = epicName;
        this.epicDescribe = epicDescribe;
        this.epicPriority = epicPriority;
        this.epicState = epicState;
        this.projectId = projectId;
    }
    
    public String getEpicId() {
        return epicId;
    }
    
    public void setEpicId(String epicId) {
        this.epicId = epicId;
    }
    
    public String getEpicName() {
        return epicName;
    }
    
    public void setEpicName(String epicName) {
        this.epicName = epicName;
    }
    
    public String getEpicDescribe() {
        return epicDescribe;
    }
    
    public void setEpicDescribe(String epicDescribe) {
        this.epicDescribe = epicDescribe;
    }
    
    public String getEpicPriority() {
        return epicPriority;
    }
    
    public void setEpicPriority(String epicPriority) {
        this.epicPriority = epicPriority;
    }
    
    public String getEpicState() {
        return epicState;
    }
    
    public void setEpicState(String epicState) {
        this.epicState = epicState;
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
