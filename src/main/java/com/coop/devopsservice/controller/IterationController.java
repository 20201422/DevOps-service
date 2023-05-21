package com.coop.devopsservice.controller;

import com.coop.devopsservice.serviceImpl.IterationServiceImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IterationController {
    private IterationServiceImpl iterationService;

    public IterationController(IterationServiceImpl iterationService) {
        this.iterationService = iterationService;
    }

    public IterationController() {
    }

}
