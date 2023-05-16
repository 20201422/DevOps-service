/**
 * @ClassName Question
 * @Author 24
 * @Date 2023/4/20 20:31
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.entity;

public class Question {
    
    private String questionId;
    private String questionName;
    private String questionDescribe;
    private String questionPriority;
    private String questionState;
    private String projectId;
    private String userId;
    private String epicId;
    private String sprintId;
    
    public Question() {
    }
    
    public Question(String questionId, String questionName, String questionDescribe, String questionPriority, String questionState) {
        this.questionId = questionId;
        this.questionName = questionName;
        this.questionDescribe = questionDescribe;
        this.questionPriority = questionPriority;
        this.questionState = questionState;
    }
    
    public Question(String questionId, String questionName, String questionDescribe, String questionPriority, String questionState, String projectId, String userId, String epicId, String sprintId) {
        this.questionId = questionId;
        this.questionName = questionName;
        this.questionDescribe = questionDescribe;
        this.questionPriority = questionPriority;
        this.questionState = questionState;
        this.projectId = projectId;
        this.userId = userId;
        this.epicId = epicId;
        this.sprintId = sprintId;
    }
    
    public String getQuestionId() {
        return questionId;
    }
    
    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }
    
    public String getQuestionName() {
        return questionName;
    }
    
    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }
    
    public String getQuestionDescribe() {
        return questionDescribe;
    }
    
    public void setQuestionDescribe(String questionDescribe) {
        this.questionDescribe = questionDescribe;
    }
    
    public String getQuestionPriority() {
        return questionPriority;
    }
    
    public void setQuestionPriority(String questionPriority) {
        this.questionPriority = questionPriority;
    }
    
    public String getQuestionState() {
        return questionState;
    }
    
    public void setQuestionState(String questionState) {
        this.questionState = questionState;
    }
    
    public String getProjectId() {
        return projectId;
    }
    
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getEpicId() {
        return epicId;
    }
    
    public void setEpicId(String epicId) {
        this.epicId = epicId;
    }
    
    public String getSprintId() {
        return sprintId;
    }
    
    public void setSprintId(String sprintId) {
        this.sprintId = sprintId;
    }
    
    @Override
    public String toString() {
        return "Question{" +
                "questionId='" + questionId + '\'' +
                ", questionName='" + questionName + '\'' +
                ", questionDescribe='" + questionDescribe + '\'' +
                ", questionPriority='" + questionPriority + '\'' +
                ", questionState='" + questionState + '\'' +
                ", projectId='" + projectId + '\'' +
                ", userId='" + userId + '\'' +
                ", epicId='" + epicId + '\'' +
                ", sprintId='" + sprintId + '\'' +
                '}';
    }
}

//    may the force be with you.
//
//    Created by 24 on 2023/4/20.
