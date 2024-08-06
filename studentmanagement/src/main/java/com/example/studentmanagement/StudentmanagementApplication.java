package com.example.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class StudentmanagementApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO student_t (student_code, full_name, address) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, "2007A10", "Nguyễn Văn A", "Hà Nội");
		jdbcTemplate.update(sql, "2007A11", "Trần Thị B", "Hồ Chí Minh");
		jdbcTemplate.update(sql, "2007A12", "Lê Văn C", "Đà Nẵng");

		sql = "INSERT INTO subject_t (subject_code, subject_name, credit) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, "JAVA", "Java Programming", 4);
		jdbcTemplate.update(sql, "PHP", "PHP Programming", 3);
		jdbcTemplate.update(sql, "WDA", "Web Development and Applications", 3);

		sql = "INSERT INTO student_score_t (student_id, subject_id, score1, score2) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, 1, 1, 8.5, 7.0);
		jdbcTemplate.update(sql, 1, 2, 9.0, 8.0);
		jdbcTemplate.update(sql, 2, 1, 7.5, 8.5);
		jdbcTemplate.update(sql, 3, 3, 6.5, 7.5);
	}
}
