package Asynchronous;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExCompletableFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        // without executor : Runs on daemon thread (ForKJoinPool by default) - Main thread doesn't wait for daemon thread to finish
        CompletableFuture.runAsync(() -> func(),executor);
        
        // Thread.sleep(3000);
        executor.shutdown();
    }

    private static void func(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Task running asynchronously on thread - "+ Thread.currentThread().getName());
    }
}
