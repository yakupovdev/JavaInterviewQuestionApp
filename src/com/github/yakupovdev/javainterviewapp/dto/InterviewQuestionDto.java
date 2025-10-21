package com.github.yakupovdev.javainterviewapp.dto;

public class InterviewQuestionDto {
    private final Integer id;
    private final String question;
    private final String answer;

    public InterviewQuestionDto(Integer id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public InterviewQuestionDto(String question, String answer) {
        this(null,question,answer);
    }

    public Integer getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
