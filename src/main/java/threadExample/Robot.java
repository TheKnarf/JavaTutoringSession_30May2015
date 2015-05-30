package threadExample;

import java.util.Random;

/**
 * Created by knarf on 30/05/15.
 */
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
