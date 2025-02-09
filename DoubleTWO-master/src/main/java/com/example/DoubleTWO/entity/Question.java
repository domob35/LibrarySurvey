package com.example.DoubleTWO.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Question {
    // 질문 항목
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //질문항목 번호

    @Column( nullable = false)
    private String item; //질문명

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private QuestionType questionType; //질문 제목에 참조

    @ManyToOne
    @JoinColumn(name="question_title_id", nullable = false)
    private QuestionTitle questionTitle;

    @Builder
    public Question(String item,QuestionType questionType) {
        this.item = item;
        this.questionType = questionType;
    }
}
