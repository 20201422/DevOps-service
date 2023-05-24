package com.coop.devopsservice.designPattern.lrx_observerPattern;

import java.util.ArrayList;

public abstract class IterationState {
    private String iterationName;

    public IterationState(String iterationName) {
        this.iterationName = iterationName;
    }

    private String iterationState = "未开启";
    protected ArrayList<Observer> questions = new ArrayList<Observer>();
    public void addToIteration(Observer observer){
        questions.add(observer);
    }
    public void changeIterationState(String state){
        if(this.iterationState!=state){   //只有当状态发送改变才通知
            System.out.println("迭代的状态变为:"+state);
            notifyObserver(state);
        }
    }
    public abstract void notifyObserver(String iterationState);
    public String getIterationName() {
        return iterationName;
    }

    public void setIterationName(String iterationName) {
        this.iterationName = iterationName;
    }
}
