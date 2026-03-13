package com.example.QuizService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.QuizService.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}