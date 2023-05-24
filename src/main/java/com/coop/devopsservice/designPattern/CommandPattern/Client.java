package com.coop.devopsservice.designPattern.CommandPattern;

public class Client {
    public static void main(String[] args) {
        SetTimeCommand setTime = new SetTimeCommand();
        AddQuestionCommand addQuestion = new AddQuestionCommand();
        setTime.execute();
        addQuestion.execute();
    }
}
