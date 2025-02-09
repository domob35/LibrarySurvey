package com.example.DoubleTWO.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

//신원정보
@Getter
@NoArgsConstructor
@Entity
public class Identity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //신원 번호

    @Column(nullable = false)
    private String name; //신원명

    @OneToMany(mappedBy = "identity")
    private List<Major> majors; //과목이랑 매칭

    @Builder
    public Identity(String name) {
        this.name = name;
    }
}
