/**
 * @ClassName WorkList
 * @Author 24
 * @Date 2023/4/20 20:33
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.entity;

import java.util.ArrayList;
import java.util.List;

public class WorkList {
    
    private List<SprintList> sprintLists;
    private String beginTime;
    private String endTime;
    
    public WorkList() {
    }
    
    public WorkList(List<SprintList> sprintLists) {
        this.sprintLists = sprintLists;
    }
    
    public WorkList(List<SprintList> sprintLists, String beginTime, String endTime) {
        this.sprintLists = sprintLists;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }
    
    public List<SprintList> getSpringLists() {
        return sprintLists;
    }
    
    public void setSpringLists(List<SprintList> sprintLists) {
        this.sprintLists = sprintLists;
    }
    
    public String getBeginTime() {
        return beginTime;
    }
    
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }
    
    public String getEndTime() {
        return endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    
    public List<SprintList> addSpringList(SprintList sprintList) {  // 添加冲刺列表
        if (sprintLists == null) {
            sprintLists = new ArrayList<>();
        }
        sprintLists.add(sprintList);
        return sprintLists;
    }
    
    public void removeSpringList(SprintList sprintList) {   // 移除冲刺列表
        if (sprintLists != null) {
            sprintLists.remove(sprintList);
        }
    }
}

//    may the force be with you.
//
//    Created by 24 on 2023/4/20.
