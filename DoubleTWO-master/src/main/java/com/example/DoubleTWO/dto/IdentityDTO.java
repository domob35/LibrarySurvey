package com.example.DoubleTWO.dto;

import com.example.DoubleTWO.entity.Major;

import java.util.List;

public record IdentityDTO (
        Long id, //신원번호
        String name, //신원명
        List<Major> major //과목리스트
) {

}
