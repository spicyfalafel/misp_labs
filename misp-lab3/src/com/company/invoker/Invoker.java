package com.company.invoker;

import com.company.mycmds.*;

import java.util.Map;
import java.util.TreeMap;

/**
 * Класс для выполнения команд. Знает команды по их именам
 */
public class Invoker {
    private final Map<String, ICommand> commands;

    public Invoker() {
        commands = new TreeMap<String, ICommand>();
        commands.put("help", new HelpCommand());
        commands.put("history", new HistoryCommand());
        commands.put("exit", new ExitCommand());
        commands.put("shot", new ShotCommand());
    }

    /**
     * выполняет команду
     * @param userCommand название команды
     * @return true если команда нашлась и выполнилась
     */
    public boolean invoke(String userCommand) {
        ICommand command = commands.get(userCommand);

        if (command != null) {
            command.execute();
            return true;
        }
        return false;
    }

}
