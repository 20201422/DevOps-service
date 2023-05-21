package com.coop.devopsservice.serviceImpl;

import com.coop.devopsservice.entity.Iteration;
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
    public void addIteration(Iteration iteration) {
        iterationMapper.addIteration(iteration);
    }

    @Override
    public void deleteIterationById(int iterationId) {
        iterationMapper.deleteIterationById(iterationId);
    }

    @Override
    public void updateIteration(Iteration iteration) {
        iterationMapper.updateIteration(iteration);
    }

    public IterationMapper getIterationMapper() {
        return iterationMapper;
    }

    public void setIterationMapper(IterationMapper iterationMapper) {
        this.iterationMapper = iterationMapper;
    }
}
