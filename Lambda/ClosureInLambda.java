package Lambda;

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