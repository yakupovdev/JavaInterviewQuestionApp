package com.github.yakupovdev.javainterviewapp.controller;

import com.github.yakupovdev.javainterviewapp.dto.InterviewQuestionDto;
import com.github.yakupovdev.javainterviewapp.service.InterviewQuestionService;

import java.util.List;

public class InterviewQuestionController {
    private final InterviewQuestionService service;

    public InterviewQuestionController(InterviewQuestionService service) {
        this.service = service;
    }

    public void createQuestion(InterviewQuestionDto question) {
        service.create(question);
    }

    public void deleteQuestion(int id) {
        service.delete(id);
    }

    public List<InterviewQuestionDto> getQuestions() {
        return service.getQuestions();
    }
}
