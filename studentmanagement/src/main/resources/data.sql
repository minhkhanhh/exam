INSERT INTO subject_t (subject_code, subject_name, credit) VALUES
                                                               ('JAVA', 'Java Programming', 4),
                                                               ('PHP', 'PHP Programming', 3),
                                                               ('WDA', 'Web Development and Applications', 3);

INSERT INTO student_t (student_code, full_name, address)
VALUES ('2007A10', 'Nguyễn Văn A', 'Hà Nội');

INSERT INTO student_score_t (student_id, subject_id, score1, score2)
VALUES (1, 1, 8.5, 7.0);
