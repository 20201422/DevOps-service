package com.coop.devopsservice.controller.iterationController;

import com.coop.devopsservice.entity.ApiResult;
import com.coop.devopsservice.entity.iterationEntity.Iteration;
import com.coop.devopsservice.serviceImpl.IterationServiceImpl;
import com.coop.devopsservice.util.ApiResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/iteration")
public class IterationController {
    private IterationServiceImpl iterationService;
    public IterationController() {
    }
    @Autowired
    public IterationController(IterationServiceImpl iterationService) {
        this.iterationService = iterationService;
    }
    
    @GetMapping("/iterations")
    public ApiResult findIterations() {    // 查找全部迭代
        System.out.println("查询全部迭代");
        return ApiResultHandler.success(iterationService.findIterations());
    }
    @PostMapping("/add")
    public ApiResult addIteration(@RequestBody Iteration iteration){   //添加迭代
        System.out.println("添加迭代");
        return ApiResultHandler.success(iterationService.addIteration(iteration));
    }
    @GetMapping("/{iterationId}")
    public ApiResult findQuestionById(@PathVariable("iterationId") int iterationId) {  // 根据id查找迭代
        System.out.println("根据ID查找迭代");
        return ApiResultHandler.success(iterationService.findIterationById(iterationId));
    }
    //将问题添加到迭代，即更新问题的iterationId
    @GetMapping("/addToIteration")
    public ApiResult addQuestionToIterationById(@RequestParam("questionId") String questionId,@RequestParam("iterationId") int iterationId){;
        return ApiResultHandler.success(iterationService.addQuestionToIterationById(questionId, iterationId));
    }

    @GetMapping("/find/{iterationName}")   //为什么要加个find？因为不加会和findQuestionById冲突，前端会不知道选哪个方法
    public ApiResult findIdByName(@PathVariable("iterationName") String iterationName){
        return ApiResultHandler.success(iterationService.findIdByName(iterationName));
    }
    @GetMapping("/getOpenedIteration")
    public ApiResult findOpenedIteration(){
        return ApiResultHandler.success(iterationService.findOpenedIteration());

    }
}
