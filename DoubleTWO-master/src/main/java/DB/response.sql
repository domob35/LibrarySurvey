응답 테이블

CREATE TABLE response (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,  -- 응답 번호
    question_id BIGINT NOT NULL,           -- 질문 항목 참조
    identity_id BIGINT NOT NULL,           -- 신원 참조
    response VARCHAR(255) NOT NULL,        -- 응답 내용
    FOREIGN KEY (question_id) REFERENCES question(id),  -- 외래 키 제약 (Question 참조)
    FOREIGN KEY (identity_id) REFERENCES identity(id)   -- 외래 키 제약 (Identity 참조)
);