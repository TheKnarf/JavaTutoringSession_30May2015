package threadExample;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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

class Human implements Runnable {

    public void run() {
        Random rnd = new Random();

        for(int i = 0; i < 10; i++) {
            int currentI = NumberWrapper.getI();
            currentI++;

            try {
                Thread.sleep(rnd.nextInt(100));
            } catch( Exception e) {

            }

            NumberWrapper.setI(currentI);
        }
    }
}

class Robot implements Runnable {

    public void run() {
        Random rnd = new Random();

        for(int i = 0; i < 10; i++) {
            int currentI = NumberWrapper.getI();
            currentI++;

            try {
                Thread.sleep(rnd.nextInt(100));
            } catch( Exception e) {

            }

            NumberWrapper.setI(currentI);
        }
    }
}


public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("threadExample.ThreadExample");

        Human human1 = new Human();
        Robot robot1 = new Robot();

        Thread humanThread = new Thread(human1);
        Thread robotThread = new Thread(robot1);

        humanThread.start();
        robotThread.start();

    }
}
