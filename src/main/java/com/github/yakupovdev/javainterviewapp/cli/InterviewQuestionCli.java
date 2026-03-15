package com.github.yakupovdev.javainterviewapp.cli;

import com.github.yakupovdev.javainterviewapp.controller.InterviewQuestionController;
import com.github.yakupovdev.javainterviewapp.dto.InterviewQuestionDto;

import java.util.List;
import java.util.Scanner;

public class InterviewQuestionCli {
    private final InterviewQuestionController controller;

    public InterviewQuestionCli(InterviewQuestionController controller) {
        this.controller = controller;
    }

    private final String WELCOME = "======WELCOME TO JAVA INTERVIEW QUESTION======";

    private final String MENU = """
            \nWrite the command like in brackets:
            1. Add new interview question (add)
            2. Delete interview question by Id (delete)
            3. List of interview questions (list)
            4. Exit from the App (exit)
            """;

    private final String ADD_QUESTION_MENU = """
            \n======ADD QUESTION======
            (to return, enter “menu”)
            """;

    private final String DELETE_QUESTION_MENU = """
            \n======DELETE QUESTION======
             (to return, enter “menu”)
            """;

    private final String LIST_QUESTIONS = "\n======LIST QUESTION======";

    private final String EXIT = "\n======EXIT======";


    private record ParserCommandCli(CommandsCli command, boolean successful, String errorMessage) {
    }


    public void run() {
        Scanner scanner = new Scanner(System.in);
        CommandsCli command;

        System.out.println(WELCOME);
        do {
            System.out.println(MENU);
            ParserCommandCli parsedCommand = parseCommand(scanner);
            command = parsedCommand.command;
            if (!parsedCommand.successful) {
                System.out.println(parsedCommand.errorMessage);
            } else {
                switch (command) {
                    case ADD -> addInterviewQuestion(scanner);
                    case DELETE -> deleteInterviewQuestion(scanner);
                    case LIST -> getAllQuestions();
                }
            }
        } while (!command.equals(CommandsCli.EXIT));
        scanner.close();
        System.out.println(EXIT);
    }

    private ParserCommandCli parseCommand(Scanner scanner) {
        System.out.println("Enter command:");
        try {
            String input = scanner.nextLine().trim().toUpperCase();
            CommandsCli command = CommandsCli.valueOf(input);
            return new ParserCommandCli(command, true, null);
        } catch (IllegalArgumentException e) {
            return new ParserCommandCli(CommandsCli.UNRECOGNIZED, false, "Invalid command");
        }

    }

    private void addInterviewQuestion(Scanner scanner) {
        System.out.println(ADD_QUESTION_MENU);
        System.out.println("Enter question:");
        String question = scanner.nextLine().trim();
        if (question.equalsIgnoreCase(CommandsCli.MENU.getCommandLowerCase())) {
            return;
        }
        System.out.println("Enter answer:");
        String answer = scanner.nextLine().trim();
        if (answer.equalsIgnoreCase(CommandsCli.MENU.getCommandLowerCase())) {
            return;
        }
        controller.createQuestion(new InterviewQuestionDto(question, answer));
        System.out.println("Question added successfully!");
    }

    private void deleteInterviewQuestion(Scanner scanner) {
        System.out.println(DELETE_QUESTION_MENU);
        System.out.println("Enter question id:");
        String id = scanner.nextLine().trim();
        if (id.equalsIgnoreCase(CommandsCli.MENU.getCommandLowerCase())) {
            return;
        } else {
            controller.deleteQuestion(Integer.parseInt(id));
            System.out.println("Deleted question successfully!");
        }
    }

    private void getAllQuestions() {
        System.out.println(LIST_QUESTIONS);
        List<InterviewQuestionDto> questions = controller.getQuestions();
        System.out.println("Count of questions: " + questions.size());
        questions.forEach(System.out::println);
    }
}
