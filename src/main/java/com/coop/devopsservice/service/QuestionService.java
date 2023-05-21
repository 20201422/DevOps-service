/**
 * @ClassName QuestionService
 * @Author 24
 * @Date 2023/5/14 17:05
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.service;

import com.coop.devopsservice.entity.questionEntity.Question;

import java.util.List;

public interface QuestionService {
    
    List<Question> findQuestions();
    Question findQuestionById(String questionId);
    int addQuestion(Question question);
    int deleteQuestionById(String questionId);
    int updateQuestion(Question question);

}

//    may the force be with you.
//    @ClassName   QuestionService
//    Created by 24 on 2023/5/14.
