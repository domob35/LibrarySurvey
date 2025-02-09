package com.example.DoubleTWO.repo;

import com.example.DoubleTWO.entity.Question;
import com.example.DoubleTWO.entity.QuestionTitle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepo extends JpaRepository<Question, Long> {
    //질문 항목을 나열하기 위해 질문 제목에 매칭하도록 함
    List<Question> findByQuestionTitle(QuestionTitle questionTitle);
}
