package com.example.DoubleTWO.dto;

import com.example.DoubleTWO.entity.Identity;

public record MajorDTO (
        Long id, //과목번호
        String name, //과목명
        Identity identity //신원 참조
) {

}
