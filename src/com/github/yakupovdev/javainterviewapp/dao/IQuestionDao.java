package com.github.yakupovdev.javainterviewapp.dao;

import com.github.yakupovdev.javainterviewapp.model.InterviewQuestion;

import java.util.List;

public interface IQuestionDao {
    void addQuestion(InterviewQuestion interviewQuestion);
    List<InterviewQuestion> getQuestions();
}
