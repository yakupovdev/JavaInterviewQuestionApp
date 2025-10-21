package com.github.yakupovdev.javainterviewapp.service.mapper;

import com.github.yakupovdev.javainterviewapp.dto.InterviewQuestionDto;
import com.github.yakupovdev.javainterviewapp.model.InterviewQuestion;

public class InterviewQuestionMapper {
    public InterviewQuestion toInterviewQuestion(InterviewQuestionDto interviewQuestionDto) {
        return new InterviewQuestion(interviewQuestionDto.getId(),
                interviewQuestionDto.getQuestion(),
                interviewQuestionDto.getAnswer());
    }

    public InterviewQuestionDto toInterviewQuestionDto(InterviewQuestion interviewQuestion) {
        return new InterviewQuestionDto(interviewQuestion.getId(),
                interviewQuestion.getQuestion(),
                interviewQuestion.getAnswer());
    }
}
