package Lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingInLambda {
    public static void main(String[] args) {

        int nums[] = { 11, 13, 17, 19 };
        int key = 5;

        process(nums, key, (k, v) -> System.out.println(v / k));

        key = 0;
        // 7 lines of lambda fun ==> NO sense
        process(nums, key, (k, v) -> {
            try {
                System.out.println(v / k);
            } catch (ArithmeticException ae) {
                System.out.println("Error - / by Zero");
            }
        });

        key = 1;
        process(nums, key, wrapperLambda((k, v) -> System.out.println(v / k)));

        key = 0;
        process(nums, key, wrapperLambda((k, v) -> System.out.println(v / k)));
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (k, v) -> {
            System.out.print("Wrapper function : ");
            try {
                System.out.println(v / k);
            } catch (ArithmeticException ae) {
                System.out.println("Error - / by Zero");
            }
        };
    }

    private static void process(int[] nums, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : nums) {
            // try {
            System.out.print("Process function : ");
            consumer.accept(key, i);
            // } catch (ArithmeticException ae) {
            // System.out.println("/ by Zero");
            // }

        }
    }
}
