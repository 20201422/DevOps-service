package com.coop.devopsservice.designPattern.BridgePattern;

public class QuestionCompleted extends QuestionFilter{
    public QuestionCompleted(Priority priority) {
        super(priority);
    }

    @Override
    public void showQuestions() {
        System.out.println("问题筛选条件为----状态：已实现 优先级："+super.priority.getPriority());
    }
}
