package com.coop.devopsservice.designPattern.BridgePattern;

public class HighPriority extends Priority{

    @Override
    String getPriority() {
        return "高";
    }
}
