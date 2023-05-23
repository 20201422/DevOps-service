package com.coop.devopsservice.service;

import com.coop.devopsservice.entity.iterationEntity.Iteration;

import java.util.List;

public interface IterationService {
    public List<Iteration> findIterations();
    public Iteration findIterationById(int IterationId);
    public int addIteration(Iteration iteration);
    public int deleteIterationById(int IterationId);
    public int updateIteration(Iteration iteration);
    public int addQuestionToIterationById(String questionId,int iterationId);
    public int findIdByName(String iterationName);
}
