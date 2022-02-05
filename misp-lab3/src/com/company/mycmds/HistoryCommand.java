package com.company.mycmds;

import com.company.History;
import com.company.Main;
import com.company.point.Point;

import java.util.List;

public class HistoryCommand implements ICommand {

    public HistoryCommand() {
    }

    @Override
    public void execute() {
        List<Point> points = History.getShotsHistory();
        System.out.println(Main.bundleDefault.getString("totalshots") + points.size());
        for (Point point : points) {
            System.out.println(point);
        }
    }
}
