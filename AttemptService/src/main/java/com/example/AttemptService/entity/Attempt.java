package com.example.AttemptService.entity;

import jakarta.persistence.*;

@Entity
public class Attempt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long quizId;
    private String studentName;
    private int score;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getQuizId() { return quizId; }

    public void setQuizId(Long quizId) { this.quizId = quizId; }

    public String getStudentName() { return studentName; }

    public void setStudentName(String studentName) { this.studentName = studentName; }

    public int getScore() { return score; }

    public void setScore(int score) { this.score = score; }
}
