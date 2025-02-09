package com.example.DoubleTWO.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //응답번호

    @ManyToOne
    @JoinColumn(name="question_id", nullable = false)
    private Question question; //질문항목

    @ManyToOne
    @JoinColumn(name="identity_id", nullable = false)
    private Identity identity; //신원

    @Column(nullable = false)
    private String response; //응답

    @Builder
    public Response(Question question, Identity identity, String response) {
        this.question = question;
        this.identity = identity;
        this.response = response;
    }
}
