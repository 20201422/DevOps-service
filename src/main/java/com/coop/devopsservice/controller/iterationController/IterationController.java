package com.coop.devopsservice.controller.iterationController;

import com.coop.devopsservice.entity.ApiResult;
import com.coop.devopsservice.entity.iterationEntity.Iteration;
import com.coop.devopsservice.serviceImpl.IterationServiceImpl;
import com.coop.devopsservice.util.ApiResultHandler;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/iteration")
public class IterationController {
    private IterationServiceImpl iterationService;
    public IterationController() {
    }
    
    public IterationController(IterationServiceImpl iterationService) {
        this.iterationService = iterationService;
    }
    
    @GetMapping("/iterations")
    public ApiResult findIterations() {    // 查找全部迭代
        System.out.println("查询全部迭代");
        return ApiResultHandler.success(iterationService.findIterations());
    }
    @PostMapping("/add")
    public ApiResult addIteration(Iteration iteration){   //添加迭代
        System.out.println("添加迭代");
        iterationService.addIteration(iteration);
        return ApiResultHandler.success(iterationService.addIteration(iteration));
    }
    @GetMapping("/{iterationId}")
    public ApiResult findQuestionById(@PathVariable("iterationId") int iterationId) {  // 根据id查找迭代
        System.out.println("根据ID查找迭代");
        return ApiResultHandler.success(iterationService.findIterationById(iterationId));
    }

}
