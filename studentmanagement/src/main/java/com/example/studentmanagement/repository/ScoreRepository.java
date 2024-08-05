package com.example.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentmanagement.entity.Score;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}
