package Lambda;

import java.util.*;

public class ForEach {
    public static void main(String[] args) {
        List<Person> ppl = Arrays.asList(
            new Person("John", "Doe", 32)
        );

        // Using For Loop
        for (int i = 0; i < ppl.size(); i++) {
            System.out.println(ppl.get(i));
        }

        // Using For in loop
        for (Person person : ppl) {
            System.out.println(person);
        }

        // Using For Each
        ppl.forEach(p->System.out.println(p));
        ppl.forEach(System.out::println);
        /*
            For Multi-Core processors - for each can run parallel
        */


    }
}
