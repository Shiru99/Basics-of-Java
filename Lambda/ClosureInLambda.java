package Lambda;

/*
    Closures are the inline-function valued expressions which means that they are the class functions with bounded variables. Closures can be passed to another function as a parameter. A closure gives us access to the outer function from an inner function.

        A closure is a combination of a function bundled together (enclosed) with references to its surrounding state

        A closure gives you access to an outer function’s scope from an inner function

*/
import java.util.function.*;

public class ClosureInLambda {
    public static void main(String[] args) {

        int a = 9;
        int b = 102;
        
        a = 8;
        process(a,(p)-> {System.out.println((++p)+(b));} );     // compilers -> takes frozen value of b


        /* Error - Local variable b defined in an enclosing scope must be final or effectively final */ 

        // b++;  
        // process(a,(p)-> {System.out.println(p+(++b));} );
    }

    
    private static void process(int a, Consumer<Integer> c) {
        c.accept(a);
    }
}