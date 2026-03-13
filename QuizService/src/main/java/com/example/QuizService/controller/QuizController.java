package com.example.QuizService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.QuizService.entity.Quiz;
import com.example.QuizService.repository.QuizRepository;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    QuizRepository repo;

    @PostMapping("/create")
    public Quiz create(@RequestBody Quiz quiz){
        return repo.save(quiz);
    }

    @GetMapping("/all")
    public List<Quiz> getAll(){
        return repo.findAll();
    }
}
