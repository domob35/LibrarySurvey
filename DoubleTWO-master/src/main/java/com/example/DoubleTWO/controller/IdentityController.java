package com.example.DoubleTWO.controller;

import com.example.DoubleTWO.entity.Identity;
import com.example.DoubleTWO.entity.Major;
import com.example.DoubleTWO.service.IdentityService;
import com.example.DoubleTWO.service.MajorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main")
public class IdentityController {

    private final IdentityService identityService;
    private final MajorService majorService;

    @GetMapping
    public String getSurveyPage(Model model) {
        List<Identity> identities = identityService.getAllIdentities();
        List<Major> majors = majorService.getAllMajors();
        model.addAttribute("identities", identities);
        model.addAttribute("majors", majors);
        return "main";
    }
}
