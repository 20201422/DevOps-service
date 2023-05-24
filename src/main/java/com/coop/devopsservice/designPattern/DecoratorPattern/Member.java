package com.coop.devopsservice.designPattern.DecoratorPattern;

public class Member extends User{
    @Override
    void duty() {
        System.out.println("用户已更新！");
    }
}
