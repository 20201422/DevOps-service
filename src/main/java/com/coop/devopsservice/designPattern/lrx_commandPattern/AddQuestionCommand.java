package com.coop.devopsservice.designPattern.lrx_commandPattern;

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
