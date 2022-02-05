package com.company;

import com.company.point.Point;

import java.util.ArrayList;
import java.util.List;

public class History {
    private static final List<Point> shotsHistory = new ArrayList<Point>();

    public static List<Point> getShotsHistory() {
        return shotsHistory;
    }

    public static void addPoint(Point point) {
        shotsHistory.add(point);
    }
}
