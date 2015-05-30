package threadExample;

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
