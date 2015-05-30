package IntefaceExample;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by knarf on 30/05/15.
 */


interface Greeting {
    void greeting();
}

interface Killable {
    void kill();
}

interface Feed {
    void greeting();
    void feed(int numberOfFood);
}

class Person implements Greeting, Killable, Feed {
    String name;
    boolean isAlive = true;

    public Person(String name) {
        this.name = name;
    }

    public void greeting() {
        System.out.println("Hello I'm " + name);
    }

    public void feed(int numberOfFood) {
        if(isAlive)
            System.out.println(name + " is eating food");
    }

    public void kill() {
        System.out.println("Ouch you killed me");
        isAlive = false;
    }
}

class Robot implements Greeting, Feed {
    public void greeting() {
        System.out.println("Hello I'm a robot!");
    }

    public void feed(int numberOfFood) {
        System.out.println("Is recharging");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        List<Greeting> list = new LinkedList<Greeting>();

        list.add(new Person("Frank"));
        list.add(new Person("Ole"));
        list.add(new Person("Bob"));
        list.add(new Robot());
        list.add(new Robot());

        //list.stream().forEach();
        for(Greeting greet : list) {
            greet.greeting();

            if(greet instanceof Killable) {
                ((Killable) greet).kill();
            }

            if(greet instanceof Feed) {
                ((Feed) greet).feed(1);
            }
        }
    }
}
