package com.example.DoubleTWO.service;

import com.example.DoubleTWO.entity.Response;
import com.example.DoubleTWO.repo.ResponseRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ResponseService {
    private final ResponseRepo responseRepo;

    // 응답 저장 메소드
    public void saveResponse(List<Response> responses) {
        responseRepo.saveAll(responses);
    }

    // 설문 응답 집계 메소드
    public Map<String, Integer> getSurveyResults(Long questionId) {
        List<Response> responses = responseRepo.findAll(); // 모든 응답 조회
        Map<String, Integer> resultMap = new HashMap<>();

        // 응답을 집계 (여기에서는 단순히 답변 수를 집계하는 예시)
        for (Response response : responses) {
            if (response.getQuestion().getId().equals(questionId)) {
                String answer = response.getResponse();
                resultMap.put(answer, resultMap.getOrDefault(answer, 0) + 1);
            }
        }

        return resultMap;
    }
}