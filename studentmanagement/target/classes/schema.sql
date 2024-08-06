CREATE TABLE IF NOT EXISTS subject_t (
                                         subject_id INT AUTO_INCREMENT PRIMARY KEY,
                                         subject_code VARCHAR(255) NOT NULL,
    subject_name VARCHAR(255) NOT NULL,
    credit INT NOT NULL
    );

CREATE TABLE IF NOT EXISTS student_t (
                                         student_id INT AUTO_INCREMENT PRIMARY KEY,
                                         student_code VARCHAR(255) NOT NULL,
    full_name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL
    );

CREATE TABLE IF NOT EXISTS student_score_t (
                                               score_id INT AUTO_INCREMENT PRIMARY KEY,
                                               student_id INT,
                                               subject_id INT,
                                               score1 DOUBLE,
                                               score2 DOUBLE,
                                               FOREIGN KEY (student_id) REFERENCES student_t(student_id),
    FOREIGN KEY (subject_id) REFERENCES subject_t(subject_id)
    );
