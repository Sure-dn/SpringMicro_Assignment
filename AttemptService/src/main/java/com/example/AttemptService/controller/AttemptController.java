package com.example.AttemptService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AttemptService.entity.Attempt;
import com.example.AttemptService.repository.AttemptRepository;


@RestController
@RequestMapping("/attempt")
public class AttemptController {

    @Autowired
    AttemptRepository repo;

    @PostMapping("/submit")
    public Attempt submit(@RequestBody Attempt attempt){
        return repo.save(attempt);
    }
}