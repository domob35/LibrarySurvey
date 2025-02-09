package com.example.DoubleTWO.controller;

import com.example.DoubleTWO.entity.Question;
import com.example.DoubleTWO.entity.QuestionTitle;
import com.example.DoubleTWO.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/survey")
public class QuestionController {

    private final QuestionService questionService;

    // 설문 제목과 질문을 페이지네이션으로 가져오기
    @GetMapping
    public String getSurveyPage
    (@RequestParam(value = "page", defaultValue = "0") int page, Model model) {
        int size = 10;  // 한 페이지에 표시할 설문 제목 수

        // 페이지네이션으로 설문 제목 목록 가져오기
        Page<QuestionTitle> titlePage =
                questionService.getSurveyTitlesWithPagination(page, size);
        List<QuestionTitle> titleList = titlePage.getContent();

        // 설문 제목에 해당하는 질문 목록 가져오기
        Map<Long, List<Question>> questionMap =
                questionService.getQuestionsBySurveyId(titleList);

        model.addAttribute("titleList", titleList);
        model.addAttribute("questionMap", questionMap);  // questionMap을 모델에 추가
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", titlePage.getTotalPages());

        return "survey";  // survey.html로 반환
    }
}

     //설문 응답 저장
//    @PostMapping("/response")
//    public String saveSurveyResponse(@RequestParam Map<String, String> responses, Model model) {
//        // responses에서 응답 정보를 받아서 저장하는 로직 추가
//        // 여기서는 임시로 출력
//        responses.forEach((questionId, answer) -> {
//            System.out.println("Question ID: " + questionId + ", Answer: " + answer);
//        });
//
//        // 실제로 응답을 저장하는 로직은 QuestionService의 saveResponse 메서드에서 처리
//        // questionService.saveResponse(responses);
//
//        model.addAttribute("message", "설문 응답이 저장되었습니다.");
//        return "surveyResult";  // 결과 페이지로 이동 (응답을 저장한 후)
//    }
//}
