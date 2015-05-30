package InterfaceExample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by knarf on 30/05/15.
 */

public class RobotTest {

    @Test
    public void testIncreaseByOne() {
        Robot robot = new Robot();

        robot.feed(10);

        assertEquals("Food should be 10 ", robot.getFood(), 10);
    }

    @Test
    public void testShouldNeverBeLessThanZero() {
        Robot robot = new Robot();

        robot.feed(10);

        assertEquals("Food should be 10 ", robot.getFood(), 10);

        robot.greeting();

        assertEquals("Food should be 9 ", robot.getFood(), 9);

        for(int i = 0; i<10; i++)
            robot.greeting();

        assertEquals("Food should be 0", robot.getFood(), 0);

    }
}
