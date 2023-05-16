/**
 * @ClassName SprintList
 * @Author 24
 * @Date 2023/4/20 20:31
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.entity;

import java.util.ArrayList;
import java.util.List;

public class SprintList {
    
    private Sprint sprint;
    private List<Question> questions;
    
    public SprintList() {
    }
    
    public SprintList(Sprint sprint) {
        this.sprint = sprint;
    }
    
    public SprintList(Sprint sprint, List<Question> questions) {
        this.sprint = sprint;
        this.questions = questions;
    }
    
    public Sprint getSprint() {
        return sprint;
    }
    
    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }
    
    public List<Question> getQuestions() {
        return questions;
    }
    
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
    
    public List<Question> addQuestion(Question question) {   // 添加问题
        if (questions == null)
            questions = new ArrayList<>();
        questions.add(question);
        return questions;
    }
    
    public void removeQuestion(Question question) {  // 移除问题
        if (questions != null) {
            questions.remove(question);
        }
    }
    
    @Override
    public String toString() {
        return "SprintList{" +
                "sprint=" + sprint +
                ", questions=" + questions +
                '}';
    }
}

//    may the force be with you.
//
//    Created by 24 on 2023/4/20.
