package com.example.DoubleTWO.dto;

import com.example.DoubleTWO.entity.Identity;
import com.example.DoubleTWO.entity.Question;
import com.example.DoubleTWO.entity.QuestionType;

import java.util.List;

public record QuestionTitleDTO (
        Long id, //질문제목 번호
        String title, //질문제목명//
        List<Question> questions, //질문 항목에 매칭
        Identity identity //신원에 참조
) {

}
