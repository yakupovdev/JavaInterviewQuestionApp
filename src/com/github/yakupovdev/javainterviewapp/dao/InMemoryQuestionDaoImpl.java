package com.github.yakupovdev.javainterviewapp.dao;

import com.github.yakupovdev.javainterviewapp.model.InterviewQuestion;

import java.util.ArrayList;
import java.util.List;

public class InMemoryQuestionDaoImpl implements IQuestionDao {
    private final List<InterviewQuestion> questions = new ArrayList<>();

    @Override
    public void addQuestion(InterviewQuestion interviewQuestion){
        questions.add(interviewQuestion);
    }

    @Override
    public List<InterviewQuestion> getQuestions() {
        return questions;
    }
}
