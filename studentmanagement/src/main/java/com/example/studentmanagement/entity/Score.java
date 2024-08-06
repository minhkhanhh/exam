package com.example.studentmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_score_t")
public class Score {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentScoreId;

    private Long studentId;
    private Long subjectId;
    private float score1;
    private float score2;

    @Transient
    private float grade;

    @PostLoad
    @PostPersist
    @PostUpdate
    public void calculateGrade() {
        this.grade = 0.3f * score1 + 0.7f * score2;
    }

    public Long getStudentScoreId() {
        return studentScoreId;
    }

    public void setStudentScoreId(Long studentScoreId) {
        this.studentScoreId = studentScoreId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public float getScore1() {
        return score1;
    }

    public void setScore1(float score1) {
        this.score1 = score1;
    }

    public float getScore2() {
        return score2;
    }

    public void setScore2(float score2) {
        this.score2 = score2;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
