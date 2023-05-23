package com.coop.devopsservice.mapper;

import com.coop.devopsservice.entity.iterationEntity.Iteration;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface IterationMapper {
    @Select("select * from iteration")
    List<Iteration> findIterations();   //查询所有迭代

    @Select("select * from iteration where iterationId = #{iterationId}")
    Iteration findIterationById(int iterationId);   //根据id查询迭代

    @Insert("insert into iteration values(#{iterationId},#{iterationName},#{iterationDescribe}," +
            "#{iterationState},#{startTime},#{endTime},#{projectId})")
    int addIteration(Iteration iteration);

    @Delete("delete from iteration where iterationId = #{iterationId}")
    int deleteIterationById(int iterationId);  //根据id删除迭代

    @Update("update iteration" +
            "set iterationId = #{iterationId},iterationName = #{iterationName}," +
                "iterationDescribe = #{iterationDescribe},iterationState = #{iterationState}," +
                "startTime = #{startTime},endTime = #{endTime},projectId = #{projectId}")
    int updateIteration(Iteration iteration);   //更新迭代

    @Update("update question set iterationId = #{iterationId} where questionId = #{questionId}")
    int addQuestionToIterationById(String questionId,int iterationId);   //将对应问题添加进对应迭代，即更新问题表的iterationId
    @Select("select iterationId from iteration where iterationName = #{iterationName}")
    int findIdByName(String iterationName);  //根据名字查id
}
