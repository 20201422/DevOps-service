package com.coop.devopsservice.entity;

import java.util.Date;

public class Iteration {
    private int iterationId;
    private String iterationName;
    private String iterationDescribe;
    private String iterationState;
    private Date startTime;
    private Date endTime;
    private int projectId;

    public Iteration(int iterationId, String iterationName, String iterationDescribe, String iterationState, Date startTime, Date endTime, int projectId) {
        this.iterationId = iterationId;
        this.iterationName = iterationName;
        this.iterationDescribe = iterationDescribe;
        this.iterationState = iterationState;
        this.startTime = startTime;
        this.endTime = endTime;
        this.projectId = projectId;
    }

    public Iteration() {
    }

    public int getIterationId() {
        return iterationId;
    }

    public void setIterationId(int iterationId) {
        this.iterationId = iterationId;
    }

    public String getIterationName() {
        return iterationName;
    }

    public void setIterationName(String iterationName) {
        this.iterationName = iterationName;
    }

    public String getIterationDescribe() {
        return iterationDescribe;
    }

    public void setIterationDescribe(String iterationDescribe) {
        this.iterationDescribe = iterationDescribe;
    }

    public String getIterationState() {
        return iterationState;
    }

    public void setIterationState(String iterationState) {
        this.iterationState = iterationState;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
}
