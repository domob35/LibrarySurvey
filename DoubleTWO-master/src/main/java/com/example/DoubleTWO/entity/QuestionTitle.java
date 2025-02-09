package com.example.DoubleTWO.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.patterns.TypePatternQuestions;

import java.util.List;


@Getter
@NoArgsConstructor
@Entity
public class QuestionTitle {
    // 질문
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //질문제목번호

    @Column(nullable = false)
    private String title; //질문제목명

    @OneToMany(mappedBy = "questionTitle")
    private List<Question> questions; //질문항목이랑 매칭

    @Builder
    public QuestionTitle(String title) {
        this.title = title;
    }


}
