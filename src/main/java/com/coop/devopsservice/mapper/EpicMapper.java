/**
 * @ClassName EpicMapper
 * @Author 24
 * @Date 2023/5/14 17:00
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.mapper;

import com.coop.devopsservice.entity.epicEntity.Epic;
import com.coop.devopsservice.entity.epicEntity.EpicIdAndEpicName;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EpicMapper {
    
    @Select("select * from epic")
    List<Epic> findEpics();   // 查找所有史诗
    
    @Select("select epicId, epicName from epic")
    List<EpicIdAndEpicName> findEpicsOnlyIdAndName();   // 查找史诗的id和名字
    
    @Select("select * from epic where epicId = #{epicId}")
    Epic findEpicById(String epicId);   // 查找一个史诗根据id
    
    @Insert("insert into epic values(#{epicId}, #{epicName}, #{epicDescribe}, #{epicPriority}, #{epicState}, #{projectId}")
    int addEpic(Epic epic);     // 增加一个史诗
    
    @Delete("delete from epic where epicId = #{epicId}")
    int deleteEpicById(String epicId);  // 删除一个史诗
    
    @Update("update epic " +
            "set epicId = #{epicId}, epicName = #{epicName}, epicDescribe = #{epicDescribe}, " +
            "epicPriority = #{epicPriority}, epicState = #{epicState}, projectId = #{projectId} " +
            "where epicId = #{epicId}")
    int updateEpic(Epic epic);  // 更新历史信息

}

//    may the force be with you.
//    @ClassName   EpicMapper
//    Created by 24 on 2023/5/14.
