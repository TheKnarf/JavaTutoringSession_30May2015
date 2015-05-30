package InterfaceExample;

/**
 * Created by knarf on 30/05/15.
 */
class Robot implements Greeting, Feed {
    private int eletricity;

    public void greeting() {
        if(eletricity > 0) {
            System.out.println("Hello I'm a robot!");
            eletricity--;
        }
    }

    public void feed(int numberOfFood) {
        eletricity += numberOfFood;
        System.out.println("Im recharging");
    }

    public int getFood() {
        return eletricity;
    }
}
