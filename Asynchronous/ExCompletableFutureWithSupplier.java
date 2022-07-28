package Asynchronous;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ExCompletableFutureWithSupplier {
    public static void main(String[] args) {

        Supplier<String> supplierLambda = () -> func();

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(supplierLambda);

        try {
            Thread.sleep(1000);
            
            completableFuture.complete("Taking too long"); // after waiting for 1 sec, force complete task

            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Join is blocking Main Thread
        String results = completableFuture.join();
        System.out.println(results);

        completableFuture.obtrudeValue("Taking way too long");

        results = completableFuture.join();
        System.out.println(results);

    }

    private static String func(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Task running asynchronously on thread - "+ Thread.currentThread().getName();
    }
}
