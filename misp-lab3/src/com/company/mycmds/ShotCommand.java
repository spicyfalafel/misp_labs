package com.company.mycmds;

import com.company.History;
import com.company.Main;
import com.company.point.AreaChecker;
import com.company.point.Point;
import com.company.point.PointValidator;
import com.company.reader.ConsoleReader;

import java.io.IOException;

public class ShotCommand implements ICommand {
    private final ConsoleReader consoleReader;
    private final PointValidator pointValidator;
    private final AreaChecker areaChecker;

    public ShotCommand() {
        consoleReader = new ConsoleReader();
        pointValidator = new PointValidator();
        areaChecker = new AreaChecker();
    }

    @Override
    public void execute() {
        System.out.println(Main.bundleDefault.getString("enterXYR"));
        System.out.print(">>> ");

        try {
            String input = consoleReader.read();
            String[] args = input.split(" ");

            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);
            double r = Double.parseDouble(args[2]);
            Point point = new Point(x, y, r);

            if (pointValidator.validatePoint(point)) {
                point.setHit(areaChecker.checkIfShotHitArea(point));
                History.addPoint(point);
                System.out.println(Main.bundleDefault.getString("pointadded"));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println(":(");
        }
    }
}
