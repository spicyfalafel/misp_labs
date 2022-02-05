package com.company.mycmds;

public class HelpCommand implements ICommand {
    public HelpCommand() {
    }

    @Override
    public void execute() {
        System.out.println(":(");
    }
}
