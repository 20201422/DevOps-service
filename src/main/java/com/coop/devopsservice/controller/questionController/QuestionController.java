/**
 * @ClassName QuestionController
 * @Author 24
 * @Date 2023/5/18 21:08
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.controller.questionController;

import com.coop.devopsservice.designPattern.factoryPattern.FastModel;
import com.coop.devopsservice.designPattern.factoryPattern.FastModelFactory;
import com.coop.devopsservice.designPattern.factoryPattern.FastQuestionFactory;
import com.coop.devopsservice.designPattern.flyweightPattern.QuestionFactory;
import com.coop.devopsservice.designPattern.statePattern.EpicState;
import com.coop.devopsservice.entity.ApiResult;
import com.coop.devopsservice.entity.epicEntity.Epic;
import com.coop.devopsservice.entity.questionEntity.Question;
import com.coop.devopsservice.serviceImpl.EpicServiceImpl;
import com.coop.devopsservice.serviceImpl.QuestionServiceImpl;
import com.coop.devopsservice.util.ApiResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/question")
public class QuestionController {
    
    private QuestionServiceImpl questionService;
    private EpicServiceImpl epicService;
    
    public QuestionController() {
    }
    
    @Autowired
    public QuestionController(QuestionServiceImpl questionService) {
        this.questionService = questionService;
    }
    public QuestionController(EpicServiceImpl epicService) {
        this.epicService = epicService;
    }
    public QuestionController(QuestionServiceImpl questionService, EpicServiceImpl epicService) {
        this.questionService = questionService;
        this.epicService = epicService;
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
        
        QuestionFactory questionFactory = QuestionFactory.getInstance();    // 获取享元工厂对象
        
        question.setQuestionState(Objects.requireNonNull(questionFactory.getQuestionState("规划中")).getQuestionState());
        
        return ApiResultHandler.success(questionService.addQuestion(question));
    }
    
    @PostMapping("/fastAdd")
    public ApiResult addFastQuestion(String questionId, String questionName,
                                     String questionPriority, String userId) {   // 快速添加一个问题
        System.out.println("快速添加问题");
        
        FastModelFactory fastQuestionFactory = new FastQuestionFactory(questionId, questionName, questionPriority, userId);
        FastModel fastQuestion = fastQuestionFactory.createFastModel();
        Question question = (Question) fastQuestion.addFastModel();
        
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
    
    @PutMapping("/update/state")
    public ApiResult updateQuestionState(String questionId, String state) { // 更新问题的状态
        System.out.println("更新问题的状态");
        Question question = questionService.findQuestionById(questionId);   // 找到问题
        
        QuestionFactory questionFactory = QuestionFactory.getInstance();    // 获取享元工厂对象
        
        question.setQuestionState(Objects.requireNonNull(questionFactory.getQuestionState(state)).getQuestionState());
        
        Epic epic = epicService.findEpicById(question.getEpicId()); // 找到问题对应的史诗
        
        if (epic != null) { // 如果存在史诗
            
            String epicState = epic.getEpicState(); // 获取史诗状态
            epic = new EpicState() {
                @Override
                public String setQuestionState() {
                    return null;
                }
            }.stateCheck(epic); // 检查史诗状态
            
            if (!Objects.equals(epic.getEpicState(), epicState)) {  // 如果状态发生改变了
                epicService.updateEpic(epic);   // 改变史诗状态
            }
        }
        
        return ApiResultHandler.success(questionService.updateQuestion(question));
    }
}

//    may the force be with you.
//    @ClassName   QuestionController
//    Created by 24 on 2023/5/18.
