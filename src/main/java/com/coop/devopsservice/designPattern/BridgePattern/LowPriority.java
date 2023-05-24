package com.coop.devopsservice.designPattern.BridgePattern;

public class LowPriority extends Priority{
    @Override
    String getPriority() {
        return "低";
    }
}
