package com.example.DoubleTWO.dto;

import com.example.DoubleTWO.entity.QuestionTitle;
import com.example.DoubleTWO.entity.QuestionType;

public record QuestionDTO (
        Long id, //질문항목번호
        String item,
        QuestionType questionType,//질문항목명 타입
        QuestionTitle questionTitle //질문제목에 참조
) {

}
