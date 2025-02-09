package com.example.DoubleTWO.controller;

import com.example.DoubleTWO.service.ResponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class ResponseController {
    private final ResponseService responseService;

    // 설문 결과 페이지
    @GetMapping("/response")
    public String surveyCompleted(@RequestParam("questionId") Long questionId, Model model) {
        // 설문 응답 집계
        Map<String, Integer> surveyResults = responseService.getSurveyResults(questionId);

        model.addAttribute("surveyResults", surveyResults);
        return "response";
    }
}
