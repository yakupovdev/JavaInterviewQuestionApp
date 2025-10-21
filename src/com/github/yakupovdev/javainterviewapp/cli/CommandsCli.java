package com.github.yakupovdev.javainterviewapp.cli;

public enum CommandsCli {
    ADD("add"),
    DELETE("delete"),
    LIST("list"),
    MENU("menu"),
    EXIT("exit"),
    UNRECOGNIZED("unrecognized");


    private final String commandLowerCase;

    private CommandsCli(String commandLowerCase) {
        this.commandLowerCase = commandLowerCase;
    }

    public String getCommandLowerCase() {
        return commandLowerCase;
    }
}
