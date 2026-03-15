package com.github.yakupovdev.javainterviewapp.dao.inmemory;

import com.github.yakupovdev.javainterviewapp.dao.IQuestionDao;
import com.github.yakupovdev.javainterviewapp.model.InterviewQuestion;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryQuestionDaoImpl implements IQuestionDao {
    private final AtomicInteger lastId;
    private final List<InterviewQuestion> questions;

    public InMemoryQuestionDaoImpl() {
        this.questions = new CopyOnWriteArrayList<>();
        this.lastId = new AtomicInteger(0);
    }

    @Override
    public void createQuestion(InterviewQuestion interviewQuestion) {
        int id = generateId();
        questions.add(new InterviewQuestion(id, interviewQuestion.getQuestion(), interviewQuestion.getAnswer()));
    }

    @Override
    public void deleteQuestion(int id) {
        questions.removeIf(interviewQuestion -> interviewQuestion.getId() == id);
    }

    @Override
    public List<InterviewQuestion> getQuestions() {
        return questions;
    }

    private int generateId() {
        return lastId.incrementAndGet();
    }
}

