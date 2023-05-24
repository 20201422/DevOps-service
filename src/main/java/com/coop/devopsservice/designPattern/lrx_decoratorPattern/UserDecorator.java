package com.coop.devopsservice.designPattern.lrx_decoratorPattern;

public class UserDecorator extends User{
    private User user;

    public UserDecorator(User user) {
        this.user = user;
    }

    @Override
    public void duty() {
        this.user.duty();
    }
}
