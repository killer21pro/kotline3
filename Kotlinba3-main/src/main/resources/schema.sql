CREATE TABLE students (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255)
);

CREATE TABLE skills (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    student_id BIGINT,
    name VARCHAR(255),
    hard BOOLEAN,
    soft BOOLEAN,
    FOREIGN KEY (student_id) REFERENCES students(id)
);
