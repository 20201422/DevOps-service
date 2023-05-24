/**
 * @ClassName BuilderController
 * @Author 24
 * @Date 2023/5/22 20:50
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.designPattern.kp_builderPattern;

import com.coop.devopsservice.entity.questionEntity.Question;

public class BuilderController {
    
    public BuilderController() {
    }
    
    public Question construct(BuilderQuestion builderQuestion) {
        
        builderQuestion.buildQuestionId();
        builderQuestion.buildQuestionName();
        builderQuestion.buildQuestionPriority();
        builderQuestion.buildUserId();
        builderQuestion.buildQuestionState();
        
        return builderQuestion.createQuestion();
    }
    
}

//    may the force be with you.
//    @ClassName   BuilderController
//    Created by 24 on 2023/5/22.
