package com.coop.devopsservice.designPattern.BridgePattern;

public abstract class QuestionFilter {
    Priority priority;

    public QuestionFilter(Priority priority) {
        this.priority = priority;
    }
    public abstract void showQuestions();
}
