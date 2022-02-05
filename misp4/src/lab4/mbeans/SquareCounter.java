package lab4.mbeans;

import lab4.Shot;

import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class SquareCounter extends NotificationBroadcasterSupport implements SquareCounterMBean {
    private double lastSquare;

    @Override
    public double getSquare(Shot shot) {
        double square = shot.isSuccessful() ? square(shot.getR(), getPart(shot)) : 0;
        Notification notification = new Notification("Square",
                this, System.currentTimeMillis(), "[" + shot.getX() +
                ", " + shot.getY() + ", " + shot.getR() + "], square: " + square);
        this.sendNotification(notification);
        lastSquare = square;
        return square;
    }

    @Override
    public double getLastSquare() {
        return this.lastSquare;
    }

    public int getPart(Shot shot) {
        double x = shot.getX();
        double y = shot.getY();
        if (x == 0 && y == 0) return 0;
        if (x >= 0 && y >= 0) return 2;
        if (x >= 0 && y <= 0) return 4;
        if (x <= 0 && y >= 0) return 1;
        if (x <= 0 && y <= 0) return 3;
        return 0;
    }

    /*
        1 | 2
       ---|---
        3 | 4
     */
    public double square(double r, int part) {
        switch (part) {
            case 1:
                return r / 2 * r / 2; //triangle
            case 2:
                return r / 2 * r; // rectangle
            case 4:
                return (r * r * Math.PI) / 4; // circle
            default:
                return 0;
        }
    }
}
