package com.coop.devopsservice.designPattern.lrx_decoratorPattern;

public class GroupLeaderDecorator extends UserDecorator{
    public GroupLeaderDecorator(User user) {
        super(user);
    }

    @Override
    public void duty() {
        this.setGroupLeader();
        super.duty();
    }
    public void setGroupLeader(){
        System.out.println("该用户的权限变为项目组长");
    }
}
