/**
 * @ClassName QuestionServiceImpl
 * @Author 24
 * @Date 2023/5/14 17:08
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.serviceImpl;

import com.coop.devopsservice.entity.questionEntity.Question;
import com.coop.devopsservice.mapper.QuestionMapper;
import com.coop.devopsservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    
    private QuestionMapper questionMapper;
    
    public QuestionServiceImpl() {
    }
    
    @Autowired
    public QuestionServiceImpl(QuestionMapper questionMapper) {
        this.questionMapper = questionMapper;
    }
    
    public QuestionMapper getQuestionMapper() {
        return questionMapper;
    }
    
    public void setQuestionMapper(QuestionMapper questionMapper) {
        this.questionMapper = questionMapper;
    }
    
    @Override
    public List<Question> findQuestions() { // 查找所有问题
        return questionMapper.findQuestions();
    }
    
    @Override
    public Question findQuestionById(String questionId) {   // 查找一个问题根据id
        return questionMapper.findQuestionById(questionId);
    }
    
    @Override
    public int addQuestion(Question question) { // 增加一个问题
        return questionMapper.addQuestion(question);
    }
    
    @Override
    public int deleteQuestionById(String questionId) {  // 删除一个问题
        return questionMapper.deleteQuestionById(questionId);
    }
    
    @Override
    public int updateQuestion(Question question) {  // 更新问题信息
        return questionMapper.updateQuestion(question);
    }
}

//    may the force be with you.
//    @ClassName   QuestionServiceImpl
//    Created by 24 on 2023/5/14.
