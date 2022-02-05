package lab4.mbeans;

import lab4.Shot;

/*
    MBean, считающий общее число установленных пользователем точек, а также число точек,
    попадающих в область. В случае, если координаты установленной пользователем точки вышли
    за пределы отображаемой области координатной плоскости, разработанный MBean должен
    отправлять оповещение об этом событии.
*/
public interface ShotCounterMBean {
    void addShot(Shot shot);

    long getCountOfAllShots();

    long getCountOfSuccessfulShots();
}