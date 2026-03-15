package com.github.yakupovdev.javainterviewapp;

import com.github.yakupovdev.javainterviewapp.cli.InterviewQuestionCli;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaInterviewApp implements CommandLineRunner {

    private final InterviewQuestionCli interviewQuestionCli;

    public JavaInterviewApp(InterviewQuestionCli interviewQuestionCli) {
        this.interviewQuestionCli = interviewQuestionCli;
    }

    public static void main(String[] args) {
        SpringApplication.run(JavaInterviewApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        interviewQuestionCli.run();
    }
}
