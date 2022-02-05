package com.company.point;

import java.util.Arrays;
import java.util.List;

/**
 * Класс для проверки корректности точек
 */
public class PointValidator {

    private final List<Double> xValidValues = Arrays.asList(-3.0, -2.0, -1.0, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0);

    private final List<Double> rValidValues = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);

    public PointValidator() {
    }

    public boolean validatePoint(Point point) {
        return checkX(point.getX()) && checkY(point.getY()) && checkR(point.getR());
    }

    private boolean checkX(double x) {
        if (!xValidValues.contains(x)) {
            System.out.println("[-3, -2, -1, 0, 1, 2, 3, 4, 5]");
            return false;
        }
        return true;
    }

    private boolean checkY(double y) {
        if (y < -3 || y > 5) {
            System.out.println("[-3, 5]");
            return false;
        }
        return true;
    }

    private boolean checkR(double r) {
        if (!rValidValues.contains(r)) {
            System.out.println("[1, 2, 3, 4, 5]");
            return false;
        }
        return true;
    }
}
