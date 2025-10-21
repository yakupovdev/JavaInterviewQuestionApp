package com.github.yakupovdev.javainterviewapp.dao;

import com.github.yakupovdev.javainterviewapp.model.InterviewQuestion;

import java.util.List;

public interface IQuestionDao {
    void createQuestion(InterviewQuestion interviewQuestion);
    void deleteQuestion(int id);
    List<InterviewQuestion> getQuestions();
}
