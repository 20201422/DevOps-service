package com.coop.devopsservice.designPattern.DecoratorPattern;

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
