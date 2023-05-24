package com.coop.devopsservice.designPattern.BridgePattern;

public class QuestionToBeCompleted extends QuestionFilter{
    public QuestionToBeCompleted(Priority priority) {
        super(priority);
    }

    @Override
    public void showQuestions() {
        System.out.println("问题筛选条件为----状态：规划中 优先级："+super.priority.getPriority());
    }
}
