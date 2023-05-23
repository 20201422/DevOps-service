/**
 * @ClassName EpicController
 * @Author 24
 * @Date 2023/5/18 21:18
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.controller.epicController;

import com.coop.devopsservice.designPattern.statePattern.EpicState;
import com.coop.devopsservice.entity.ApiResult;
import com.coop.devopsservice.entity.epicEntity.Epic;
import com.coop.devopsservice.serviceImpl.EpicServiceImpl;
import com.coop.devopsservice.serviceImpl.QuestionServiceImpl;
import com.coop.devopsservice.util.ApiResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("epic")
public class EpicController {
    
    private EpicServiceImpl epicService;
    private QuestionServiceImpl questionService;
    
    public EpicController() {
    }
    
    @Autowired
    public EpicController(EpicServiceImpl epicService, QuestionServiceImpl questionService) {
        this.epicService = epicService;
        this.questionService = questionService;
    }
    
    public EpicServiceImpl getEpicService() {
        return epicService;
    }
    
    public void setEpicService(EpicServiceImpl epicService) {
        this.epicService = epicService;
    }
    
    public QuestionServiceImpl getQuestionService() {
        return questionService;
    }
    
    public void setQuestionService(QuestionServiceImpl questionService) {
        this.questionService = questionService;
    }
    
    @GetMapping("/epics")
    public ApiResult findEpics() {    // 查找全部史诗
        System.out.println("查询全部史诗");
        return ApiResultHandler.success(epicService.findEpics());
    }
    
    @GetMapping("/epics/idAndName")
    public ApiResult findEpicsOnlyIdAndName() { // 查找史诗的id和名字
        System.out.println("查询史诗的id和名字");
        return ApiResultHandler.success(epicService.findEpicsOnlyIdAndName());
    }
    
    @GetMapping("/{questionId}")
    public ApiResult findEpicById(@PathVariable("questionId") String epicId) {  // 根据id查找史诗
        System.out.println("根据ID查找史诗");
        return ApiResultHandler.success(epicService.findEpicById(epicId));
    }
    
    @PostMapping("/add")
    public ApiResult addEpic(@RequestBody Epic epic) {    // 添加一个史诗
        System.out.println("添加史诗");
        epic = new EpicState(questionService) {
            @Override
            public String setQuestionState() {
                return null;
            }
        }.stateCheck(epic); // 检查史诗状态
        
        return ApiResultHandler.success(epicService.addEpic(epic));
    }
    
    @DeleteMapping("/delete/{questionId}")
    public ApiResult deleteEpicById(@PathVariable("questionId") String epicId) {    // 删除一个史诗
        System.out.println("删除史诗");
        return ApiResultHandler.success(epicService.deleteEpicById(epicId));
    }
    
    @PutMapping("/update")
    public ApiResult updateEpic(Epic epic) {    // 更新史诗
        System.out.println("更新史诗");
        return ApiResultHandler.success(epicService.updateEpic(epic));
    }
}

//    may the force be with you.
//    @ClassName   EpicController
//    Created by 24 on 2023/5/18.
