package com.coop.devopsservice.designPattern.BridgePattern;

public class QuestionUnderway extends QuestionFilter{
    public QuestionUnderway(Priority priority) {
        super(priority);
    }

    @Override
    public void showQuestions() {
        System.out.println("问题筛选条件为----状态：实现中 优先级："+super.priority.getPriority());
    }
}
