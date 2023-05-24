package com.coop.devopsservice.designPattern.CommandPattern;

public class SetTimeCommand extends Command{
    SetTime setTime;

    public SetTimeCommand() {
        setTime = new SetTime();
    }

    @Override
    public void execute() {
        setTime.doAction();
    }
}
