package Lambda;

import java.util.*;

public class ComparatorUsingLambda {
    public static void main(String[] args) {
        List<Person> ppl = Arrays.asList(new Person("John", "Doe", 32), new Person("Jenny", "Ccc", 28),
                new Person("James", "Eee", 31));

        Collections.sort(ppl, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getFirstName().compareTo(p2.getFirstName());
            }
        });

        for (Person person : ppl)
            System.out.println(person);
        System.out.println("---");

        Collections.sort(ppl, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));

        for (Person person : ppl)
            System.out.println(person);
        System.out.println("---");

        Collections.sort(ppl, (Person p1, Person p2) -> p1.getAge()-p2.getAge());

        for (Person person : ppl)
            System.out.println(person);
    }
}