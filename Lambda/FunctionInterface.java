/*
    docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

    Java 8 has defined a lot of functional interfaces to be used extensively in lambda expressions
    so need to create new functional interface

*/

package Lambda;

import java.util.*;
import java.util.function.*;

public class FunctionInterface {
    public static void main(String[] args) {
        List<Person> ppl = Arrays.asList(
            new Person("Tiger", "wood", 33),
            new Person("John", "Doe", 32),
            new Person("Jenny", "Ccc", 28),
            new Person("James", "Eee", 31),
            new Person("joe", "Eee", 32)
        );

        printPpl(ppl,(p)->true,(p)-> System.out.println(p));
        System.out.println("-----");
        printPpl(ppl, (p)-> p.getFirstName().startsWith("J"),p-> System.out.println(p.getFirstName()));
        System.out.println("-----");
        printPpl(ppl, (p)-> p.getAge()<30,p->System.out.println(p.getAge()+" "+p.getFirstName()));
    }

    private static void printPpl(List<Person> ppl,Predicate<Person> predict,Consumer<Person> printDetails) {
        for (Person person : ppl) {
            if(predict.test(person)){
                printDetails.accept(person);
            }
        }
    }
}
