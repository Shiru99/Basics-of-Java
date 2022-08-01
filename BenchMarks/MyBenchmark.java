package BenchMarks;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

// @SuppressWarnings("ALL")
@Warmup(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(value = 3)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Benchmark)
public class MyBenchmark {

    @Param({ "10" })
    public int N = 10;

    @Benchmark
    public void sum_of_Primes_with_Stream() {
        System.out.println("Stream :");
        IntStream.range(101, 101 + N)
                .forEach(i -> calculatePrime(i * i * N))

        ;
    }

    @Benchmark
    public void sum_of_Primes_with_ParallelStream() {
        System.out.println("\n Parallel Stream :");
        IntStream.range(101, 101 + N)
                .parallel()
                .forEach(i -> calculatePrime(i * i * N));
    }

    @Benchmark
    public void init() {
        System.out.println("Hello World");
    }


    public static void main(String[] args) throws RunnerException {

    String methodName = ".sum_of_Primes_with_Stream";
    // sum_of_Primes_with_ParallelStream

    Options options = new OptionsBuilder()
    .include(MyBenchmark.class.getName()+".init")
    .build();

    new Runner(options).run();
    }

    public static int calculatePrime(int num) {
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

        System.out.println("Thread : " + Thread.currentThread().getName() + " " + num + "th prime : " + number);

        return number;
    }
}
