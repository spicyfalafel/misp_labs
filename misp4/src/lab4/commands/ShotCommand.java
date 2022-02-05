package lab4.commands;

import lab4.ShootingRangeSimulator;
import lab4.Shot;

public class ShotCommand extends Command {
    public ShotCommand() {
        super("shot", "X Y R - выстрелить в область радиуса R по координатам X,Y");
    }

    @Override
    public void execute(String args, ShootingRangeSimulator shootingRangeSimulator) {
        String[] s = args.trim().split(" ");
        if (s.length < 3) {
            System.out.println("Недостаточно аргументов (должно быть 3, получено " + s.length + ")");
            return;
        }
        try {
            float x = Float.parseFloat(s[0]);
            float y = Float.parseFloat(s[1]);
            float r = Float.parseFloat(s[2]);
            Shot shot = shootingRangeSimulator.getHitChecker().shoot(x, y, r);

            var lastShotTime = shootingRangeSimulator.getLastShotTime();
            var now = System.currentTimeMillis();
            if (lastShotTime == null) {
                shootingRangeSimulator.setLastShotTime(now);
            } else {
                var diff = now - lastShotTime;
                shootingRangeSimulator.setLastShotTime(now);
                double square = shootingRangeSimulator.getSquareMBean().getSquare(shot);
            }
            System.out.println("fsdfs");
            shootingRangeSimulator.getShotCounterMBean().addShot(shot);

            System.out.println(shot.fancyResult());
            shootingRangeSimulator.getShotHistory().addShot(shot);
        } catch (NumberFormatException e) {
            System.out.println("Аргументы должны быть числами");
        }
    }
}
