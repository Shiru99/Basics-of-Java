package Asynchronous;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExHTTPClient {
    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newBuilder()
                .version(Version.HTTP_2)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://www.google.com"))
                .build();

        // HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        ExecutorService executor = Executors.newSingleThreadExecutor();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenAcceptAsync(r -> {
                    System.out.println("Thread - "+Thread.currentThread().getName());
                    System.out.println(r.body().length());
                }, executor)
                .thenRun(() -> System.out.println("Done"))
                .join();

        executor.shutdown();
    }

}
