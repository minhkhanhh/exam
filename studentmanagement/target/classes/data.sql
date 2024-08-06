-- Drop tables if they exist
DROP TABLE IF EXISTS student_score_t;
DROP TABLE IF EXISTS student_t;
DROP TABLE IF EXISTS subject_t;

-- Create tables
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
                                 CONSTRAINT fk_student_id FOREIGN KEY (student_id) REFERENCES student_t(student_id),
                                 CONSTRAINT fk_subject_id FOREIGN KEY (subject_id) REFERENCES subject_t(subject_id)
);

-- Insert sample data
INSERT INTO subject_t (subject_code, subject_name, credit) VALUES
                                                               ('JAVA', 'Java Programming', 4),
                                                               ('PHP', 'PHP Programming', 3),
                                                               ('WDA', 'Web Development and Applications', 3);

INSERT INTO student_t (student_code, full_name, address) VALUES
                                                             ('2007A10', 'Nguyễn Văn A', 'Hà Nội'),
                                                             ('2007A11', 'Trần Thị B', 'Hồ Chí Minh'),
                                                             ('2007A12', 'Lê Văn C', 'Đà Nẵng');

INSERT INTO student_score_t (student_id, subject_id, score1, score2) VALUES
                                                                         (1, 1, 8.5, 7.0),
                                                                         (1, 2, 9.0, 8.0),
                                                                         (2, 1, 7.5, 8.5),
                                                                         (3, 3, 6.5, 7.5);
