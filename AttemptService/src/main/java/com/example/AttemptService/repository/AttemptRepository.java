package com.example.AttemptService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.AttemptService.entity.Attempt;

public interface AttemptRepository extends JpaRepository<Attempt, Long> {
}
