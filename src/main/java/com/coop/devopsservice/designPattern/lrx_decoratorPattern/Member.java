package com.coop.devopsservice.designPattern.lrx_decoratorPattern;

public class Member extends User{
    @Override
    void duty() {
        System.out.println("用户已更新！");
    }
}
