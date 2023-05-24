package com.coop.devopsservice.designPattern.lrx_observerPattern;

public class ConcreteIterationState extends IterationState{
    public ConcreteIterationState(String iterationName) {
        super(iterationName);
    }

    @Override
    public void notifyObserver(String iterationState) {
        for(Object obj : questions){
            ((Observer)obj).changePermission(iterationState);
        }
    }
}
