CREATE TABLE student_t (
                           student_id INT AUTO_INCREMENT PRIMARY KEY,
                           student_code VARCHAR(20) NOT NULL,
                           full_name VARCHAR(100) NOT NULL,
                           address VARCHAR(255)
);
CREATE TABLE subject_t (
                           subject_id INT AUTO_INCREMENT PRIMARY KEY,
                           subject_code VARCHAR(20) NOT NULL,
                           subject_name VARCHAR(100) NOT NULL,
                           credit INT NOT NULL
);
CREATE TABLE student_score_t (
                                 student_score_id INT AUTO_INCREMENT PRIMARY KEY,
                                 student_id INT,
                                 subject_id INT,
                                 score1 DECIMAL(5,2),
                                 score2 DECIMAL(5,2),
                                 constraint fk_student_id FOREIGN KEY (student_id) references
                                     student_t(student_id),
                                 constraint fk_subject_id FOREIGN KEY (subject_id) references
                                     subject_t(subject_id)
);
// INSERT sample data
INSERT INTO subject_t (subject_code, subject_name, credit) VALUES
('JAVA', 'Java Programming', 4),
('PHP', 'PHP Programming', 3),
('WDA', 'Web Development and Applications', 3);
INSERT INTO student_t (student_code, full_name, address)
VALUES ('2007A10', 'Nguyễn Văn A', 'Hà Nội');
INSERT INTO student_score_t (student_id, subject_id, score1,score2)
VALUES (1, 1, 8.5,7.0);