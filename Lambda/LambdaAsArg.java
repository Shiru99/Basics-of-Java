package Lambda;


/*

    A functional Interface for which a lambda expression has invoked is called "target type" of lambda expression. 
    
    It means that if a lambda expression has invoked for some "X" interface then "X" is the target type of that lambda expression. Hence, we conclude that lambda expressions can be used only in those situations where java compiler can determine the Target Type.
*/


import java.util.*;

interface Condition{
    boolean isSuitable(Person person);
}

public class LambdaAsArg {
    public static void main(String[] args) {
        List<Person> ppl = Arrays.asList(
            new Person("Tiger", "wood", 33),
            new Person("John", "Doe", 32),
            new Person("Jenny", "Ccc", 28),
            new Person("James", "Eee", 31),
            new Person("joe", "Eee", 32)
        );

        // all people
        printPpl(ppl,(p)->true);
        System.out.println("-------");

        // ppl with first name initial - "J"
        printPpl(ppl, (p)-> p.getFirstName().startsWith("J"));

        // ppl with Age < 30
        printPpl(ppl, (p)-> p.getAge()<30);
    }

    private static void printPpl(List<Person> ppl,Condition cond) {

        System.out.println(cond.getClass().getSimpleName());

        for (Person person : ppl) {
            if(cond.isSuitable(person)){
                System.out.println(person);
            }
        }
    }
}
