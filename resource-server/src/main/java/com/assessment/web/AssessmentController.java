package com.assessment.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssessmentController {

    @GetMapping("/assessments")
    public String[] getAssessments() {
        return new String[]{"Assessment 1", "Assessment 2", "Assessment 3"};
    }
}