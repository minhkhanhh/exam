package com.example.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentmanagement.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
