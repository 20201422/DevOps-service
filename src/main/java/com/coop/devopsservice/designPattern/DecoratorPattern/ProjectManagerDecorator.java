package com.coop.devopsservice.designPattern.DecoratorPattern;

public class ProjectManagerDecorator extends UserDecorator{
    public ProjectManagerDecorator(User user) {
        super(user);
    }
    public void duty(){
        this.setProjectManager();
        super.duty();
    }
    public void setProjectManager(){
        System.out.println("该用户的权限变为项目经理");
    }
}
