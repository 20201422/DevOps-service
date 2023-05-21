/**
 * @ClassName EpicServiceImpl
 * @Author 24
 * @Date 2023/5/14 17:07
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.serviceImpl;

import com.coop.devopsservice.entity.Epic;
import com.coop.devopsservice.mapper.EpicMapper;
import com.coop.devopsservice.service.EpicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpicServiceImpl implements EpicService {
    
    private EpicMapper epicMapper;
    
    public EpicServiceImpl() {
    }
    
    @Autowired
    public EpicServiceImpl(EpicMapper epicMapper) {
        this.epicMapper = epicMapper;
    }
    
    public EpicMapper getEpicMapper() {
        return epicMapper;
    }
    
    public void setEpicMapper(EpicMapper epicMapper) {
        this.epicMapper = epicMapper;
    }
    
    @Override
    public List<Epic> findEpics() { // 查找所有史诗
        return epicMapper.findEpics();
    }
    
    @Override
    public Epic findEpicById(String epicId) {   // 查找一个史诗根据Id
        return epicMapper.findEpicById(epicId);
    }
    
    @Override
    public int addEpic(Epic epic) { // 增加一个史诗
        return epicMapper.addEpic(epic);
    }
    
    @Override
    public int deleteEpicById(String epicId) {  // 删除一个历史
        return epicMapper.deleteEpicById(epicId);
    }
    
    @Override
    public int updateEpic(Epic epic) {  // 更新史诗信息
        return epicMapper.updateEpic(epic);
    }
}

//    may the force be with you.
//    @ClassName   EpicServiceImpl
//    Created by 24 on 2023/5/14.
