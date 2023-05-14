/**
 * @ClassName EpicList
 * @Author 24
 * @Date 2023/4/20 20:31
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.entity;

import java.util.ArrayList;
import java.util.List;

public class EpicList {

    private Epic epic;
    private List<Question> questions;
    
    public EpicList() {
    }
    
    public EpicList(Epic epic) {
        this.epic = epic;
    }
    
    public EpicList(Epic epic, List<Question> questions) {
        this.epic = epic;
        this.questions = questions;
    }
    
    public Epic getEpic() {
        return epic;
    }
    
    public void setEpic(Epic epic) {
        this.epic = epic;
    }
    
    public List<Question> getQuestions() {
        return questions;
    }
    
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
    
    public List<Question> addQuestion(Question question) {  // 添加问题
        if (questions == null)
            questions = new ArrayList<>();
        questions.add(question);
        return questions;
    }
    
    public void removeQuestion(Question question) { // 移除问题
        if (questions != null) {
            questions.remove(question);
        }
    }
}

//    may the force be with you.
//
//    Created by 24 on 2023/4/20.
