package IntefaceExample;

/**
 * Created by knarf on 30/05/15.
 */
class Robot implements Greeting, Feed {
    public void greeting() {
        System.out.println("Hello I'm a robot!");
    }

    public void feed(int numberOfFood) {
        System.out.println("Is recharging");
    }
}
