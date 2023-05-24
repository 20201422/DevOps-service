package com.coop.devopsservice.designPattern.lrx_bridgePattern;
public class Client {
    public static void main(String[] args) {
        QuestionFilter questionStatus1,questionStatus2,questionStatus3;
        Priority priority1 = new HighPriority();
        Priority priority2 = new MiddlePriority();
        Priority priority3 = new LowPriority();
        questionStatus1 = new QuestionToBeCompleted(priority1);
        questionStatus1.showQuestions();
    }

}
