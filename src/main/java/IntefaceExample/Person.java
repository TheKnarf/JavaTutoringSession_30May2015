package IntefaceExample;

/**
 * A person class
 * @author Frank Lyder Bredland
 */
class Person implements Greeting, Killable, Feed {
    String name;
    boolean isAlive = true;

    /**
     * Constructor for creating a new person
     * @param name The name of the new person
     */
    public Person(String name) {
        this.name = name;
    }

    public void greeting() {
        System.out.println("Hello I'm " + name);
    }

    /**
     * Feed the human
     * @param numberOfFood Number of pizza slices to feed the human with
     */
    public void feed(int numberOfFood) {
        if(isAlive)
            System.out.println(name + " is eating food");
    }

    public void kill() {
        System.out.println("Ouch you killed me");
        isAlive = false;
    }
}
