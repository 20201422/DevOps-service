package com.coop.devopsservice.serviceImpl;

import com.coop.devopsservice.entity.iterationEntity.Iteration;
import com.coop.devopsservice.mapper.IterationMapper;
import com.coop.devopsservice.service.IterationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IterationServiceImpl implements IterationService {
    private IterationMapper iterationMapper;
    @Autowired
    public IterationServiceImpl(IterationMapper iterationMapper) {
        this.iterationMapper = iterationMapper;
    }

    public IterationServiceImpl() {
    }

    @Override
    public List<Iteration> findIterations() {
        return iterationMapper.findIterations();
    }

    @Override
    public Iteration findIterationById(int iterationId) {
        return iterationMapper.findIterationById(iterationId);
    }

    @Override
    public int addIteration(Iteration iteration) {
       return iterationMapper.addIteration(iteration);
    }

    @Override
    public int deleteIterationById(int iterationId) {
        return iterationMapper.deleteIterationById(iterationId);
    }

    @Override
    public int updateIteration(Iteration iteration) {
        return iterationMapper.updateIteration(iteration);
    }

    @Override
    public int addQuestionToIterationById(String questionId, int iterationId) {
        return iterationMapper.addQuestionToIterationById(questionId, iterationId);
    }

    @Override
    public int findIdByName(String iterationName) {
        return iterationMapper.findIdByName(iterationName);
    }


    public IterationMapper getIterationMapper() {
        return iterationMapper;
    }

    public void setIterationMapper(IterationMapper iterationMapper) {
        this.iterationMapper = iterationMapper;
    }

}
