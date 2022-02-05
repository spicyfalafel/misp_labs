package lab4.mbeans;

import lab4.Shot;

import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class ShotCounter extends NotificationBroadcasterSupport implements ShotCounterMBean {
    private long countOfAllShots = 0;
    private long countOfSuccessfulShots = 0;

    @Override
    public void addShot(Shot shot) {
        countOfAllShots++;
        if (shot.isSuccessful()) {
            countOfSuccessfulShots++;
        } else {
            Notification notification = new Notification("Missed shot",
                    this, System.currentTimeMillis(), "[x=" + shot.getX() +
                    ", y=" + shot.getY() + "r=" + shot.getR() + "]: Shot is out of range.");
            this.sendNotification(notification);
        }
    }

    @Override
    public long getCountOfAllShots() {
        return countOfAllShots;
    }

    @Override
    public long getCountOfSuccessfulShots() {
        return countOfSuccessfulShots;
    }
}
