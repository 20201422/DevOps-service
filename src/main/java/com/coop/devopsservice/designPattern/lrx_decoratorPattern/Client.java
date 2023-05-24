package com.coop.devopsservice.designPattern.lrx_decoratorPattern;

public class Client {
    public static void main(String[] args) {
        User user,groupLeader,projectManager;
        user = new Member();
        groupLeader = new GroupLeaderDecorator(user);  //升级权限

        projectManager = new ProjectManagerDecorator(groupLeader);  //升级权限
        projectManager.duty();
    }
}
