package Lambda;

import java.util.*;
import java.util.function.Consumer;

public class MethodRef {

    public static void greetings() {
        System.out.println(Thread.currentThread().getName() + " : Hello There...");
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> greetings());
        t1.start();

        /*  Method reference 1 :
         * 
         *      () -> fun()     ==>     ClassName::methodName
         * 
         *      no input argument & executing method with no parameters
         */

        Thread t2 = new Thread(MethodRef::greetings);
        t2.start();




        List<Person> ppl = Arrays.asList(
            new Person("Tiger", "wood", 33), new Person("John", "Doe", 32),
            new Person("Jenny", "Ccc", 28), new Person("James", "Eee", 31),
            new Person("Ross", "tyler", 27), new Person("joe", "Eee", 32)
        );

        printPpl(ppl, (p) -> System.out.println(p));

        /*  Method reference 2 :
         * 
         *      (p) -> fun(p)     ==>     InstanceName::methodName
         */

        printPpl(ppl,System.out::println);
    }

    private static void printPpl(List<Person> ppl, Consumer<Person> c) {
        for (Person person : ppl) {
            c.accept(person);
        }
    }
}
