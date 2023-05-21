/**
 * @ClassName EpicService
 * @Author 24
 * @Date 2023/5/14 17:04
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.service;

import com.coop.devopsservice.entity.Epic;

import java.util.List;

public interface EpicService {

    List<Epic> findEpics();
    Epic findEpicById(String epicId);
    int addEpic(Epic epic);
    int deleteEpicById(String epicId);
    int updateEpic(Epic epic);

}

//    may the force be with you.
//    @ClassName   EpicService
//    Created by 24 on 2023/5/14.
