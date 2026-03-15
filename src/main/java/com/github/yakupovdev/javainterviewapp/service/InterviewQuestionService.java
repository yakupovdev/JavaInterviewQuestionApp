package com.github.yakupovdev.javainterviewapp.service;

import com.github.yakupovdev.javainterviewapp.dao.inmemory.InMemoryQuestionDaoImpl;
import com.github.yakupovdev.javainterviewapp.dto.InterviewQuestionDto;
import com.github.yakupovdev.javainterviewapp.service.mapper.InterviewQuestionMapper;

import java.util.List;

public class InterviewQuestionService {

    private final InMemoryQuestionDaoImpl storage;
    private final InterviewQuestionMapper mapper;

    public InterviewQuestionService(InMemoryQuestionDaoImpl storage,  InterviewQuestionMapper mapper) {
        this.storage = storage;
        this.mapper = mapper;
    }

    public void create(InterviewQuestionDto interviewQuestionDto) {
        storage.createQuestion(mapper.toInterviewQuestion(interviewQuestionDto));
    }

    public void delete(int id) {
        storage.deleteQuestion(id);
    }

    public List<InterviewQuestionDto> getQuestions() {
        return storage.getQuestions()
                .stream()
                .map(mapper::toInterviewQuestionDto)
                .toList();
    }
}
