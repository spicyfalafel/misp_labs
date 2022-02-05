package lab4.commands;

import lab4.ShootingRangeSimulator;
import lab4.Shot;

public class HistoryCommand extends Command {
    public HistoryCommand() {
        super("history", "- список результатов предыдущих выстрелов");
    }

    @Override
    public void execute(String args, ShootingRangeSimulator shootingRangeSimulator) {
        System.out.println("Все выстрелы: ");
        int index = 1;
        for (Shot shot : shootingRangeSimulator.getShotHistory().getHistory()) {
            System.out.println((index++) + ". " + shot.fancyResult());
        }
    }
}
