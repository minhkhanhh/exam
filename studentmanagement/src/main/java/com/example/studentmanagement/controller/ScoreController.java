package com.example.studentmanagement.controller;

import com.example.studentmanagement.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.studentmanagement.entity.Score;
import com.example.studentmanagement.service.ScoreService;
import com.example.studentmanagement.service.StudentService;

@Controller
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/scores/new")
    public String showNewScoreForm(Model model) {
        model.addAttribute("score", new Score());
        model.addAttribute("students", studentService.findAll());
        model.addAttribute("subjects", subjectService.findAll());
        return "new_score";
    }

    @PostMapping("/scores")
    public String addScore(@ModelAttribute Score score) {
        scoreService.save(score);
        return "redirect:/students";
    }
}
