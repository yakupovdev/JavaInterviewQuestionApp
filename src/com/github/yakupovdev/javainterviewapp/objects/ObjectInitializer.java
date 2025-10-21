package com.github.yakupovdev.javainterviewapp.objects;

import com.github.yakupovdev.javainterviewapp.cli.InterviewQuestionCli;
import com.github.yakupovdev.javainterviewapp.controller.InterviewQuestionController;
import com.github.yakupovdev.javainterviewapp.dao.inmemory.InMemoryQuestionDaoImpl;
import com.github.yakupovdev.javainterviewapp.service.InterviewQuestionService;
import com.github.yakupovdev.javainterviewapp.service.mapper.InterviewQuestionMapper;

public class ObjectInitializer {
    private final InMemoryQuestionDaoImpl inMemoryQuestionDao =  new InMemoryQuestionDaoImpl();
    private final InterviewQuestionMapper interviewQuestionMapper = new InterviewQuestionMapper();
    private final InterviewQuestionService interviewQuestionService = new InterviewQuestionService(inMemoryQuestionDao, interviewQuestionMapper);
    private final InterviewQuestionController interviewQuestionController = new InterviewQuestionController(interviewQuestionService);
    private final InterviewQuestionCli interviewQuestionCli = new InterviewQuestionCli(interviewQuestionController);

    public void run(){
        interviewQuestionCli.run();
    }

}
