package com.coop.devopsservice.serviceImpl;

import com.coop.devopsservice.entity.iterationEntity.Iteration;
import com.coop.devopsservice.mapper.IterationMapper;
import com.coop.devopsservice.service.IterationService;
import java.util.List;

public class IterationServiceImpl implements IterationService {
    private IterationMapper iterationMapper;

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

    public IterationMapper getIterationMapper() {
        return iterationMapper;
    }

    public void setIterationMapper(IterationMapper iterationMapper) {
        this.iterationMapper = iterationMapper;
    }
}
