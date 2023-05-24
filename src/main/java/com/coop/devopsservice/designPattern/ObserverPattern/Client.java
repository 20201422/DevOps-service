package com.coop.devopsservice.designPattern.ObserverPattern;

public class Client {
    public static void main(String[] args) {
        IterationState iterationState = new ConcreteIterationState("迭代1") ;
        Observer question1 = new QuestionPermission("问题1");
        Observer question2 = new QuestionPermission("问题2");
        Observer question3 = new QuestionPermission("问题3");
        Observer question4 = new QuestionPermission("问题4");
        iterationState.addToIteration(question1);
        iterationState.addToIteration(question2);
        iterationState.addToIteration(question3);
        iterationState.addToIteration(question4);
        iterationState.changeIterationState("已开启");
        iterationState.changeIterationState("已关闭");
    }
}
