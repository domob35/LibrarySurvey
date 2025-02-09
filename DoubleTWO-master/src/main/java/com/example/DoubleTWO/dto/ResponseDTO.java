package com.example.DoubleTWO.dto;

import com.example.DoubleTWO.entity.Question;

public record ResponseDTO (
        Long id, //응답 번호
        Question question, //질문항목에 참조
        String response //응답명
) {

}
