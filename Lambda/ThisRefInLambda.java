package Lambda;

import java.util.function.Consumer;

public class ThisRefInLambda {

    public void doOne() {
        System.out.println("Object Method : ");
        // System.out.println(this);           // Lambda.ThisRefInLambda@6ff3c5b5
    }

    public void doTwo(int i, Consumer c) {
        // System.out.println(this);           // Lambda.ThisRefInLambda@6ff3c5b5
        c.accept(i);
    }

    public void execute() {

        doTwo(9, (i) -> {
            System.out.println(this);       // Lambda.ThisRefInLambda@6ff3c5b5
            /* 
                lambda doesn't override 'this reference' (like closure).
                 
                So here this == class instance in which lambda defined
            */
            System.out.println(i);
        });
    }

    public static void main(String[] args) {

        ThisRefInLambda obj = new ThisRefInLambda();
        obj.doOne();

        // System.out.println(this); // Error - Cannot use this in a static context
        /* this have no sense in static methods */

        obj.doTwo(9, (i) -> {
            // System.out.println(this);
            /*
             * Error - Cannot use this in a static context
             * 
             * lambda doesn't override 'this reference' (like closure)
             */

            System.out.println(i);
        });

        obj.execute();

    }
}
