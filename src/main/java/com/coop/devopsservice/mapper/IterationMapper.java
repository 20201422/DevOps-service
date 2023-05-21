package com.coop.devopsservice.mapper;

import com.coop.devopsservice.entity.Iteration;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface IterationMapper {
    @Select("select * from iteration")
    public List<Iteration> findIterations();   //查询所有迭代

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
}
