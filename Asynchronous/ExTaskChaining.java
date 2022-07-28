package Asynchronous;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ExTaskChaining {
    public static void main(String[] args) {

        Runnable runnableLambda = () -> System.out.println("Hello World - runnableLambda");
        Supplier<String> supplierLambda = () -> "Hello World - supplierLambda";
        Function<String, String> functionLambda = (text) -> text + "- supplierLambda";
        Consumer<String> consumerLambda = (text) -> System.out.println(text + "- consumerLambda");
        BiFunction<String, String, String> biFunctionLambda = (t1, t2) -> t1 + " " + t2 + "- from biFunctionLambda";
        BiConsumer<String, String> biConsumerLambda = (t1, t2) -> System.out
                .println(t1 + " " + t2 + "- from biConsumerLambda");

        // thenApply
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(supplierLambda)
                .thenApply(functionLambda);

        String results = completableFuture.join();
        System.out.println(results);

        // thenAccept
        CompletableFuture<Void> completableFuture2 = CompletableFuture.supplyAsync(supplierLambda)
                .thenAccept(consumerLambda);

        // thenRun
        CompletableFuture<Void> completableFuture3 = CompletableFuture.supplyAsync(supplierLambda)
                .thenRun(runnableLambda);

        CompletableFuture.runAsync(runnableLambda).thenRun(System.out::println);

        // Multiple Tasks chaining

        CompletableFuture<String> cF1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("2 Seconds completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello from CF1";
        });

        CompletableFuture<String> cF2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2100);
                System.out.println("2.1 Seconds completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello from CF2";
        });

        // thenAcceptBoth
        // CompletableFuture<Void> CFcombined = cF1.thenAcceptBoth(cF2,
        // biConsumerLambda);
        // CFcombined.join();

        // thenCombine
        CompletableFuture<String> CFcombined2 = cF1.thenCombine(cF2, biFunctionLambda);
        results = CFcombined2.join();
        System.out.println(results);

    }

}
