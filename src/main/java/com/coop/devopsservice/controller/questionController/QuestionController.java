/**
 * @ClassName QuestionController
 * @Author 24
 * @Date 2023/5/18 21:08
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.controller.questionController;

import com.coop.devopsservice.entity.ApiResult;
import com.coop.devopsservice.entity.questionEntity.Question;
import com.coop.devopsservice.serviceImpl.QuestionServiceImpl;
import com.coop.devopsservice.util.ApiResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question")
public class QuestionController {
    
    private QuestionServiceImpl questionService;
    
    public QuestionController() {
    }
    
    @Autowired
    public QuestionController(QuestionServiceImpl questionService) {
        this.questionService = questionService;
    }

    public QuestionServiceImpl getQuestionService() {
        return questionService;
    }
    
    public void setQuestionService(QuestionServiceImpl questionService) {
        this.questionService = questionService;
    }
    
    @GetMapping("/questions")
    public ApiResult findQuestions() {    // 查找全部问题
        System.out.println("查询全部问题");
        return ApiResultHandler.success(questionService.findQuestions());
    }
    
    @GetMapping("/{questionId}")
    public ApiResult findQuestionById(@PathVariable("questionId") String questionId) {  // 根据id查找问题
        System.out.println("根据ID查找问题");
        return ApiResultHandler.success(questionService.findQuestionById(questionId));
    }
    
    @PostMapping("/add")
    public ApiResult addQuestion(Question question) {    // 添加一个问题
        System.out.println("添加问题");
        return ApiResultHandler.success(questionService.addQuestion(question));
    }
    
    @DeleteMapping("/delete/{questionId}")
    public ApiResult deleteQuestionById(@PathVariable("questionId") String questionId) {    // 删除一个问题
        System.out.println("删除问题");
        return ApiResultHandler.success(questionService.deleteQuestionById(questionId));
    }
    
    @PutMapping("/update")
    public ApiResult updateQuestion(Question question) {    // 更新问题
        System.out.println("更新问题");
        return ApiResultHandler.success(questionService.updateQuestion(question));
    }
}

//    may the force be with you.
//    @ClassName   QuestionController
//    Created by 24 on 2023/5/18.
