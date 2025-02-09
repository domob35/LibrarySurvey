package com.example.DoubleTWO.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
// 과목
@Getter
@NoArgsConstructor
@Entity
public class Major {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //과목번호

    @Column(nullable = false)
    private String name; //과목명

    @ManyToOne
    @JoinColumn(name="identity_id")
    private Identity identity; //신원에 참조

    @Builder
    public Major(String name, Identity identity) {
        this.name = name;
        this.identity = identity;
    }
}
