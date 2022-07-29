package BenchMarks;

import java.sql.Time;
import java.util.stream.IntStream;

public class StreamVsParallelStream {
    public static void main(String[] args) {

        int N = 10;

        Time start = new Time(System.currentTimeMillis());

        System.out.println("Stream :");
        IntStream.range(101, 101 + N)
                .forEach(i -> calculatePrime(i*i*N));

        Time e1 = new Time(System.currentTimeMillis());
        System.out.println("Time taken: " + (e1.getTime() - start.getTime()) + " ms");

        System.out.println("\nParallel Stream :");
        IntStream.range(101, 101 + N)
                .parallel()
                .forEach(i -> calculatePrime(i*i*N));
        
        Time e2 = new Time(System.currentTimeMillis());
        System.out.println("Time taken: " + (e2.getTime() - e1.getTime()) + " ms");

    }

    private static void calculatePrime(int num) {
        int numOfPrimeFound = 1;
        int number = 2;
        int i;

        while (numOfPrimeFound < num) {
            number++;

            for (i = 2; i * i <= number && number % i != 0; i++)
                ;

            if (i * i > number)
                numOfPrimeFound++;
        }
        System.out.println(num + "th prime : " + number);
    }

}
