/**
 * @ClassName QuestionState
 * @Author 24
 * @Date 2023/5/18 21:31
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.designPattern.statePattern;

import com.coop.devopsservice.entity.epicEntity.Epic;
import com.coop.devopsservice.entity.questionEntity.Question;
import com.coop.devopsservice.serviceImpl.QuestionServiceImpl;

import java.util.List;
import java.util.Objects;

public abstract class EpicState {
    
    public abstract String setQuestionState();
    
    public Epic stateCheck(Epic epic) {
        List<Question> questions = new QuestionServiceImpl().findQuestionsByEpicId(epic.getEpicId());
        
        if (questions.size() == 0) {    // 该史诗下没有问题，那么状态就是“规划中”
            epic.setEpicState(new EpicToBeCompletedState().setQuestionState());
            return epic;
        }
        
        // 统计问题状态情况
        int toBeCompleted = 0, underway = 0, completed = 0;
        for (Question question: questions) {
            if (Objects.equals(question.getQuestionState(), "规划中")) {
                toBeCompleted++;
            } else if (Objects.equals(question.getQuestionState(), "实现中")) {
                underway++;
            } else if (Objects.equals(question.getQuestionState(), "已实现")) {
                completed++;
            }
        }
        
        if (toBeCompleted == questions.size()) {    // 都是规划中
            epic.setEpicState(new EpicToBeCompletedState().setQuestionState()); // 史诗状态为“规划中”
        }
        if (completed == questions.size()) {    // 都是已实现
            epic.setEpicState(new EpicCompletedState().setQuestionState()); // 史诗状态为“已实现”
        }
        if (underway > 0) { // 存在实现中的问题
            epic.setEpicState(new EpicUnderwayState().setQuestionState());  // 史诗状态为“实现中”
        }
        
        return epic;
    }
    
}

//    may the force be with you.
//    @ClassName   QuestionState
//    Created by 24 on 2023/5/18.
