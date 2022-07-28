package Asynchronous;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ExampleAsync {

    public static void main(String[] args) {

        Supplier<List<Integer>> iDSupplier = () -> Arrays.asList(2, 3, 4, 6, 7, 8);

        Function<List<Integer>, List<Person>> getPeopleWithIDs = IDs -> IDs.stream().map(ID -> new Person(ID))
                .collect(Collectors.toList());

        Consumer<List<Person>> displayPeople = people -> people.forEach(System.out::println);

        // CompletableFuture<Void> completableFuture =
        // CompletableFuture.supplyAsync(iDSupplier).thenApply(getPeopleWithIDs).thenAccept(displayPeople);
        // completableFuture.join();

        // CompletableFuture.supplyAsync(iDSupplier).thenApply(getPeopleWithIDs).thenAccept(displayPeople).join();

        // Exception Handling with CompletableFuture

        // M-1 : if error in thenApply(getPeopleWithIDs) -> exceptionally replaces
        // results with empty list
        CompletableFuture
                .supplyAsync(iDSupplier)
                .thenApply(getPeopleWithIDs)
                .exceptionally(exception -> List.of())
                .thenAccept(displayPeople)
                .join();

        // M-2:
        CompletableFuture
                .supplyAsync(iDSupplier)
                .thenApply(getPeopleWithIDs)
                .whenComplete(
                        (people, exception) -> {
                            if (exception != null) {
                                System.out.println("Exception occurred: " + exception.getMessage());
                            } else {
                                displayPeople.accept(people);
                            }
                        });


        // M-3:
        CompletableFuture.supplyAsync(iDSupplier).thenApply(getPeopleWithIDs).handle(
                (people, exception) -> {
                    if (exception != null) {
                        System.out.println("Exception occurred: " + exception.getMessage());
                    } else {
                        displayPeople.accept(people);
                    }
                    return null;
                }).join();

    }

}

class Person {
    private String name;
    private int id;

    public Person(int id) {
        this.id = id;
        this.name = "unknown";
        if (id == 6) {
            throw new RuntimeException("Exception");
        }
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
