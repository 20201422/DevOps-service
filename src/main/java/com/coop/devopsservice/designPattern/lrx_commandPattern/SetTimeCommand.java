package com.coop.devopsservice.designPattern.lrx_commandPattern;

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
