package lab4.mbeans;

import lab4.Shot;

public interface SquareCounterMBean {
    double getSquare(Shot shot);

    double getLastSquare();

}
