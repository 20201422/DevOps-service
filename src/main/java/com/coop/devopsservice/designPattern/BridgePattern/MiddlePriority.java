package com.coop.devopsservice.designPattern.BridgePattern;

public class MiddlePriority extends Priority{
    @Override
    String getPriority() {
        return "中";
    }
}
