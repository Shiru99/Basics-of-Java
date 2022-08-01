package BenchMarks;

import java.sql.Time;

public class Autoboxing {
    public static void main(String[] args) {

        int N = 100_00_000;

        Time start = new Time(System.currentTimeMillis());

        int sum = 0;

        for (int i = 0; i < N; i++) {
            if ((i & 1) == 0)
                sum -= i;
            else
                sum += i;
        }

        Time e1 = new Time(System.currentTimeMillis());
        System.out.println("Time taken: " + (e1.getTime() - start.getTime()) + " ms");

        Integer Sum = 0;

        for (int i = 0; i < N; i++) {
            if ((i & 1) == 0)
                Sum -= i;
            else
                Sum += i;
        }

        Time e2 = new Time(System.currentTimeMillis());
        System.out.println("Time taken: " + (e2.getTime() - e1.getTime()) + " ms");

    }

}
