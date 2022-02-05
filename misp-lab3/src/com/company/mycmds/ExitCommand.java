package com.company.mycmds;

/**
 * Этот класс это команда для выхода из приложения
 */

public class ExitCommand implements ICommand {

    /**
     * конструктор ничего не делает
     */
    public ExitCommand() {
    }


    @Override
    public void execute() {
        System.exit(0);
    }
}
