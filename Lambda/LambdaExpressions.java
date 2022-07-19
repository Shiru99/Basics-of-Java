package Lambda;

/* 1
    LambdaExpressions :
        
            The Lambda expression is used to provide the implementation of functional interface. 

        - Java lambda expression is treated as a function, so compiler does not create .class file
        - Enable to treat functionality as a method argument, or code as data.
        - A lambda expression can be passed around as if it was an object and executed on demand.


    From Interface :

        Class which need to use only once ==> Anonymous class 
        If it's functional interface ==> Lambda
*/

/**
 * Functional Interface : contains only one abstract method but we can add
 * multiple default methods
 */
@FunctionalInterface
interface Doo {
    public void doSomething(String task);

    public default void doNothing() {
        System.out.println("Do Nothing");
    };
}

class PlayGame implements Doo {
    @Override
    public void doSomething(String task) {
        System.out.println("Class : Playing Game - " + task);
    }
}

public class LambdaExpressions {
    public static void main(String[] args) {

        // Class Object
        PlayGame cricket = new PlayGame();
        // cricket.doSomething("Cricket"); // Class : Playing Game - Cricket
        // cricket.doNothing(); // Do Nothing

        // Anonymous Class
        Doo badminton = new Doo() {
            @Override
            public void doSomething(String task) {
                System.out.println("Anonymous : Playing Game - " + task);
            }
        };
        // badminton.doSomething("Badminton"); // Anonymous : Playing Game - Badminton
        // badminton.doNothing(); // Do Nothing

        // Lambda Exp - Doo should be functional interface
        Doo playGame = (task) -> {
            System.out.println("Lambda : Playing Game - " + task);
        };

        // playGame.doSomething("Chess"); // Lambda : Playing Game - Chess
        // playGame.doNothing(); // Do Nothing

        Doo doYoga = (task) -> {
            System.out.println("Lambda : Doing Yoga - " + task);
        };
        // doYoga.doSomething("Kapalbhati"); // Lambda : Doing Yoga - Kapalbhati
        // doYoga.doNothing(); // Do Nothing

    }
}