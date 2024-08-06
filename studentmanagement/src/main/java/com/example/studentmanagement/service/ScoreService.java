package com.example.studentmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.studentmanagement.entity.Score;
import com.example.studentmanagement.repository.ScoreRepository;
import java.util.List;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    public Score save(Score score) {
        score.setGrade(0.3f * score.getScore1() + 0.7f * score.getScore2());
        return scoreRepository.save(score);
    }

    public List<Score> findAll() {
        return scoreRepository.findAll();
    }
}
