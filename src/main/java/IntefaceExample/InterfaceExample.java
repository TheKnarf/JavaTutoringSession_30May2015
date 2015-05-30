package IntefaceExample;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by knarf on 30/05/15.
 */

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
