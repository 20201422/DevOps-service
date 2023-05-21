/**
 * @ClassName EpicController
 * @Author 24
 * @Date 2023/5/18 21:18
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.controller;

import com.coop.devopsservice.entity.ApiResult;
import com.coop.devopsservice.entity.Epic;
import com.coop.devopsservice.serviceImpl.EpicServiceImpl;
import com.coop.devopsservice.util.ApiResultHandler;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("epic")
public class EpicController {
    
    private EpicServiceImpl epicService;
    
    public EpicController() {
    }
    
    public EpicController(EpicServiceImpl epicService) {
        this.epicService = epicService;
    }
    
    public EpicServiceImpl getEpicService() {
        return epicService;
    }
    
    public void setEpicService(EpicServiceImpl epicService) {
        this.epicService = epicService;
    }
    
    @GetMapping("/epics")
    public ApiResult findEpics() {    // 查找全部史诗
        System.out.println("查询全部史诗");
        return ApiResultHandler.success(epicService.findEpics());
    }
    
    @GetMapping("/{questionId}")
    public ApiResult findEpicById(@PathVariable("questionId") String epicId) {  // 根据id查找史诗
        System.out.println("根据ID查找史诗");
        return ApiResultHandler.success(epicService.findEpicById(epicId));
    }
    
    @PostMapping("/add")
    public ApiResult addEpic(Epic epic) {    // 添加一个史诗
        System.out.println("添加史诗");
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
