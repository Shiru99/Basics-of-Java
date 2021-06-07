package Lambda;

/*
    From Interface :

        Class which need to use only once ==> Anonymous class 
        If it's functional interface ==> Lambda e.g. Runnable or comparator


 */

public class RunnableUsingLambda {
    public static void main(String[] args) {

        // Anonymous implementation
        Thread anonymousThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous : anonymousThread is running");
            }
        });
        anonymousThread.start();

        Thread lambdaThread = new Thread(()->System.out.println("Lambda : lambdaThread is running"));
        lambdaThread.start();
    }
}
