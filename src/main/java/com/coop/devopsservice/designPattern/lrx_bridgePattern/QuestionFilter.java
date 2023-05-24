package com.coop.devopsservice.designPattern.lrx_bridgePattern;

public abstract class QuestionFilter {
    Priority priority;

    public QuestionFilter(Priority priority) {
        this.priority = priority;
    }
    public abstract void showQuestions();
}
