package lab4;

import lab4.commands.*;
import lab4.mbeans.ShotCounter;
import lab4.mbeans.ShotCounterMBean;
import lab4.mbeans.SquareCounter;
import lab4.mbeans.SquareCounterMBean;

import javax.management.JMException;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShootingRangeSimulator {
    private final Map<String, Command> commandMap = new HashMap<>();
    private final ShotHistory shotHistory = new ShotHistory();
    private final HitChecker hitChecker = new HitChecker();

    private Long lastShotTime = null;

    // MBeans
    private final ShotCounterMBean shotCounterMBean = new ShotCounter();
    private final SquareCounterMBean squareCounterMBean = new SquareCounter();

    public ShootingRangeSimulator() {
        addCommands(
                new ExitCommand(),
                new HelpCommand(),
                new HistoryCommand(),
                new ShotCommand()
        );
    }

    private void addCommands(Command... commands) {
        for (Command command : commands) {
            commandMap.put(command.getName(), command);
        }
    }

    private void initMBeans() {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        try {
            mbs.registerMBean(shotCounterMBean, new ObjectName("lab4.mbeans:type=ShotCounter"));
            mbs.registerMBean(squareCounterMBean,  new ObjectName("lab4.mbeans:type=SquareCounter"));
        } catch (JMException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        initMBeans();
        Scanner scanner = new Scanner(System.in);
        String input;
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.print("> ");
            input = scanner.nextLine();
            if (input.trim().length() == 0) continue;
            parseAndExecute(input.trim());
        }
    }

    public void parseAndExecute(String input) {
        String[] s = input.split(" ");
        String key = s[0];
        String args = input.substring(s[0].length());
        Command command = commandMap.get(key);
        if (command != null) command.execute(args, this);
        else System.out.println("Такой команды нет, список команд: help");
    }

    public Map<String, Command> getCommandMap() {
        return commandMap;
    }

    public ShotHistory getShotHistory() {
        return shotHistory;
    }

    public HitChecker getHitChecker() {
        return hitChecker;
    }

    public Long getLastShotTime() {
        return lastShotTime;
    }

    public void setLastShotTime(Long lastShotTime) {
        this.lastShotTime = lastShotTime;
    }

    public ShotCounterMBean getShotCounterMBean() {
        return shotCounterMBean;
    }

    public SquareCounterMBean getSquareMBean() {
        return squareCounterMBean;
    }
}
