package com.coop.devopsservice.designPattern.CommandPattern;

public class AddQuestionCommand extends Command{
    AddQuestion addQuestion;

    public AddQuestionCommand() {
        this.addQuestion = new AddQuestion();
    }

    @Override
    public void execute() {
        addQuestion.doAction();
    }
}
