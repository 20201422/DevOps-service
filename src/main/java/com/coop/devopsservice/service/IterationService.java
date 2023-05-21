package com.coop.devopsservice.service;

import com.coop.devopsservice.entity.Iteration;

import java.util.List;

public interface IterationService {
    public List<Iteration> findIterations();
    public Iteration findIterationById(int IterationId);
    public void addIteration(Iteration iteration);
    public void deleteIterationById(int IterationId);
    public void updateIteration(Iteration iteration);
}
