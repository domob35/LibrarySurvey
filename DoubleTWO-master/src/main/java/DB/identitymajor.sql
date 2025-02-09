신원 테이블

CREATE TABLE identity (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,  -- 신원 번호
    name VARCHAR(255) NOT NULL             -- 신원명
);

INSERT INTO identity (name) VALUES
("교수"),
("시간강사"),
("조교"),
("대학원생"),
("학부생"),
("직원"),
("기타");


과목 테이블

CREATE TABLE major (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,  -- 과목 번호
    name VARCHAR(255) NOT NULL,             -- 과목명
    identity_id BIGINT NOT NULL,           -- 신원 참조
    FOREIGN KEY (identity_id) REFERENCES identity(id)  -- 외래 키 제약 (Identity 참조)
);

INSERT INTO major (name) VALUES
("인문과학"),
("사회과학"),
("자연과학"),
("공학"),
("어문학"),
("예체능"),
("기타");
