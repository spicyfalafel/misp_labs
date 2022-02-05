package com.company.point;

/**
 * Класс для проверки попадания точки в область
 */
public class AreaChecker {

    /**
     * Проверяет попадание точки в область
     * @param point точка
     * @return true если попала
     */
    public boolean checkIfShotHitArea(Point point) {
        double x = point.getX();
        double y = point.getY();
        double r = point.getR();
        return x <= 0 && x >= -r && y >= 0 && y <= r / 2 ||
                x >= 0 && y >= 0 && x * x + y * y <= r * r / 4 ||
                x <= 0 && y <= 0 && y >= -x - r;
    }
}
