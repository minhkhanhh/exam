package com.example.studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.studentmanagement.entity.Score;
import com.example.studentmanagement.service.ScoreService;

@Controller
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @PostMapping("/scores")
    public String addScore(@ModelAttribute Score score) {
        scoreService.save(score);
        return "redirect:/students"; // Change this to the appropriate view
    }
}
