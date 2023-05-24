/**
 * @ClassName FastQuestionFactory
 * @Author 24
 * @Date 2023/5/22 21:45
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.designPattern.kp_factoryPattern;

public class FastQuestionFactory implements FastModelFactory {
    
    private String questionId;
    private String questionName;
    private String questionPriority;
    private String userId;
    
    public FastQuestionFactory() {
    }
    
    public FastQuestionFactory(String questionId, String questionName, String questionPriority, String userId) {
        this.questionId = questionId;
        this.questionName = questionName;
        this.questionPriority = questionPriority;
        this.userId = userId;
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
    
    public String getQuestionPriority() {
        return questionPriority;
    }
    
    public void setQuestionPriority(String questionPriority) {
        this.questionPriority = questionPriority;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    @Override
    public FastModel createFastModel() {
        return new FastQuestion(questionId, questionName, questionPriority, userId);
    }
}

//    may the force be with you.
//    @ClassName   FastQuestionFactory
//    Created by 24 on 2023/5/22.
