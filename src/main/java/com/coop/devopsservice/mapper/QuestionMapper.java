/**
 * @ClassName QuestionMapper
 * @Author 24
 * @Date 2023/5/14 17:01
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.mapper;

import com.coop.devopsservice.entity.questionEntity.Question;
import com.coop.devopsservice.entity.questionEntity.ShowQuestions;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface QuestionMapper {
    
    @Select("select question.*, userName\n" +
            "from question\n" +
            "left outer join user on question.userId = user.userId;")
    List<ShowQuestions> findQuestions(); // 查找所有问题

    @Select("select * from question where questionId = #{questionId}")
    Question findQuestionById(String questionId);   // 查找某一个问题根据id
    
    @Insert("insert into question " +
            "values(null, #{questionId}, #{questionName}, #{questionDescribe}, #{questionPriority}, #{questionState}, " +
            "#{beginTime}, #{endTime}, #{projectId}, #{userId}, #{epicId}, #{iterationId})")
    int addQuestion(Question question); // 增加一个问题
    
    @Delete("delete from question where id = #{questionId}")
    int deleteQuestionById(String questionId);  // 删除一个问题
    
    @Update("update question " +
            "set questionId = #{questionId}, questionName = #{questionName}, questionDescribe = #{questionDescribe}, " +
            "questionPriority = #{questionPriority}, questionState = #{questionState}, " +
            "beginTime = #{beginTime}, endTime = #{endTime} projectId = #{projectId}, userId = #{userId}, " +
            "epicId = #{epicId}, iterationId = #{iterationId} " +
            "where questionId = #{questionId}")
    int updateQuestion(Question question);  // 更新问题信息
    
    @Select("select * from question where epicId = #{epicId}")
    List<Question> findQuestionsByEpicId(String epicId);
    
    @Select("select question.*, userName\n" +
            "from question\n" +
            "left outer join user on question.userId = user.userId\n" +
            "where questionState = #{state} and iterationId = #{iterationId}")
    List<ShowQuestions> findQuestionByState(int iterationId,String state);
    @Select("select question.*, userName\n" +
            "from question\n" +
            "left outer join user on question.userId = user.userId\n" +
            "where iterationId = #{iterationId}")
    List<ShowQuestions> findQuestionByIterationId(int iterationId);
}

//    may the force be with you.
//    @ClassName   QuestionMapper
//    Created by 24 on 2023/5/14.
