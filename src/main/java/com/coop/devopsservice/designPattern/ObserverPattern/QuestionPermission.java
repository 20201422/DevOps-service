package com.coop.devopsservice.designPattern.ObserverPattern;

public class QuestionPermission implements Observer{
    private String name ;
    private String  permission= "不可操作";

    public QuestionPermission(String name) {
        this.name = name;
    }

    @Override
    public void changePermission(String iterationState) {
        if(iterationState.equals("已开启")){
            this.permission = "可操作";
        }else {
            this.permission = "不可操作";
        }
        System.out.println(name+"的权限为："+this.permission);
    }
}
