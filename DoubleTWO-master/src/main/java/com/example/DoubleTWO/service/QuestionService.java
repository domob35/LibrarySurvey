package com.example.DoubleTWO.service;

import com.example.DoubleTWO.entity.Question;
import com.example.DoubleTWO.entity.QuestionTitle;
import com.example.DoubleTWO.entity.Response;
import com.example.DoubleTWO.repo.QuestionRepo;
import com.example.DoubleTWO.repo.QuestionTitleRepo;
import com.example.DoubleTWO.repo.ResponseRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class QuestionService {
    private final QuestionTitleRepo questionTitleRepo;
    private final QuestionRepo questionRepo;

    // 설문 제목 목록과 질문을 페이지네이션으로 가져오기
    public Page<QuestionTitle> getSurveyTitlesWithPagination(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return questionTitleRepo.findAll(pageable);
    }

    // 특정 설문 제목에 해당하는 질문들 가져오기
    public Map<Long, List<Question>> getQuestionsBySurveyId(List<QuestionTitle> titleList) {
        Map<Long, List<Question>> questionMap = new HashMap<>();

        // 각 설문 제목에 해당하는 질문들을 가져옴
        for (QuestionTitle title : titleList) {
            List<Question> questions = questionRepo.findByQuestionTitle(title);
            questionMap.put(title.getId(), questions);
        }

        return questionMap;
    }

    // 응답 저장하기
    public void saveResponse(List<Response> responses) {

    }
}
