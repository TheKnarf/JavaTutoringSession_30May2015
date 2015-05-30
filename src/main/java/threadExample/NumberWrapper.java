package threadExample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by knarf on 30/05/15.
 */
class NumberWrapper {
    private static int i = 0;
    private static Lock lock = new ReentrantLock();

    public static int getI() {
        lock.lock();
        return NumberWrapper.i;
    }

    public static void setI(int i) {
        NumberWrapper.i = i;
        System.out.println("I was set to " + NumberWrapper.i);
        lock.unlock();
    }
}
